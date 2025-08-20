package io.loop.test.day6;

import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class T3_testing_intro {

    @Test (priority = 1)
    public void test1() {
        System.out.println("Test1 is running");
        String actual = "Feyruz";
        String expected = "Nadir";
        assertEquals(actual, expected, "Actual does Not match expected");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test 2 is running");
        String actual = "Nina";
        String expected = "Nina";
        assertEquals(actual, expected, "This msg will show only if test fails");

    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before Method is running");

    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After Method is running");

    }
    @BeforeClass
    public void setUp(){
        System.out.println("Before Class is running");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("After Class is running");
    }

}
