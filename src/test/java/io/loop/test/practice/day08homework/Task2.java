package io.loop.test.practice.day08homework;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.DocuportUtils;
import io.loop.test.utilities.LoopcampUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

/*
task2
=============

1.go to https://loopcamp.vercel.app/web-tables.html
2. create a method to test given field for a given name
3. test type
4. test amount
5. test date
6. test street
7. test city
8. test state
9. test zip
10. test card
11. test card number
12. test exp


 */
public class Task2 extends TestBase {
    @Test
    public void testWebTables() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement name = driver.findElement(By.xpath("//td[2][text()='Alexandra Gray']"));
        name.click();

        String expectedType = "Thin Crust";
        String actualType = LoopcampUtils.returnAnyFieldFromTable(driver,"Alexandra Gray", "Type");
        assertEquals(actualType, expectedType, "Actual does not match.");

        String expectedAmount = "2";
        String actualAmount = LoopcampUtils.returnAnyFieldFromTable(driver,"Alexandra Gray", "Amount");
        assertEquals(actualAmount, expectedAmount, "Actual does not match.");

        String expectedDate = "04/15/2021";
        String actualDate = LoopcampUtils.returnAnyFieldFromTable(driver,"Alexandra Gray", "Date");
        assertEquals(actualDate, expectedDate, "Actual does not match.");

        String expectedStreet = "7, Miller Street";
        String actualStreet = LoopcampUtils.returnAnyFieldFromTable(driver,"Alexandra Gray", "Street");
        assertEquals(actualStreet, expectedStreet, "Actual does not match.");

        String expectedCity = "Chicago, IL";
        String actualCity = LoopcampUtils.returnAnyFieldFromTable(driver,"Alexandra Gray", "City");
        assertEquals(actualCity, expectedCity, "Actual does not match.");

        String expectedState= "US";
        String actualState = LoopcampUtils.returnAnyFieldFromTable(driver,"Alexandra Gray", "State");
        assertEquals(actualState, expectedState, "Actual does not match.");

        String expectedZip = "748";
        String actualZip= LoopcampUtils.returnAnyFieldFromTable(driver,"Alexandra Gray", "Zip");
        assertEquals(actualZip, expectedZip, "Actual does not match.");

        String expectedCard = "VISA";
        String actualCard= LoopcampUtils.returnAnyFieldFromTable(driver,"Alexandra Gray", "Card");
        assertEquals(actualCard, expectedCard, "Actual does not match.");

        String expectedCardNumber = "321456789012";
        String actualCardNumber= LoopcampUtils.returnAnyFieldFromTable(driver,"Alexandra Gray", "Card Number");
        assertEquals(actualCardNumber, expectedCardNumber, "Actual does not match.");

        String expectedExp = "02/24";
        String actualExp = LoopcampUtils.returnAnyFieldFromTable(driver,"Alexandra Gray", "Exp");
        assertEquals(actualExp, expectedExp, "Actual does not match.");


        driver.quit();

    }
}


