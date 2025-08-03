package io.loop.test.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //1 - Open a Chrome browser
        driver.get("https://www.google.com");

        Thread.sleep(3000);

        //Amazon
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);

        // locate the element with ID
        WebElement searchBoxWithID = driver.findElement(By.id("twotabsearchtextbox"));

        // get a text to search
        String textToSearch = "wooden spoon";

        // send the text to the input
        searchBoxWithID.sendKeys(textToSearch + Keys.RETURN);

        // add some wait
        Thread.sleep(4000);

        //4- Validate title contains:
        String expectedTitle = "Amazon";
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




/*
Task 2
================
Open Chrome browser,
Go to https://www.temu.com/,
Search for “wooden spoon”,
Validate title:,
Expected: “Temu”
 */