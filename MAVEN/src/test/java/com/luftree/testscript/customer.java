package com.luftree.testscript;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class customer {


    @Test
    public void testReporterLog() {
        // Set up the WebDriver (in this case, ChromeDriver)
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        //WebDriver driver = new ChromeDriver();
        Reporter.log("create customer",true);
System.out.println("hello");
	System.out.println("world");
}
}
