package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonSignIn{

    private WebDriver driver;

    @FindBy(id = "ap_email")
    private WebElement emailField;

    @FindBy(id = "ap_password")
    private WebElement passwordField;

    @FindBy(id = "signInSubmit")
    private WebElement signInButton;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void signInTest() {
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        emailField.sendKeys("blah@gmail.com");
        passwordField.sendKeys("blahblah");
        signInButton.click();
    }
}
