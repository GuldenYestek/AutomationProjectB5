package io.loop.test.practice.day08homework;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

import static org.testng.Assert.assertEquals;

/*
task3
=============

go to https://loopcamp.vercel.app/
click "Multiple Windows" link
Validate "Powered by Loopcamp" is displayed
Validate title is "Windows"
Click - click here
Switch to new window and validate title


 */
public class Task3 extends TestBase {
    @Test
    public void TestWindows() {
        driver.get("https://loopcamp.vercel.app/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //2 click "Multiple Windows"
        WebElement multipleWindow = driver.findElement(By.xpath("//*[text()='Multiple Windows']"));
        multipleWindow.click();

        // 3 Validate "Powered by Loopcamp" is displayed
        WebElement poweredByLoopcamp = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("poweredByLoopcamp.getText()) = " + poweredByLoopcamp.getText());
        System.out.println("poweredByLoopcamp.isDisplayed()) = " + poweredByLoopcamp.isDisplayed());


        if (poweredByLoopcamp.isDisplayed()) {
            System.out.println("test pass");
        } else {
            System.out.println("test failed");
        }

        // 4 Assert: Title is “Windows”
        assertEquals(driver.getTitle(), "Windows", "Actual does not match expected");
        System.out.println("Title Windows = " + driver.getTitle());

        // 5 Click to click here
        WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHere.click();

        // 6 Switch to new window and validate title
        BrowserUtils.switchToWindow(driver,"New Window");
        String actualTitle = driver.getTitle();
        String expectedTitle = "New Window";
        assertEquals(actualTitle, expectedTitle, "Actual does not match expected");
        System.out.println("Title New Windows = " + driver.getTitle());

        }
    }



