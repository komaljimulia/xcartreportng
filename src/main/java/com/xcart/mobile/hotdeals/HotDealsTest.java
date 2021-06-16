package com.xcart.mobile.hotdeals;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HotDealsTest extends Utility {
    By hotDeals = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/span");
    By saleLink = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a/span");
    By sortBy = By.xpath("//span[@class='sort-by-label']");
    By clickOnAtoZ = By.xpath("//*[@id=\"XLite-Module-CDev-Sale-View-SalePage-sortby-1\"]/li[5]/a");
    By clickOnPriceLowHigh = By.xpath("//*[@id=\"XLite-Module-CDev-Sale-View-SalePage-sortby-1\"]/li[3]/a");
    By clickOnRates = By.xpath("//*[@id=\"XLite-Module-CDev-Sale-View-SalePage-sortby-1\"]/li[7]/a");
    By bestSellersLink = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span");
    By nameAtoZ = By.xpath("//*[@id=\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\"]/li[5]/a");
    By clickOnPriceHighLow = By.xpath("//*[@id=\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\"]/li[3]/a");
    By clickOnBestSellerRates = By.xpath("//*[@id=\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\"]/li[6]/a");

    public void verifySaleProductArrangeAlphabetically(){
        Reporter.log("Hover over hot Deals link: " + hotDeals.toString() + "<br>");
        mouseHoverToElement(hotDeals);
        Reporter.log("Hover over and click on Sale link:" + saleLink.toString() + "<br>");
        clickOnElement(saleLink);
        Reporter.log("Hover over Sort by:" + sortBy.toString() + "<br>");
        mouseHoverToElement(sortBy);
        Reporter.log("Click on sort by A to Z:" + clickOnAtoZ.toString() + "<br>");
        clickOnElement(clickOnAtoZ);
    }

    public void verifySaleProductsPriceArrangeLowToHigh(){
        Reporter.log("Hover over hot Deals link: " + hotDeals.toString() + "<br>");
        mouseHoverToElement(hotDeals);
        Reporter.log("Hover over and click on Sale link:" + saleLink.toString() + "<br>");
        clickOnElement(saleLink);
        Reporter.log("Hover over Sort by:" + sortBy.toString() + "<br>");
        mouseHoverToElement(sortBy);
        Reporter.log("Click on sort by Price - Low to High:" + clickOnPriceLowHigh.toString() + "<br>");
        clickOnElement(clickOnPriceLowHigh);
    }

    public void verifySaleProductArrangeByRates(){
        Reporter.log("Hover over hot Deals link: " + hotDeals.toString() + "<br>");
        mouseHoverToElement(hotDeals);
        Reporter.log("Hover over and click on Sale link:" + saleLink.toString() + "<br>");
        clickOnElement(saleLink);
        Reporter.log("Hover over Sort By:" + sortBy.toString() + "<br>");
        mouseHoverToElement(sortBy);
        Reporter.log("Click on Rates:" + sortBy.toString() + "<br>");
        clickOnElement(clickOnRates);

    }
    public void  verifyBestSellersProductsArrangeByZToA() {
        Reporter.log("Hover over hot Deals link: " + hotDeals.toString() + "<br>");
        mouseHoverToElement(hotDeals);
        Reporter.log("Click on BestSellers link: " + bestSellersLink.toString() + "<br>");
        clickOnElement(bestSellersLink);
        Reporter.log("Hover over Sort By:" + sortBy.toString() + "<br>");
        mouseHoverToElement(sortBy);
        Reporter.log("Hover over Sort By:" + sortBy.toString() + "<br>");
        clickOnElement(nameAtoZ);

    }

    public  void   verifyBestSellersProductsPriceArrangeHighToLow(){
        Reporter.log("Hover over hot Deals link: " + hotDeals.toString() + "<br>");
        mouseHoverToElement(hotDeals);
        Reporter.log("Click on BestSellers link: " + bestSellersLink.toString() + "<br>");
        clickOnElement(bestSellersLink);
        Reporter.log("Hover over Sort By:" + sortBy.toString() + "<br>");
        mouseHoverToElement(sortBy);
        Reporter.log("Click on Sort by Price - High to Low:" + clickOnPriceHighLow.toString() + "<br>");
        clickOnElement(clickOnPriceHighLow);
    }
    public  void verifyBestSellersProductsArrangeByRates() {
        Reporter.log("Hover over hot Deals link: " + hotDeals.toString() + "<br>");
        mouseHoverToElement(hotDeals);
        Reporter.log("Click on BestSellers link: " + bestSellersLink.toString() + "<br>");
        clickOnElement(bestSellersLink);
        Reporter.log("Hover over Sort By:" + sortBy.toString() + "<br>");
        mouseHoverToElement(sortBy);
        clickOnElement(clickOnBestSellerRates);
    }

    }
