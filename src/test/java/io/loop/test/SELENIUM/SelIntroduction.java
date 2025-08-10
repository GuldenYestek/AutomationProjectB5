package io.loop.test.SELENIUM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
    public static void main(String[] args) {


        //Invoking Browser
        // Chrome - ChromeDriver extends -> Methods close
        // Firefox - FirefoxDriver -> Methods close
        // Safari SafariDriver -> methods close get
        // Webdriver close get
        // WebDriver methods + class methods

        //Chromedriver.exe -> Chrome browser
        // step to invoke chrome driver //
        // Selenium Manager

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



        driver.quit();




    }
}
