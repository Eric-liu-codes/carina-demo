package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YoutubeClickVideo {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@id='search-icon-legacy']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id='contents']/ytd-video-renderer[1]")
    private WebElement firstVideo;

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
    public void clickOnVideoTest() {
        searchField.sendKeys("How to blah");
        searchButton.click();

        firstVideo.click();
    }
}
