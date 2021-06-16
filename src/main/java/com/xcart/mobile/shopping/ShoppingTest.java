package com.xcart.mobile.shopping;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ShoppingTest extends Utility {
    By hoverOnHotDeals = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/span");
    By clickOnSaleLInk = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a/span");
    By veryfyTextSale = By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortBy = By.xpath("//span[@class='sort-by-label']");
    By clickOnNameAtoZ = By.xpath("//*[@id=\"XLite-Module-CDev-Sale-View-SalePage-sortby-1\"]/li[5]/a");
    By clickOnAvengers = By.xpath("//img[@alt='Avengers: Fabrikations Plush [Related Products]']");
    By clickOnCheckBox = By.xpath("//*[@id=\"content\"]/div/div/div[2]/div[4]/div[3]/ul/li[2]/label/div/input[2]");
    By clickOnThor = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/form[2]/div[2]/div[1]/div[3]/button[1]");
    By productAddedMessage = By.xpath("//li[text()='Product has been added to your cart']");
    By clickOnXSign = By.xpath("//a[@class='close']");
    By clickOnYourCart = By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By clickOnViewCart = By.xpath("//a[@class='regular-button cart']");
    By veryfy1ItemMessage = By.id("page-title");
    By added2Items = By.xpath("//h1[text()='Your shopping cart - 2 items']");
    By subTotalVeryfy = By.xpath("//span[@class='cart-subtotal']/parent::li/ancestor::ul");
    By totalVeryFy=By.xpath("//li[@class='total']");
    By goToCheckOut=By.xpath("//span[text()='Go to checkout']");
    By logInYourAcc= By.xpath("//h3[text()='Log in to your account']");
    By enterEmail=By.id("email");
    By clickOnContinue=By.xpath("//button[@class='btn  regular-button anonymous-continue-button submit']");
    By veryFySecureCheckOut=By.xpath("//h1[@class='title']");
    By enterFirstName=By.id("shippingaddress-firstname");
    By enterLastName=By.id("shippingaddress-lastname");
    By enterAddress=By.id("shippingaddress-street");
    By enterState=By.id("shippingaddress-custom-state");
    By createAnAccForLaterUse=By.id("create_profile");
    By enterPassword=By.id("password");
    By mouseHoverToDeliveryMethod=By.id("method128");
    By clickOnMethod=By.id("method128");
    By clickOnCod=By.id("pmethod6");
    By veryfyFinalTotal=By.xpath("//div[@class='total clearfix']");
    By mouseHoverToClickButton=By.xpath("//span[text()='Place order: $67.59']/parent::button");
    By clickOnButton=By.xpath("//span[text()='Place order: $67.59']/parent::button");
    By veryFyThankYouMsg=By.xpath("//h1[text()='Thank you for your order']");
    //2 - verifyThatUserShouldClearShoppingCartSuccessfully()
    By clickOnBestSeller=By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span");
    By veryFyBestSellerMsg=By.xpath("//h1[@id='page-title']");
    By mouseHoverOnSortBy2=By.xpath("//span[@class='sort-by-label']");
    By selectAToZ=By.xpath("//*[@id=\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\"]/li[4]/a");
    By hoverOnVinzProduct=By.xpath("//img[@alt='Vinyl Idolz: Ghostbusters']");
    By clickOnVinzProducts=By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']");
    By veryFyProductAddedMsg2=By.xpath("//li[text()='Product has been added to your cart']");
    By clickOnXSig2= By.xpath("//a[@class='close']");
    By clickOnYourCart2=By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By clickOnViewCart2=By.xpath("//a[@class='regular-button cart']");
    By veryFyoneItemMsg=By.id("page-title");
    By clickOnEmptyCart=By.xpath("//a[text()='Empty your cart']");
    By itemsDeletedFromCart=By.xpath("//li[text()='Item(s) deleted from your cart']");
    By lastMessage=By.xpath("//h1[text()='Your cart is empty']");



    public void mouseHoverOnHotDeals() {
        Reporter.log("MouseHover on hot deals:" + hoverOnHotDeals.toString() + "<br>");
        mouseHoverToElement(hoverOnHotDeals);
    }

    public void clickOnSale() {
        Reporter.log("Clicking on Sale Link:" + clickOnSaleLInk.toString() + "<br>");
        clickOnElement(clickOnSaleLInk);
    }

    public String getSaleMessage() {
        Reporter.log("Getting sale text message" + veryfyTextSale.toString() + "<br>");
        return getTextFromElement(veryfyTextSale);
    }

    public void hoverOnSortBy() {
        Reporter.log("Hover on sort by text" + mouseHoverOnSortBy.toString() + "<br>");
        mouseHoverToElement(mouseHoverOnSortBy);
    }

    public void clickOnNameAToZ() {
        Reporter.log("clicking on name A to z text" + clickOnNameAtoZ.toString() + "<br>");
        clickOnElement(clickOnNameAtoZ);
    }

    public void getClickOnAvengers() {
        Reporter.log("clicking on Avengers" + clickOnAvengers.toString() + "<br>");
        clickOnElement(clickOnAvengers);
    }

    public void getClickOnCheckBox() {
        Reporter.log("Click on checkbox" + clickOnCheckBox.toString() + "<br>");
        clickOnElement(clickOnCheckBox);
    }

    public void getThorProduct() {
        Reporter.log("Get Thor Products" + clickOnThor.toString() + "<br>");
        clickOnElement(clickOnThor);
    }

    public String getProductAddedMessage() {
        Reporter.log("getting product added message" + productAddedMessage.toString() + "<br>");
        return getTextFromElement(productAddedMessage);
    }

    public void getXSign() {
        Reporter.log("getting X sign" + clickOnXSign.toString() + "<br>");
        clickOnElement(clickOnXSign);
    }

    public void getYourCartSign() {
        Reporter.log("getting your cart sign" + clickOnYourCart.toString() + "<br>");
        clickOnElement(clickOnYourCart);
    }

    public void getYourViewCartSign() {
        Reporter.log("getting view cart sign" + clickOnViewCart.toString() + "<br>");
        clickOnElement(clickOnViewCart);
    }

    public String get1ItemAdded() {
        Reporter.log("1st item added" + veryfy1ItemMessage.toString() + "<br>");
        return getTextFromElement(veryfy1ItemMessage);
    }

    public String getting2ItemsAddesMsg() {
        Reporter.log("2 items added" + added2Items.toString() + "<br>");
        return getTextFromElement(added2Items);

    }

    public String gettingSubTotal() {
        Reporter.log("Subtotal price added" + subTotalVeryfy.toString() + "<br>");
        return getTextFromElement(subTotalVeryfy);
    }
    public String gettingTotal(){
        Reporter.log("Total price added" + totalVeryFy.toString() + "<br>");
        return getTextFromElement(totalVeryFy);
    }
    public void gettingGoToCheckOut(){
        Reporter.log("Go to Check out" + goToCheckOut.toString() + "<br>");
        clickOnElement(goToCheckOut);
    }
    public String getLoginAcc() {
        Reporter.log("Login " + logInYourAcc.toString() + "<br>");
        return getTextFromElement(logInYourAcc);
    }
    public void getEmail(String email){
        Reporter.log("Enter email " + email + " to email field " + enterEmail.toString() + "<br>");
        sendTextToElement(enterEmail,email);


    }
    public void getOnContinue(){
        Reporter.log("Click on continue " +clickOnContinue.toString() + "<br>");
        clickOnElement(clickOnContinue);
    }
    public String getSecureCheckOut() {
        Reporter.log("Secure check out " + veryFySecureCheckOut.toString() + "<br>");
        return getTextFromElement(veryFySecureCheckOut);
    }
    public void getFirstName(String name) {
        Reporter.log("Enter first name " + name + " to name field " + enterFirstName.toString() + "<br>");
        sendTextToElement(enterFirstName, name);
    }
    public void getLastName(String lastname) {
        Reporter.log("Enter last name " + lastname + " to name field " + enterLastName.toString() + "<br>");
        sendTextToElement(enterLastName, lastname);
    }
    public void getAddress(String address) {
        Reporter.log("Enter address " + address + " to name field " +enterAddress.toString() + "<br>");
        sendTextToElement(enterAddress, address);
    }
    public void getState(String state) {
        Reporter.log("Enter state " + state + " to name field " +enterState.toString() + "<br>");
        sendTextToElement(enterState, state);
    }


    public void getClickOnAccLaterUse() {
        Reporter.log("click on later use" + createAnAccForLaterUse.toString() + "<br>");

        clickOnElement(createAnAccForLaterUse);
    }
    public void getpassword(String password) {
        Reporter.log("Enter password " + password + " to name field " +enterPassword.toString() + "<br>");
        sendTextToElement(enterPassword, password);
    }
    public void getDeliveryMethod() {
        Reporter.log("Hover on method " + mouseHoverToDeliveryMethod.toString() + "<br>");
        mouseHoverToElement(mouseHoverToDeliveryMethod);
    }


    public void getClickOnMethod() {
        Reporter.log("click on method " + clickOnMethod.toString() + "<br>");
        clickOnElement(clickOnMethod);
    }
    public void getClickOnCod() {
        Reporter.log("click on cod" + clickOnCod.toString() + "<br>");
        clickOnElement(clickOnCod);
    }
    public String getFinalTotal() {
        Reporter.log("Final total " + veryfyFinalTotal.toString() + "<br>");
        return getTextFromElement(veryfyFinalTotal);
    }
    public void getMouseHoverToClick() {
        Reporter.log("MouseHover to click:" + mouseHoverToClickButton.toString() + "<br>");
        mouseHoverToElement(mouseHoverToClickButton);
    }
    public void getClickOnFinalButton() {
        Reporter.log("click on button:" + clickOnButton.toString() + "<br>");
        clickOnElement(clickOnButton);
    }
    public String getThankYouMsg() {
        Reporter.log("Getting Thank you message" +veryFyThankYouMsg.toString() + "<br>");
        return getTextFromElement(veryFyThankYouMsg);
    }
    //2 - verifyThatUserShouldClearShoppingCartSuccessfully()
    public void getClickOnBestSeller(){
        Reporter.log("Click on bestseller:" + clickOnBestSeller.toString() + "<br>");
        clickOnElement(clickOnBestSeller);

    }
    public String getBestSellerText() {
        Reporter.log("getting best seller message" + veryFyBestSellerMsg.toString() + "<br>");
        return getTextFromElement(veryFyBestSellerMsg);
    }
    public void getMouseHover2(){
        Reporter.log("Mouse Hover on sort by:" + mouseHoverOnSortBy2.toString() + "<br>");
        mouseHoverToElement(mouseHoverOnSortBy2);
    }
    public void getAtoZ2(){
        Reporter.log("Click on A to Z:" + selectAToZ.toString() + "<br>");
        clickOnElement(selectAToZ);
    }
    public void hoverVinzProduct(){
        Reporter.log("Hover on Vinz products:" + hoverOnVinzProduct.toString() + "<br>");
        mouseHoverToElement(hoverOnVinzProduct);
    }
    public void getVinzProducts(){
        Reporter.log("Click on Vinz products:" + clickOnVinzProducts.toString() + "<br>");
        clickOnElement(clickOnVinzProducts);
    }
    public String getProductAddedMessage2() {
        Reporter.log("getting product added message" + veryFyProductAddedMsg2.toString() + "<br>");
        return getTextFromElement(veryFyProductAddedMsg2);
    }
    public void getXSign2(){
        Reporter.log("Click on X sign" + clickOnXSig2.toString() + "<br>");
        clickOnElement(clickOnXSig2);

    }
    public void getClickOnYourCart2(){
        Reporter.log("Click on your cart sign" + clickOnYourCart2.toString() + "<br>");
        clickOnElement(clickOnYourCart2);
    }
    public void getClickOnViewCart2(){
        Reporter.log("Click on view cart sign" + clickOnViewCart2.toString() + "<br>");
        clickOnElement(clickOnViewCart2);
    }
    public String getProductOneAddedMsg() {
        Reporter.log("Product added" +veryFyoneItemMsg.toString() + "<br>");
        return getTextFromElement(veryFyoneItemMsg);
    }
    public void getEmptyCart2(){
        Reporter.log("Click on empty cart sign" + clickOnEmptyCart.toString() + "<br>");
        clickOnElement(clickOnEmptyCart);
    }
    public String getDeletesMsg(){
        Reporter.log("Items deleted msg" + itemsDeletedFromCart.toString() + "<br>");
        return getTextFromElement(itemsDeletedFromCart);

    }
    public String getLastMessage(){
        Reporter.log("Last message" + lastMessage.toString() + "<br>");
        return getTextFromElement(lastMessage);

    }





}