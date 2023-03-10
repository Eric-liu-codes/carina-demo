package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YoutubeSignIn {

    private WebDriver driver;

    @FindBy(id = "identifierId")
    private WebElement emailField;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    private WebElement nextButton;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    private WebElement passwordNextButton;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void signInTest() {
        driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Sign in')]")).click();

        emailField.sendKeys("blah@gmail.com");
        nextButton.click();

        passwordField.sendKeys("blahblah");
        passwordNextButton.click();
    }
}
