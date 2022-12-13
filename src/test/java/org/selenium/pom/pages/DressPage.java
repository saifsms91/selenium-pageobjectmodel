package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.pages.components.ProductThumbnail;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DressPage extends BasePage {
   // private final By searchFld = By.xpath("//input[@id='term-desktop']");
    private final By searchBtn = By.id("search-btn");
    private final By title = By.xpath("//h1[contains(text(),'Dell Laptops in Malaysia Price List for December, ')]");
    //product-list
    private final By productList = By.id("product-list");

    //private final By brand = By.xpath("(//label[@role='button'])[6]");
    private final By sortPrice = By.xpath("//a[@data-vars-lb='Price']//span");
    private ProductThumbnail productThumbnail;

    public DressPage(WebDriver driver) {
        super(driver);
        productThumbnail = new ProductThumbnail(driver);
    }

//    public ProductThumbnail getProductThumbnail() {
//        return productThumbnail;
//    }
//
//    private DressPage enterTextInSearchFld(String txt) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(searchFld)).sendKeys(txt);
//        return this;
//    }

    public DressPage load() {
        load("/maternity-wear/dresses/");
        return this;
    }

//    public DressPage search(String txt) {
//        enterTextInSearchFld(txt).clickSearchBtn();
//        return this;
//    }

    private DressPage clickSearchBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
        return this;
    }

//    public String getTitle() {
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(title)).getText();
//    }
//
//    public DressPage clickBrand() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(brand)).click();
//        return this;
//    }


    public DressPage sortPrice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortPrice)).click();
        return this;
    }

    public DressPage sortDress() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productList));
        List<WebElement> beforeFilterPrice = driver.findElements(By.xpath("//*[contains(@class, 'db gM ei b hE be f16-360-o ff vb uT ellipsis-1')]"));
        List<Double> beforeFilterPriceList = new ArrayList<Double>();

        for (WebElement e : beforeFilterPrice) {
            System.out.println(e.getText().replace("RM", ""));
            beforeFilterPriceList.add(Double.valueOf(e.getText().replace("RM", "")));
        }

        sortPrice();
        List<WebElement> afterFilterPrice = driver.findElements(By.xpath("//*[contains(@class, 'db gM ei b hE be f16-360-o ff vb uT ellipsis-1')]"));
        List<Double> afterFilterPriceList = new ArrayList<Double>();

        for (WebElement e : afterFilterPrice) {
            System.out.println(e.getText().replace("RM", ""));
            afterFilterPriceList.add(Double.valueOf(e.getText().replace("RM", "")));

        }

        Collections.sort(beforeFilterPriceList);
        Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);
        return this;
    }
}