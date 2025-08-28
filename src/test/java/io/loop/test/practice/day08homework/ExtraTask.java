package io.loop.test.practice.day08homework;
/*
 extra task
 =============

 automate till payment
 https://app.docuport.app/company-formation/resident
 */

import io.loop.test.base.TestBase;
import org.testng.annotations.Test;

public class ExtraTask extends TestBase {
    @Test
    public void extraTask() {
        driver.get("https://app.docuport.app/company-formation/resident");

    }
}
