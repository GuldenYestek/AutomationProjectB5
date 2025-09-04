package io.loop.test.day10;
/*
    1. Go to https://loopcamp.vercel.app/index.html
    2. Scroll down to the link
     */

import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class T3_JSexecutor_scroll {
    @Test
    public void Loopcamp_scroll() {
        Driver.getDriver().get("https://loopcamp.vercel.app/index.html");
        WebElement link = Driver.getDriver().findElement(By.xpath("//a[@href='https://www.loopcamp.io/']"));

        //how to scroll
        // #1 use the action class move to element
        //Actions actions = new Actions(Driver.getDriver());
        //actions.moveToElement(link).perform();

        //actions.scrollToElement(link).perform();

        //#2 use key press
        //actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        //#3 move horizontally or vertically
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scroll(0, 5000)");

        //#4 move scroll to view
        js.executeScript("arguments[0].scrollIntoView(true)", link);
        js.executeScript("arguments[0].click()", link);
        js.executeScript("window.scrollBy(0,500)");






















    }
}
