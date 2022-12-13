package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.pages.components.ProductThumbnail;

public class SearchItem extends BasePage {
    private final By searchFld = By.xpath("//input[@id='term-desktop']");
    private final By searchBtn = By.id("search-btn");
    //private final By title = By.xpath("//h1[contains(text(),'Dell Laptops in Malaysia Price List for December, ')]");
    //product-list
    //private final By productList = By.id("product-list");

   // private final By brand = By.xpath("(//label[@role='button'])[6]");
   // private final By dell = By.xpath("(//span[@class='e4 __ eS'][normalize-space()='Dell'])[1]");
    private ProductThumbnail productThumbnail;

    public SearchItem(WebDriver driver) {
        super(driver);
        productThumbnail = new ProductThumbnail(driver);
    }

//    public ProductThumbnail getProductThumbnail() {
//        return productThumbnail;
//    }

//    private SearchItem enterTextInSearchFld(String txt) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(searchFld)).sendKeys(txt);
//        return this;
//    }

    public SearchItem load() {
        load("/computing/laptops/");
        return this;
    }

//    public SearchItem search(String txt) {
//        enterTextInSearchFld(txt).clickSearchBtn();
//        return this;
//    }

    private SearchItem clickSearchBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
        return this;
    }

//    public String getTitle() {
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(title)).getText();
//    }
//
//    public SearchItem clickBrand() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(brand)).click();
//        return this;
//    }

//    public SearchItem clickDell() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(dell)).click();
//        return this;
//    }

//    public StorePage productList(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(productList)).click();
//        return this;
//    }

//    public StorePage selectAnOption() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(productList));
//        List<WebElement> choice = driver.findElements(By.id("product-list"));
//
//        for(WebElement e : choice){
//            System.out.println(e.getText()+"This is dell");
//
//        } return this;
//    }
}
//