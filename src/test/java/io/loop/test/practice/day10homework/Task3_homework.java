package io.loop.test.practice.day10homework;
/*
task3
Open browser
Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
Enter username: “Tester”
Enter password: “test”
Click to Login button
Print out count of all the links on landing page
Print out each link text on this page
 */
import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class Task3_homework extends TestBase {
    @Test
    public void smartBear_test() throws InterruptedException {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[normalize-space()='List of All Orders']")));

        List<WebElement> hrefLinks = driver.findElements(By.xpath("//a[@href]"));
        System.out.println("Count of all the links on landing page: " + hrefLinks.size());

        for (WebElement a : hrefLinks) {
            String text = a.getText().trim();
            if (text.isEmpty()) text = "[no text]";
            System.out.println(text + " -> " + a.getAttribute("href"));
        }
        driver.close();
    }
}
