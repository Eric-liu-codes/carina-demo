package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InstagramSignIn{

    private WebDriver driver;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void signInTest() {
        usernameField.sendKeys("blah123");
        passwordField.sendKeys("blahblah");
        loginButton.click();
    }
}
