package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonAddToCart {

    private WebDriver driver;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(xpath = "//input[@value='Go']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[contains(text(),'Samsung Galaxy S21 Ultra')]")
    private WebElement productLink;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

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
    public void addToCart() {
        searchBox.sendKeys("Samsung Galaxy S21 Ultra");
        searchButton.click();
        productLink.click();
        addToCartButton.click();
    }
}