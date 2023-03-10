package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InstagramFollow{

    private WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchField;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void followUserTest() {
        searchField.sendKeys("blah123");
        driver.findElement(By.xpath("//span[text()='blah123']")).click();
        driver.findElement(By.xpath("//button[text()='Follow']")).click();
    }
}
