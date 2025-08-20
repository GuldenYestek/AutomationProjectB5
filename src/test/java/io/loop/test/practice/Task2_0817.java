package io.loop.test.practice;

/*
task2
=============
login as an advisor
go to received document
click search
click status dropdown
choose in progress
 */
import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task2_0817 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();

    }
    @Test
    public void DocuportTest() {

        // locate username
        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);

        //locate password
        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PASSWORD);

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        WebElement receivedDocument = driver.findElement(By.cssSelector("a[href='/received-docs'].doc-card"));
        receivedDocument.click();

        WebElement dropdownSearch = driver.findElement(By.xpath("//*[text()='Search']"));
        dropdownSearch.click();

        WebElement statusDropdown = driver.findElement(By.cssSelector("div[role=\"button\"]"));
        statusDropdown.click();

        WebElement inProgress = driver.findElement(By.xpath("//div[text()='In progress']"));
        inProgress.click();


    }
}
