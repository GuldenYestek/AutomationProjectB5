package io.loop.test.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TO_Temu {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");

        Thread.sleep(3000);

        driver.navigate().to("https://www.etsy.com");
        Thread.sleep(3000);


        WebElement searchBoxWithID = driver.findElement(By.id("global-enhancements-search-query"));

        String textToSearch = "wooden spoon";

        searchBoxWithID.sendKeys(textToSearch + Keys.RETURN);
        Thread.sleep(4000);

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ". => TEST PASS");
        } else {
            System.out.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ". => TEST FAIL");
        }

        //5 - Go back to Google by using the .back();
        driver.navigate().back();
        Thread.sleep(3000);

        driver.quit();
    }
}



