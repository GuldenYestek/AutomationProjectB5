package io.loop.test.practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //1 - Open a Chrome browser
        driver.get("https://www.google.com");

        Thread.sleep(3000);

        //2 - lick to Gmail from top right.
        driver.get("https://workspace.google.com/intl/en-US/gmail/");


        Thread.sleep(3000);

        //4- Validate title contains:
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ". => TEST PASS");
        } else {
            System.out.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ". => TEST FAIL");
        }

            //5 - Go back to Google by using the .back();
        driver.navigate().back();

        // Step 6: Validate title equals "Google"
        String expectedGoogleTitle = "Google";
        String currentTitle = driver.getTitle();

        if (currentTitle.equals(expectedGoogleTitle)) {
            System.out.println("TEST PASS: Title is 'Google'");
        } else {
            System.out.println("TEST FAIL: Title is NOT 'Google'. Actual: " + currentTitle);
        }
    }
}



/*
Task 1
================
1- Open a chrome browser
2- Go to: https://google.com/
3- Click to Gmail from top right.
4- Validate title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Validate title equals:
Expected: Google

Task 2
================
Open Chrome browser,
Go to https://www.temu.com/,
Search for “wooden spoon”,
Validate title:,
Expected: “Temu”

 */