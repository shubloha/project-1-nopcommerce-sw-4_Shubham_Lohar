package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //1.1 Mouse Hover on “Electronics” Tab
        electronicsPage.mouseHoverToElement(electronicsPage.electronics);
        //1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverToElementAndClick(electronicsPage.cellPhones);
        //1.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = electronicsPage.getVerificationText(electronicsPage.cellPhoneText);
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        electronicsPage.mouseHoverToElement(electronicsPage.electronics);
        //2.2 Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverToElementAndClick(electronicsPage.cellPhones);
        //2.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = electronicsPage.getVerificationText(electronicsPage.cellPhoneText);
        Assert.assertEquals(actualText, expectedText);
        //2.4 Click on List View Tab
        electronicsPage.clickOn(electronicsPage.listViewTab);
        Thread.sleep(2000);
        //2.5 Click on product name “Nokia Lumia 1020” link
        electronicsPage.clickOn(electronicsPage.productNL1020);
        //2.6 Verify the text “Nokia Lumia 1020”
        expectedText = "Nokia Lumia 1020";
        actualText = electronicsPage.getVerificationText(electronicsPage.NL1020Text);
        Assert.assertEquals(actualText, expectedText);
        //2.7 Verify the price “$349.00”
        expectedText = "$349.00";
        actualText = electronicsPage.getVerificationText(electronicsPage.price349);
        Assert.assertEquals(actualText, expectedText);
        //2.8 Change quantity to 2
        electronicsPage.clearAndSendText(electronicsPage.qtyBox, "2");
        //2.9 Click on “ADD TO CART” tab
        electronicsPage.clickOn(electronicsPage.addToCart);
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top
        expectedText = "The product has been added to your shopping cart";
        actualText = electronicsPage.getVerificationText(electronicsPage.confirmationMessage);
        Assert.assertEquals(actualText, expectedText);
        //After that close the bar clicking on the cross button.
        electronicsPage.clickOn(electronicsPage.crossButton);
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronicsPage.mouseHoverOnElementAndClick(electronicsPage.shoppingCartTab);
        electronicsPage.clickOn(electronicsPage.goToCart);
        //2.12 Verify the message "Shopping cart"
        expectedText = "Shopping cart";
        actualText = electronicsPage.getVerificationText(electronicsPage.shoppingCartText);
        Assert.assertEquals(actualText, expectedText);
        //2.13 Verify the quantity is 2
        expectedText = "2";
        actualText = electronicsPage.getAttribute(electronicsPage.qty);
        Assert.assertEquals(actualText, expectedText);
        //2.14 Verify the Total $698.00
        expectedText = "$698.00";
        actualText = electronicsPage.getVerificationText(electronicsPage.total698);
        Assert.assertEquals(actualText, expectedText);
        //2.15 click on checkbox “I agree with the terms of service”
        electronicsPage.clickOn(electronicsPage.agreeCheckBox);
        //2.16 Click on “CHECKOUT”
        electronicsPage.clickOn(electronicsPage.checkOut);
        //2.17 Verify the Text “Welcome, Please Sign In!”
        expectedText = "Welcome, Please Sign In!";
        actualText = electronicsPage.getVerificationText(electronicsPage.welcomeMessage);
        Assert.assertEquals(actualText, expectedText);
        //2.18 Click on “REGISTER” tab
        electronicsPage.clickOn(electronicsPage.registerTab);
        //2.19 Verify the text “Register”
        expectedText = "Register";
        actualText = electronicsPage.getVerificationText(electronicsPage.registerText);
        Assert.assertEquals(actualText, expectedText);
        //2.20 Fill the mandatory fields
        electronicsPage.clickOn(electronicsPage.selectMaleGender);
        electronicsPage.sendText(electronicsPage.firstName, "shubham");
        electronicsPage.sendText(electronicsPage.lastName, "Lohar");
        electronicsPage.sendText(electronicsPage.email, electronicsPage.generateEmailId());
        electronicsPage.select(electronicsPage.date, "10");
        electronicsPage.select(electronicsPage.month, "10");
        electronicsPage.select(electronicsPage.year, "1992");
        electronicsPage.sendText(electronicsPage.password, "Shubham1010");
        electronicsPage.sendText(electronicsPage.confirmPassword, "Shubham1010");
        //2.21 Click on “REGISTER” Button
        electronicsPage.clickOn(electronicsPage.registerButton);
        //2.22 Verify the message “Your registration completed”
        expectedText = "Your registration completed";
        actualText = electronicsPage.getVerificationText(electronicsPage.completeRegistrationText);
        Assert.assertEquals(actualText, expectedText);
        //2.23 Click on “CONTINUE” tab
        electronicsPage.clickOn(electronicsPage.continueTab);
        //2.24 Verify the text “Shopping card”
        expectedText = "Shopping cart";
        actualText = electronicsPage.getVerificationText(electronicsPage.shoppingCartText);
        Assert.assertEquals(actualText, expectedText);
        //2.25 click on checkbox “I agree with the terms of service”
        electronicsPage.clickOn(electronicsPage.agreeCheckBox);
        //2.26 Click on “CHECKOUT”
        electronicsPage.clickOn(electronicsPage.checkOut);
        //2.27 Fill the Mandatory fields
        electronicsPage.select(electronicsPage.selectCountry, "133");
        electronicsPage.sendText(electronicsPage.cityName, "sanand");
        electronicsPage.sendText(electronicsPage.address1, "62");
        electronicsPage.sendText(electronicsPage.postalCode, "314034");
        electronicsPage.sendText(electronicsPage.phoneNumber, "09828127788");
        //2.28 Click on “CONTINUE”
        electronicsPage.clickOn(electronicsPage.continueButton);
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        electronicsPage.clickOn(electronicsPage.radio2dayAir);
        //2.30 Click on “CONTINUE”
        electronicsPage.clickOn(electronicsPage.continueShippingNext);
        //2.31 Select Radio Button “Credit Card”
        electronicsPage.clickOn(electronicsPage.radioCC);
        electronicsPage.clickOn(electronicsPage.continuePaymentNext);
        //2.32 Select “Visa” From Select credit card dropdown
        electronicsPage.select(electronicsPage.cardOption, "visa");
        //2.33 Fill all the details
        electronicsPage.sendText(electronicsPage.cardHolderName, "shubham lohar");
        electronicsPage.sendText(electronicsPage.cardNumber, "5111010030175156");
        electronicsPage.select(electronicsPage.expireYear, "2029");
        electronicsPage.sendText(electronicsPage.cardCode, "464");
        //2.34 Click on “CONTINUE”
        electronicsPage.clickOn(electronicsPage.continueToDetailsButton);
        //2.35 Verify “Payment Method” is “Credit Card”
        expectedText = "Credit Card";
        actualText = electronicsPage.getVerificationText(electronicsPage.paymentMethodCC);
        Assert.assertEquals(actualText, expectedText);
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        expectedText = "2nd Day Air";
        actualText = electronicsPage.getVerificationText(electronicsPage.shippingMethod2Day);
        Assert.assertEquals(actualText, expectedText);
        //2.37 Verify Total is “$698.00”
        expectedText = "$698.00";
        actualText = electronicsPage.getVerificationText(electronicsPage.totalFinal);
        Assert.assertEquals(actualText, expectedText);
        //2.38 Click on “CONFIRM”
        electronicsPage.clickOn(electronicsPage.confirmButton);
        //2.39 Verify the Text “Thank You”
        expectedText = "Thank you";
        actualText = electronicsPage.getVerificationText(electronicsPage.thankYouText);
        Assert.assertEquals(actualText, expectedText);
        //2.40 Verify the message “Your order has been successfully processed!”
        expectedText = "Your order has been successfully processed!";
        actualText = electronicsPage.getVerificationText(electronicsPage.orderConfirmationMessage);
        Assert.assertEquals(actualText, expectedText);
        //2.41 Click on “CONTINUE”
        electronicsPage.clickOn(electronicsPage.continueButtonAfterPayment);
        //2.42 Verify the text “Welcome to our store”
        expectedText = "Welcome to our store";
        actualText = electronicsPage.getVerificationText(electronicsPage.welcomeToStoreMessage);
        Assert.assertEquals(actualText, expectedText);
        //2.43 Click on “Logout” link
        electronicsPage.clickOn(electronicsPage.logOut);
        //2.44 Verify the URL is “https://demo.nopcommerce.com/"
        expectedText = "https://demo.nopcommerce.com/";
        actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, expectedText);
    }
}
