package io.loop.test.practice.day07homework;

import io.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/*
task2
=============
go to https://demoqa.com/alerts
click - click button to see alert
handle alert
click - On button click, alert will appear after 5 seconds
handle alert
click - On button click, confirm box will appear
click ok and validate - You selected Ok
after that do it again this time cancel and validate - You selected Cancel
click - On button click, prompt box will appear
enter "Loop Academy" and validate You entered Loop Academy

 */
public class Task02 extends TestBase {
    @Test
    public void test_handle_alert() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");

        WebElement clickButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);
        WebElement onButtonClick = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        onButtonClick.click();

        Thread.sleep(6000);
        alert.accept();

        WebElement confirmBoxAppearance = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        confirmBoxAppearance.click();
        alert.accept();

        WebElement clickOk = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String expected = "You selected Ok";
        String actual = clickOk.getText();
        assertEquals(actual, expected, "Actual does not match the expected");

        Thread.sleep(2000);
        confirmBoxAppearance.click();
        alert.dismiss();

        WebElement clickCancel = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String expectedResult = "You selected Cancel";
        String actualResult = clickCancel.getText();
        assertEquals(actualResult, expectedResult, "Actual does not match the expected");

        WebElement promptBoxAppearance = driver.findElement(By.xpath("//button[@id='promtButton']"));
        promptBoxAppearance.click();
        alert.sendKeys("Loop Academy");
        alert.accept();

        WebElement prompMessage = driver.findElement(By.xpath("//span[@id='promptResult']"));
        String expectedMessage = "You entered Loop Academy";
        String actualMessage = prompMessage.getText();
        assertEquals(actualMessage, expectedMessage, "Actual does not match the expected");

        driver.quit();
    }
}
