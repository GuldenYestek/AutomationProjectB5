package io.loop.test.practice;

/*
task 1
=============
go to https://loopcamp.vercel.app/forgot-password.html
locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
use css
Validate those elements are displayed

 */

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        //get driver and maximize
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        //go to the url
        driver.get(LoopCampConstants.FORGOT_PASSWORD);

        //locate the Forgot Password with css and click on it

        WebElement forgotPassword = driver.findElement(By.cssSelector("div.example > h2"));

        //wait time
        Thread.sleep(3000);

        // use getText() method
        String actualForgotForm = forgotPassword.getText();

        // validation
        if (actualForgotForm.equals(LoopCampConstants.EXPECTED_HEADER_FORGOT_PASSWORD)) {
            System.out.println("expected Forgot Password: \""
                    + LoopCampConstants.EXPECTED_HEADER_FORGOT_PASSWORD + "\", matches actual forgot password: \"" + actualForgotForm + "\" => TEST PASS");
        } else {
            System.out.println("expected Forgot Password:\""
                    + LoopCampConstants.EXPECTED_HEADER_FORGOT_PASSWORD + "\", DOES NOT match actual forgot password: \"" + actualForgotForm + "\" => TEST FAIL");
        }

        //locate the E-mail label with css selector

        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        //wait time
        Thread.sleep(3000);

        // use getText() method
        String actualEmailLabel = emailLabel.getText();

        // Validate the label text
        if (actualEmailLabel.equals(LoopCampConstants.EXPECTED_EMAIL)) {
            System.out.println("expected Email label: " + LoopCampConstants.EXPECTED_EMAIL + "\", matches actual: \"" + actualEmailLabel + "\" => TEST PASS");
        } else {
            System.out.println("expected Email label: " + LoopCampConstants.EXPECTED_EMAIL + "\",  DOES NOT match actual: \"" + actualEmailLabel + "\" => TEST FAIL");
        }

        //locate the E-mail input with css selector

        WebElement emailInput = driver.findElement(By.cssSelector("input#email"));

        if (emailInput.isDisplayed()) {
            System.out.println("Email input is visible => TEST PASS");
        } else {
            System.out.println("Email input is not visible => TEST FAIL");
        }

        //locate the retrieve password with css selector

        WebElement retrievePassword = driver.findElement(By.cssSelector(".icon-signin"));

        //wait time
        Thread.sleep(3000);

        // use getText() method
        String actualRetrievePassword = retrievePassword.getText();

        // Validate the label text
        if (actualRetrievePassword.equals(LoopCampConstants.EXPECTED_RETRIEVE_PASSWORD)) {
            System.out.println("expected retrieve Password: " + LoopCampConstants.EXPECTED_RETRIEVE_PASSWORD + "\", matches actual: \"" + actualRetrievePassword + "\" => TEST PASS");
        } else {
            System.out.println("expected retrieve Password: " + LoopCampConstants.EXPECTED_RETRIEVE_PASSWORD + "\",  DOES NOT match actual: \"" + actualRetrievePassword + "\" => TEST FAIL");
        }

        //locate the powered by LOOPCAMP with css selector
        WebElement poweredByLOOPCAMP = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //wait time
        Thread.sleep(3000);

        // use getText() method
        String actualPoweredByLOOPCAMP = poweredByLOOPCAMP.getText();

        // validation
        if (actualPoweredByLOOPCAMP.equals(LoopCampConstants.EXPECTED_POWERED_BY_LOOPCAMP)) {
            System.out.println("expected powered by LOOPCAMP: \""
                    + LoopCampConstants.EXPECTED_POWERED_BY_LOOPCAMP + "\", matches actual expected powered by LOOPCAMP: \"" + actualPoweredByLOOPCAMP + "\" => TEST PASS");
        } else {
            System.out.println("expected powered by LOOPCAMP: \""
                    + LoopCampConstants.EXPECTED_POWERED_BY_LOOPCAMP + "\", DOES NOT match expected powered by LOOPCAMP: \"" + actualPoweredByLOOPCAMP + "\" => TEST FAIL");



        }

    }
}



