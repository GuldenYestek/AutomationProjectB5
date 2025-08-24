package io.loop.test.practice.day07homework;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.DocuportConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

/*
task1
=============
login as an advisor
go to received document
click search
validate that status dropdown does not allow to select multiple
validate that tags dropdown allows to select multiple

 */
public class Task01 extends TestBase {

    @Test
    public void DocuportTest() throws InterruptedException {
        driver.get("https://beta.docuport.app");

        String status1 = "In progress";
        String status2 = "Done";
        String docType1 = "Other Documents";
        String docType2 = "IRS/State Letter";
        String docType3 = "License";

        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        //locate password
        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PASSWORD);

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        Thread.sleep(1000);

        WebElement receivedDocument = driver.findElement(By.cssSelector("a[href='/received-docs'].doc-card"));
        receivedDocument.click();


        WebElement dropdownSearch = driver.findElement(By.xpath("//*[text()='Search']"));
        dropdownSearch.click();


        selectOption(status1);
        verifySelectedOption(status1);

        Thread.sleep(1000);

        selectOption(status2);
        verifySelectedOption(status2);

        Thread.sleep(1000);

        WebElement dropdownTags = driver.findElement(By.cssSelector("div:nth-of-type(3) [role='combobox']"));
        dropdownTags.click();

        selectDocTypeOption(docType1);
        selectDocTypeOption(docType2);
        selectDocTypeOption(docType3);

        verifySelectedDocTypeOptions(docType1, docType2, docType3);

    }

    public void selectOption(String option) throws InterruptedException {
        WebElement statusDropdown = driver.findElement(By.cssSelector("div[role=\"button\"]"));
        statusDropdown.click();

        Thread.sleep(1000);
        WebElement dropdownOption = driver.findElement(By.xpath("//div[text()='" + option + "']"));
        dropdownOption.click();
    }

    public void verifySelectedOption(String option) {
        List<WebElement> selectedOptions = driver.findElements(By.cssSelector(".d-page__search .v-select__selection"));
        Assert.assertEquals(selectedOptions.size(), 1, "More than one option is selected!");

        String selectedText = selectedOptions.get(0).getText();
        Assert.assertEquals(selectedText, option, "Wrong option selected!");
    }

    public void selectDocTypeOption(String docType) throws InterruptedException {
        WebElement otherDocument = driver.findElement(By.xpath("//*[text()='" + docType + "']"));
        otherDocument.click();
    }

    public void verifySelectedDocTypeOptions(String... expectedDocTypes) {
        List<WebElement> selectedOptions = driver.findElements(By.cssSelector(".v-chip.v-chip--clickable.v-chip--label"));
        Assert.assertEquals(selectedOptions.size(), expectedDocTypes.length, "Number of selected options NOT as expected!");

        List<String> actual = selectedOptions.stream()
                .map(e -> e.getText().replace("×", "").replace("close", "").trim())
                .toList();

        for (String expected : expectedDocTypes) {
            Assert.assertTrue(actual.contains(expected),
                    "Missing selected option: " + expected);
        }
        driver.quit();
    }
}
