package io.loop.test.day6;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T4_Testng_with_selenium {


    WebDriver driver;
    String actual;
    String expected;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
    }

    @Test
    public void googleTitle() {
        driver.get("https://google.com");
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Google";
        actual = driver.getTitle();
        assertEquals(actual, expected, "Actual:" + actual + " does Not match expected" + expected);
        driver.close();
    }

    @Test
    public void docuportTitle() {
        driver.get(DocuportConstants.DOCUPORT_TEST);
        System.out.println("((RemoteWebDriver) driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Docuport";
        actual = driver.getTitle();
        assertEquals(actual, expected, "Actual:" + actual + " does Not match expected" + expected);
        driver.close();
    }

}


