package io.loop.test.practice;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
task 3
=============
navigate to docuport application
validate placeholders for username and password
without sending username and password click login button
validate username and password error messages
 */
public class Task3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);

        // locate username
        WebElement usernameLabel = driver.findElement(By.cssSelector("label[for='input-14']"));

        //locate password
        WebElement passwordLabel = driver.findElement(By.cssSelector("label[for='input-15']"));

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        Thread.sleep(2000);

        WebElement usernameErrMsg= driver.findElement(By.cssSelector(".mb-4:first-of-type .v-messages__message"));
        String actualUsernameErrMsg = usernameErrMsg.getText();

        //wait time
        Thread.sleep(2000);

        // validation
        if(actualUsernameErrMsg.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_USERNAME_OR_EMAIL)){
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_USERNAME_OR_EMAIL + ", matches actual error message: " + actualUsernameErrMsg + "=> TEST PASS");
        } else {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_USERNAME_OR_EMAIL + ", Does not match actual error message: " + actualUsernameErrMsg + "=> TEST Fail");
        }

        WebElement passwordErrMsg= driver.findElement(By.cssSelector(".mb-4:nth-of-type(2) .v-messages__message"));
        String actualPasswordErrMsg = passwordErrMsg.getText();

        if(actualPasswordErrMsg.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualPasswordErrMsg + "=> TEST PASS");
        } else {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", Does not match actual error message: " + actualPasswordErrMsg + "=> TEST Fail");
        }
        driver.quit();

    }
}
