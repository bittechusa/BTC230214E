package com.test;

import org.testng.annotations.Test;

import pages.HomePage;

public class SmokeTest extends BaseTest {
HomePage hp;
@Test
public void buyashirt() {
hp=new HomePage(driver);
hp.hoveroveronmenmenu();
}
@Test
public void buyapant() {

}
}
