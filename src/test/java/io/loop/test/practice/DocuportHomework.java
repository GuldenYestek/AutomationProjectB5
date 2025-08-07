package io.loop.test.practice;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocuportHomework {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);

        //locate with css

        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));

        //get value of the attribute
        String actualLogoDocuport = logo.getDomAttribute("alt");
        System.out.println("docuport = " + actualLogoDocuport);

        // validation
        if(DocuportConstants.EXPECTED_LOGO_DOCUPORT.equals(actualLogoDocuport)){
            System.out.println("expected logo: \""
                    +DocuportConstants.EXPECTED_LOGO_DOCUPORT + "\", matches actual header: \"" + actualLogoDocuport+ "\" => TEST PASS");
        } else {
            System.out.println("expected logo: \""
                    +DocuportConstants.EXPECTED_LOGO_DOCUPORT + "\",does not match actual header: \"" + actualLogoDocuport+ "\" => TEST PASS");
        }
        //locate username

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

        // locate home icon

        WebElement homeIcon = driver.findElement(By.cssSelector("a.v-list-item.v-item--active"));

        String text = homeIcon.getText();

        if (text.equals("Home")) {
            System.out.println("Home label found => TEST PASS");
        } else {
            System.out.println("Home label not matched => TEST FAIL");
        }

        driver.quit();

    }

}

/*
go to docuport app
identify docuport with css
get value of the attribute
validate if it is "Docuport"

the rest is home work
locate:
username
password
login
    with css
login to docuport
locate home icon of docuport after login or any other element after login
validated that you logged in

 */