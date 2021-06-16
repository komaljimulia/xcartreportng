package com.xcart.mobile.homepage;
import com.xcart.mobile.basepage.BasePage;
import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class TopMenuTest extends Utility {
    By clickOnShipping = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[3]/a/span");
    By clickONNewLink = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[4]/a/span");
    By clickOnComingSoon=By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[5]/a");
    By clickOnContactUs=By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[6]/a");



    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        Reporter.log("Clicking on shipping:" + clickOnShipping.toString() + "<br>");
        clickOnElement(clickOnShipping);

    }
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        Reporter.log("Clicking on new button:" + clickONNewLink.toString() + "<br>");
        clickOnElement(clickONNewLink);

    }
    public void veryfyUserShouldNavigateToComingSoonPageSuccessfully(){
        Reporter.log("Clicking on coming soon button:" + clickOnComingSoon.toString() + "<br>");
        clickOnElement(clickOnComingSoon);

    }
    public void veryfyUserShouldNavigateToContactUsPageSuccessfully() {
        Reporter.log("Clicking on contact us:" + clickOnContactUs.toString() + "<br>");
        clickOnElement(clickOnContactUs);

    }







}