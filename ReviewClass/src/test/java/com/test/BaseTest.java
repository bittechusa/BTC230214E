package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
WebDriver driver;
@BeforeMethod
public void openbrowser() {
driver=new ChromeDriver();
driver.get("http://www.express.com");
}
@AfterMethod
public void closebrowser() {
driver.quit();
}
}

