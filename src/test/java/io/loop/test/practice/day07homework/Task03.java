package io.loop.test.practice.day07homework;

/*
task3
=============
go to https://demoqa.com/nestedframes
Validate "Child Iframe" text
Validate "Parent Iframe" text
Validate the "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame."
 */

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task03 extends TestBase {
    @Test
    public void iframeTest() throws InterruptedException {
        driver.get("https://demoqa.com/nestedframes");

        // Switch to iframe by name or id
        driver.switchTo().frame("frame1");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));

        WebElement childFrame = driver.findElement(By.xpath("//*[text()='Child Iframe']"));
        String actualChild = childFrame.getText();
        assertEquals(actualChild.trim(), "Child Iframe", "Child Iframe text does not match");

        driver.switchTo().parentFrame();
        WebElement parentFrame = driver.findElement(By.xpath("//*[text()='Parent frame']"));
        String actualParentFrame = parentFrame.getText();
        assertEquals(actualParentFrame.trim(), "Parent frame", "Parent frame text does not match");

        driver.quit();

    }
}
