package io.loop.test.practice;
/*
task 2
=============
login to docuport application
logout from docuport application
Validate successful login
Validate successful logout

 */

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);



        WebElement usernameInput = driver.findElement(By.cssSelector("input#input-14"));
        usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);

        //locate password

        WebElement passwordInput = driver.findElement(By.cssSelector("input#input-15"));
        passwordInput.sendKeys(DocuportConstants.PASSWORD_CLIENT);

        //locate Login button

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        //wait time
        Thread.sleep(3000);

        // continue button

        WebElement continueButton = driver.findElement(By.cssSelector("button.v-btn.success span.v-btn__content"));
        continueButton.click();

         //wait time
        Thread.sleep(3000);
        // locate BG Batch1 Group1
        WebElement DropDownMenu = driver.findElement(By.cssSelector("span.body-1.white--text"));
        DropDownMenu.click();

        // use getText() method
        String actualDropDownMenu = DropDownMenu.getText();


        // validation
        if (actualDropDownMenu.equals(DocuportConstants.EXPECTED_DROP_DOWN_MENU)) {
            System.out.println("expected Forgot Password: \""
                    + DocuportConstants.EXPECTED_DROP_DOWN_MENU + "\", matches actual drop down menu: \"" + actualDropDownMenu + "\" => TEST PASS");
        } else {
            System.out.println("expected Forgot Password:\""
                    + DocuportConstants.EXPECTED_DROP_DOWN_MENU + "\", DOES NOT match actual drop down menu: \"" + actualDropDownMenu + "\" => TEST FAIL");
        }

        // /wait time
        Thread.sleep(3000);

        //locate logoutButton
        WebElement logoutButton = driver.findElement(By.cssSelector("#list-item-153"));
        logoutButton.click();

        // /wait time
        Thread.sleep(2000);

        WebElement loginButtonAgain = driver.findElement(By.cssSelector("button[type='submit']"));
        if (loginButtonAgain.isDisplayed()) {
            System.out.println("Logout successful => TEST PASS");
        } else {
            System.out.println("Logout failed => TEST FAIL");
        }

    }
}
