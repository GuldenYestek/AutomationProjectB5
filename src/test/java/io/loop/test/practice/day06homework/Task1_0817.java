package io.loop.test.practice.day06homework;
/*
go to http://the-internet.herokuapp.com/dropdown
validate "Please select an option" is selected by default
Choose option 1 and validate that it is selected
Choose option 2 and validate that it is selected
Validate dropdown name is "Dropdown List"
 */

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

import static org.testng.Assert.assertEquals;

public class Task1_0817 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);

    }

    @Test
    public void dropdownBox() {
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        String defaultText = dropdown.getFirstSelectedOption().getText();
        String expectedText= "Please select an option";
        assertEquals(defaultText, expectedText, "Actual:" + defaultText + " does Not match expected" + expectedText);

        WebElement option1 = driver.findElement(By.xpath("//option[@value='1']"));
        System.out.println("\"Option 1\" is selected () before clicking = " + option1.isSelected());
        option1.click();
        System.out.println("\"Option 1\" is selected () after clicking = " + option1.isSelected());

        WebElement option2 = driver.findElement(By.xpath("//option[@value='2']"));
        System.out.println("\"Option 2\" is selected () before clicking = " + option2.isSelected());
        option2.click();
        System.out.println("\"Option 2\" is selected () after clicking = " + option2.isSelected());

        WebElement titleElement = driver.findElement(By.xpath("//div[@class=\"example\"]/h3"));

        String titleText = titleElement.getText();
        String expectedTitle= "Dropdown List";

        if(titleText.equals(expectedTitle)){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        driver.close();

    }
}

