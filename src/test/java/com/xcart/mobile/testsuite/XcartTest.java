package com.xcart.mobile.testsuite;
import com.xcart.mobile.customelisteners.CustomeListnerers;
import com.xcart.mobile.homepage.TopMenuTest;
import com.xcart.mobile.hotdeals.HotDealsTest;
import com.xcart.mobile.shopping.*;
//import com.xcart.mobile.shopping.ShoppingTest;
import com.xcart.mobile.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomeListnerers.class)

public class XcartTest extends TestBase{
TopMenuTest topMenuTest= new TopMenuTest();
HotDealsTest hotDealsTest=new HotDealsTest();
ShoppingTest shoppingTest=new ShoppingTest();

//This tests are for topmenu
    @Test(groups = {"Sanity", "Smoke", "Regression"})
    public void navigateToShippingPageTest() throws InterruptedException {//sanity,smoke,reression
        topMenuTest.verifyUserShouldNavigateToShippingPageSuccessfully();
      //  Thread.sleep(3000);
        String expectedText = "Shipping";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Shipping']"));
        Assert.assertEquals(actualText, expectedText, "User Is Not On Shipping page");
    }
@Test(groups = { "Smoke", "Regression"})
    public void navigateToNewPageTest() throws InterruptedException {//sanity and regression
       topMenuTest.verifyUserShouldNavigateToNewPageSuccessfully();
      // Thread.sleep(3000);
        String expectedNew = "New arrivals";
        String actualNew = getTextFromElement(By.xpath("//h1[text()='New arrivals']"));
        Assert.assertEquals(actualNew, expectedNew, "User Is Not On New Arrival Page");
    }
    @Test(groups = {"Regression"})
    public void navigateToComingSoonPageTest() throws InterruptedException {//regression
        topMenuTest.veryfyUserShouldNavigateToComingSoonPageSuccessfully();
        //Thread.sleep(3000);
        String expectedComingsoon = "Coming soon";
        String actualComingSoon = getTextFromElement(By.xpath("//h1[text()='Coming soon']"));
        Assert.assertEquals(actualComingSoon,expectedComingsoon, "User Is Not On CominSoon Page");
    }
@Test(groups = {"Regression"})
    public void navigateToContactUsPageTest() throws InterruptedException {
        topMenuTest.veryfyUserShouldNavigateToContactUsPageSuccessfully();
    //Thread.sleep(3000);
         String expectedContactUs = "Contact us";
        String actualContactUs = getTextFromElement(By.id("page-title"));
        Assert.assertEquals(actualContactUs, expectedContactUs, "User Is Not On Contact Us Page");
    }
    //This tests are for Hotdeals

    @Test(groups = {"Sanity", "Smoke", "Regression"})
    public void productArrangeAlphabeticallyTest(){
    hotDealsTest.verifySaleProductArrangeAlphabetically();
        String saleMsg = "Sale";
        String actualSalesMsg = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("UserIs Not On Sales Page", saleMsg, actualSalesMsg);
        String expectedFirstDisplayMsg = "Name A - Z";
        String actualFirstDisplayMsg = getTextFromElement(By.xpath("//span[text()='Name A - Z']"));
        org.junit.Assert.assertEquals("products are  In Alphabetical Order",expectedFirstDisplayMsg,actualFirstDisplayMsg);

    }
    @Test(groups = {"Regression"})
    public void productPriceToLowToHighTest(){
    hotDealsTest.verifySaleProductsPriceArrangeLowToHigh();
        String saleMsg = "Sale";
        String actualSalesMsg = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("User Is Not On Sales Page", saleMsg, actualSalesMsg);
        String expectedSortByMsg = "Price Low - High";
        String actualSortByMsg = getTextFromElement(By.xpath("//span[text()='Price Low - High']"));
        org.junit.Assert.assertEquals("Products Are Not Sorted In price Low to High",expectedSortByMsg,actualSortByMsg);

    }
    @Test(groups = {"Regression"})
    public void productArrangeToRatesTest(){
    hotDealsTest.verifySaleProductArrangeByRates();
        String saleMsg = "Sale";
        String actualSalesMsg = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("User Is Not On Sales Page", saleMsg, actualSalesMsg);
        String expectedSortByMsg = "Rates";
        String actualSortByMsg = getTextFromElement(By.xpath("//span[text()='Rates ']"));
        org.junit.Assert.assertEquals("Products Are Not Sorted In Rates",expectedSortByMsg,actualSortByMsg);
    }
    @Test(groups = {"Regression"})
    public void productArrangeToZToA(){
    hotDealsTest.verifyBestSellersProductsArrangeByZToA();
        String saleMsg = "Bestsellers";
        String actualSalesMsg = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("User Is Not On Best Sellers Page", saleMsg, actualSalesMsg);
        String expectedSortByMsg = "Name Z - A";
        String actualSortByMsg = getTextFromElement(By.xpath("//span[text()='Name Z - A']"));
        org.junit.Assert.assertEquals("Products Are Not Sorted In Rates", expectedSortByMsg, actualSortByMsg);
    }
    @Test(groups = {"Regression"})
    public void ProductArrangeToHighToLow(){
    hotDealsTest.verifyBestSellersProductsPriceArrangeHighToLow();
        String saleMsg = "Bestsellers";
        String actualSalesMsg = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("User Is Not On Best Sellers Page", saleMsg, actualSalesMsg);
        String expectedSortByMsg = "Price High - Low";
        String actualSortByMsg = getTextFromElement(By.xpath("//span[text()='Price High - Low']"));
        org.junit.Assert.assertEquals("Products Are Not Sorted In Rates",expectedSortByMsg,actualSortByMsg);
    }
    @Test(groups = {"Regression"})
    public void productArrangeToRatesbestseller(){
    hotDealsTest.verifyBestSellersProductsArrangeByRates();
        String saleMsg = "Bestsellers";
        String actualSalesMsg = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        org.junit.Assert.assertEquals("User Is Not On Best Sellers Page", saleMsg, actualSalesMsg);
        String expectedSortByMsg = "Rates";
        String actualSortByMsg = getTextFromElement(By.xpath("//span[text()='Rates ']"));
        org.junit.Assert.assertEquals("Products Are Not Sorted In Rates",expectedSortByMsg,actualSortByMsg);

    }
//Tests for Shopping(1)
    @Test(groups = {"Sanity", "Smoke", "Regression"})
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeakerTest() throws InterruptedException {
        shoppingTest.mouseHoverOnHotDeals();
        shoppingTest.clickOnSale();
        String expectedSaleMsg = "Sale";//sale assert
        String realSaleMsg = shoppingTest.getSaleMessage();
        Assert.assertEquals(realSaleMsg, expectedSaleMsg);
        shoppingTest.hoverOnSortBy();
        shoppingTest.clickOnNameAToZ();
        Thread.sleep(3000);
        shoppingTest.getClickOnAvengers();
        shoppingTest.getClickOnCheckBox();
        shoppingTest.getThorProduct();
        Thread.sleep(3000);
        String expectedAddedMsg = "Product has been added to your cart";//assert for added cart
        String realAddedMsg = shoppingTest.getProductAddedMessage();
        Assert.assertEquals(realAddedMsg, expectedAddedMsg);
        shoppingTest.getXSign();
        shoppingTest.getYourCartSign();
        shoppingTest.getYourViewCartSign();
        String expectedProductAddedMsg = "Your shopping cart - 1 item";//product added assert
        String realProductAddedMsg = shoppingTest.get1ItemAdded();
        Assert.assertEquals(realProductAddedMsg, expectedProductAddedMsg);
        driver.findElement(By.id("amount16")).clear();//first remove 1 quantity
        Thread.sleep(2000);
        driver.findElement(By.id("amount16")).click(); //click on quantity
        driver.findElement(By.id("amount16")).sendKeys("2");//add 2
        String added2ProductMsg = "Your shopping cart - 2 items";    //assert for 2 quantity added
        String real2ProductMsg = shoppingTest.getting2ItemsAddesMsg();
        Assert.assertEquals(real2ProductMsg, added2ProductMsg);
        String subTotal = "Subtotal: $59.98";  //assert for newly added product
        String realSubTotal = shoppingTest.gettingSubTotal();
        Assert.assertEquals(realSubTotal, subTotal);
        String totalAmount = "$66.53";                     //verify Total
        String realTotalAmount = shoppingTest.gettingTotal();
        Assert.assertEquals(realTotalAmount, totalAmount);
        shoppingTest.gettingGoToCheckOut();
        String expectedLogInMsg = "Log in to your account";                   //login veryfy assert
        String realLogInMsg = shoppingTest.getLoginAcc();
        Assert.assertEquals(realLogInMsg, expectedLogInMsg);
        shoppingTest.getEmail("catty1@gmail.com");
        Thread.sleep(3000);
        shoppingTest.getOnContinue();
        String expectedSecureText = "Secure Checkout";                            //asert for secure checkout
        String realSecureText = shoppingTest.getSecureCheckOut();
        Assert.assertEquals(realSecureText, expectedSecureText);
        shoppingTest.getFirstName("Komal");
        shoppingTest.getLastName("Jimulia");
        shoppingTest.getAddress("7 Anthony court");
        shoppingTest.getState("Harrow");
        driver.findElement(By.id("shippingaddress-zipcode")).clear();
        sendTextToElement(By.id("shippingaddress-zipcode"), "HA1 2FW");
        Thread.sleep(3000);
        shoppingTest.getClickOnAccLaterUse();
        Thread.sleep(3000);
        shoppingTest.getpassword("12345");
        Thread.sleep(3000);
        shoppingTest.getDeliveryMethod();//delivery
        shoppingTest.getClickOnMethod();//payment method
        Thread.sleep(3000);
        shoppingTest.getClickOnCod();
        String expectedTotal = "$66.53";                  //assert for total
        String realTotal = shoppingTest.getFinalTotal();
        Assert.assertEquals(realTotal, expectedTotal);
        shoppingTest.getMouseHoverToClick();
        shoppingTest.getClickOnFinalButton();
        String expectedLastMsg = "Thank you for your order";    //verifying thank you page
        String realLastMsg = shoppingTest.getThankYouMsg();
        Assert.assertEquals(realLastMsg, expectedLastMsg);
    }
    //2 - verifyThatUserShouldClearShoppingCartSuccessfully(2)
    @Test(groups = {"Regression"})
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        shoppingTest.mouseHoverOnHotDeals();
        shoppingTest.getClickOnBestSeller();
        String saleText = "Bestsellers";
        String actualSalesText = shoppingTest.getBestSellerText();
        Assert.assertEquals(actualSalesText,saleText);
        shoppingTest.getMouseHover2();
        shoppingTest.getAtoZ2();
        Thread.sleep(3000);
        shoppingTest.hoverVinzProduct();
        shoppingTest.getVinzProducts();
        String expectedCartMsg = "Product has been added to your cart";   //assert for add to cart
        String actualCartMsg = shoppingTest.getProductAddedMessage2();
        Assert.assertEquals(actualCartMsg,expectedCartMsg);
        shoppingTest.getXSign2();
        shoppingTest.getClickOnYourCart2();
        shoppingTest.getClickOnViewCart2();
        String shopCartMsg = "Your shopping cart - 1 item";
        String realCartMsg = shoppingTest.getProductOneAddedMsg();
        Assert.assertEquals(realCartMsg,shopCartMsg);
        shoppingTest.getEmptyCart2();
        String emptyCartMsg = "Are you sure you want to clear your cart?";
        String realEmptyCartMsg = driver.switchTo().alert().getText();//to get text which we can not inspect
        org.junit.Assert.assertEquals("Cart Is Not Being Emptied", emptyCartMsg, realEmptyCartMsg);
        driver.switchTo().alert().accept();//when ok is also not inspected
        String empryCartMsg = "Item(s) deleted from your cart";            //checking green bar message
        String actualEmptyCartMsgIs =shoppingTest.getDeletesMsg();
        Assert.assertEquals(actualEmptyCartMsgIs,empryCartMsg);
        String lastEmptyCartMessage = "Your cart is empty";    //verifying your cart is empty text
        String actualLastEmptyCartMessage = shoppingTest.getLastMessage();
        Assert.assertEquals(actualLastEmptyCartMessage,lastEmptyCartMessage);




    }



}
