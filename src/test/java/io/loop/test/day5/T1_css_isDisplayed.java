package io.loop.test.day5;


/*
/*
    https://the-internet.herokuapp.com/forgot_password
     */

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class T1_css_isDisplayed {
    public static void main(String[] args) {


        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(GeneralConstants.HEROKUAPP);


        WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));

        System.out.println("forgotPasswordHeading.getText()) = " + forgotPasswordHeading.getText());

        System.out.println("forgotPasswordHeading.isDisplayed()) = " + forgotPasswordHeading.isDisplayed());


        if (forgotPasswordHeading.isDisplayed()) {
            System.out.println("test pass");
        } else {
            System.out.println("test failed");

        }
    }
}


