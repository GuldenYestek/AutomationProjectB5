package io.loop.test.day6;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertTrue;

/*
1. Open Chrome browser
2. Go to https://demoqa.com/select-menu
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.
 */
public class T7_Multi_dropdown {


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void multiSelect() {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));

        // there is a method
        assertTrue(dropdown.isMultiple(), "Dropdown is not multi select");
/*
        dropdown.selectByIndex(0);
        dropdown.selectByValue("saab");
        dropdown.selectByVisibleText("Opel");
        dropdown.deSelectByContainsVisibleText("Au");
*/

        List<WebElement> options;
        options = dropdown.getOptions();

        /*
        for(WebElement option: options){
            option.click();
            System.out.println("option.getText () = " + option.getText());
        }
        */

/*
        options.forEach(option -> {
            option.click();
            System.out.println("option.getText () = " + option.getText());
        });


    }
*/
options.forEach(WebElement::click);
dropdown.deselectAll();

    }
}
