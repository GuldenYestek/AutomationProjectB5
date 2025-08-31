
package io.loop.test.practice.day08homework;
/*
 extra task
 =============

 automate till payment
 https://app.docuport.app/company-formation/resident
 */
/*
import io.loop.test.base.TestBase;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExtraTask extends TestBase {
    @Test
    public void extraTask() throws InterruptedException {
        driver.get("https://app.docuport.app/company-formation/resident");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement typeOfBusiness = driver.findElement(By.xpath("//*[text()='Corporation']"));
        typeOfBusiness.click();

        WebElement formationState = driver.findElement(By.xpath("//*[text()='Maryland']"));
        formationState.click();

        Thread.sleep(1000);

        WebElement companyName = driver.findElement(By.xpath("//input[@id='input-103']"));
        companyName.sendKeys("Maryland crabs");
/*
        Thread.sleep(1000);

        WebElement DBA = driver.findElement(By.xpath("//label[@for='input-80']"));
        companyName.sendKeys("crabs");

        WebElement industry = driver.findElement(By.xpath("//input[@data-gtm-form-interact-field-id='0']"));
        industry.click();

        WebElement industryDropDown = driver.findElement(By.xpath("//*[text()='Food Services']"));







    }
}
*/