package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ComputerTest extends BaseTest {
    ComputerPage computerPage = new ComputerPage();
    HomePage homePage = new HomePage();


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {

        //1.1 Click on Computer Menu.
        homePage.click(homePage.computerLink);
        //1.2 Click on Desktop
        computerPage.clickOn(computerPage.desktopLink);
        List<String> actualText = computerPage.getProductNamesInDefaultFilterAndSortByDescendingOrder();
        //1.3 Select Sort By position "Name: Z to A"
        computerPage.selectFilter("6");
        Thread.sleep(2000);
        List<String> expectedText = computerPage.getProductNamesAfterFilterZtoA();
        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        homePage.click(homePage.computerLink);
        //2.2 Click on Desktop
        computerPage.clickOn(computerPage.desktopLink);
        //2.3 Select Sort By position "Name: A to Z"
        computerPage.selectFilter("5");
        Thread.sleep(2000);
        //2.4 Click on "Add To Cart"
        computerPage.clickOn(computerPage.addToCart);
        //2.5 Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = computerPage.getVerificationText(computerPage.buildText);
        Assert.assertEquals(actualText, expectedText);
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computerPage.select(computerPage.processor, "1");
        //2.7.Select "8GB [+$60.00]" using Select class.
        computerPage.select(computerPage.ram, "5");
        Thread.sleep(2000);
        //2.8 Select HDD radio "400 GB [+$100.00]"
        computerPage.clickOn(computerPage.hdd400GB);
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        computerPage.clickOn(computerPage.osVistaPremium);
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        computerPage.clickOn(computerPage.softwareTotalCommander);
        Thread.sleep(2000);
        //2.11 Verify the price "$1,475.00"
        expectedText = "$1,475.00";
        actualText = computerPage.getVerificationText(computerPage.totalPrice);
        Assert.assertEquals(actualText, expectedText);
        //2.12 Click on "ADD TO CARD" Button.
        computerPage.clickOn(computerPage.addToCartButton);
        //2.13 Verify the Message "The product has been added to your shopping cart" on To green Bar After that close the bar clicking on the cross button.
        expectedText = "The product has been added to your shopping cart";
        actualText = computerPage.getVerificationText(computerPage.confirmationMessage);
        Assert.assertEquals(actualText, expectedText);
        computerPage.clickOn(computerPage.closeButton);
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        computerPage.mouseHoverOnElementAndClick(computerPage.shoppingCartLink);
        computerPage.clickOn(computerPage.goToCartButton);
        //2.15 Verify the shoppingCartMessage "Shopping cart"
        expectedText = "Shopping cart";
        actualText = computerPage.getVerificationText(computerPage.shoppingCartMessage);
        Assert.assertEquals(actualText, expectedText);
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        computerPage.clickOn(computerPage.qtyUp);
        //2.17 Verify the Total"$2,950.00"
        expectedText = "$2,950.00";
        actualText = computerPage.getVerificationText(computerPage.updatedTotal);
        Assert.assertEquals(actualText, expectedText);
        //2.18 clickOn on checkbox “I agree with the terms of service”
        computerPage.clickOn(computerPage.agreeTermsCheckBox);
        //2.19 Click on “CHECKOUT”
        computerPage.clickOn(computerPage.checkOutButton);
        //2.20 Verify the Text “Welcome, Please Sign In!”
        expectedText = "Welcome, Please Sign In!";
        actualText = computerPage.getVerificationText(computerPage.welcomeMessage);
        Assert.assertEquals(actualText, expectedText);
        //2.21Click on “CHECKOUT AS GUEST” Tab
        computerPage.clickOn(computerPage.guestCheckoutButton);
        //2.22 Fill the all mandatory field
        computerPage.sendText(computerPage.firstName, "Shubham");
        computerPage.sendText(computerPage.lastName, "Lohar");
        computerPage.sendText(computerPage.emailId, "shubham123@gmail.com");
        computerPage.select(computerPage.country, "134");
        computerPage.sendText(computerPage.city, "sanand");
        computerPage.sendText(computerPage.address1, "64");
        computerPage.sendText(computerPage.zipCode, "314034");
        computerPage.sendText(computerPage.phoneNumber, "09828127788");
        //2.23 Click on “CONTINUE”
        computerPage.clickOn(computerPage.continueButton);
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        computerPage.clickOn(computerPage.radioButtonNextDay);
        //2.25 Click on “CONTINUE”
        Thread.sleep(1000);
        computerPage.clickOn(computerPage.continueDelivery);
        //2.26 Select Radio Button “Credit Card”
        computerPage.clickOn(computerPage.radioButtonCredit);
        computerPage.clickOn(computerPage.continutToPayment);
        //2.27 Select “Master card” From Select credit card dropdown
        computerPage.select(computerPage.creditCardDropdown, "MasterCard");
        //2.28 Fill all the details
        computerPage.sendText(computerPage.cardHolderName, "Shubham Lohar");
        computerPage.sendText(computerPage.cardNumber, "5111010030175156");
        computerPage.select(computerPage.expireYear, "2029");
        computerPage.sendText(computerPage.cardCVV, "444");
        //2.29 Click on “CONTINUE”
        computerPage.clickOn(computerPage.continuePayment);
        //2.30 Verify “Payment Method” is “Credit Card”
        expectedText = "Credit Card";
        actualText = computerPage.getVerificationText(computerPage.paymentCC);
        Assert.assertEquals(actualText,expectedText);
        //2.32 Verify “Shipping Method” is “Next Day Air”
        expectedText="Next Day Air";
        actualText = computerPage.getVerificationText(computerPage.shippingNDA);
        Assert.assertEquals(actualText,expectedText);
        //2.33 Verify Total is “$2,950.00”
        expectedText="$2,950.00";
        actualText = computerPage.getVerificationText(computerPage.totalAmount);
        Assert.assertEquals(actualText,expectedText);
        //2.34 Click on “CONFIRM”
        computerPage.clickOn(computerPage.confirm);
        //2.35 Verify the Text “Thank You”
        expectedText = "Thank you";
        actualText = computerPage.getVerificationText(computerPage.thankYouMessage);
        Assert.assertEquals(actualText,expectedText);
        //2.36 Verify the shoppingCartMessage “Your order has been successfully processed!”
        expectedText = "Your order has been successfully processed!";
        actualText = computerPage.getVerificationText(computerPage.proceedMessage);
        Assert.assertEquals(actualText,expectedText);
        Thread.sleep(2000);
        //2.37 Click on “CONTINUE”
        computerPage.clickOn(computerPage.finalContinue);
        //2.37 Verify the text “Welcome to our store”
        expectedText = "Welcome to our store";
        actualText = computerPage.getVerificationText(computerPage.welcomeText);
        Assert.assertEquals(actualText,expectedText);
    }
}
