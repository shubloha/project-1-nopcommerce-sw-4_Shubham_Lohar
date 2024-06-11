package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    public By electronics = By.linkText("Electronics");
    public By cellPhones = By.linkText("Cell phones");
    public By cellPhoneText = By.xpath("//h1[normalize-space()='Cell phones']");
    public By listViewTab = By.xpath("//a[normalize-space()='List']");
    public By productNL1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    public By NL1020Text = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    public By price349 = By.xpath("//span[@id='price-value-20']");
    public By qtyBox = By.xpath("//input[@id='product_enteredQuantity_20']");
    public By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    public By confirmationMessage = By.xpath("//p[@class='content']");
    public By crossButton = By.xpath("//span[@title='Close']");
    public By shoppingCartTab = By.xpath("//span[contains(text(),'Shopping cart')]");
    public By goToCart = By.xpath("//button[normalize-space()='Go to cart']");
    public By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    public By qty = By.xpath("//div[@class='product-quantity']//input");
    public By total698 = By.xpath("//span[@class='product-subtotal']");
    public By agreeCheckBox = By.xpath("//input[@id='termsofservice']");
    public By checkOut = By.xpath("//button[@id='checkout']");
    public By welcomeMessage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    public By registerTab = By.xpath("//button[normalize-space()='Register']");
    public By registerText = By.xpath("//h1[normalize-space()='Register']");
    public By selectMaleGender = By.id("gender-male");
    public By firstName = By.xpath("//input[@id='FirstName']");
    public By lastName = By.xpath("//input[@id='LastName']");
    public By email = By.xpath("//input[@id='Email']");
    public By password = By.xpath("//input[@id='Password']");
    public By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    public By date = By.name("DateOfBirthDay");
    public By month = By.name("DateOfBirthMonth");
    public By year = By.name("DateOfBirthYear");
    public By registerButton = By.xpath("//button[@id='register-button']");
    public By completeRegistrationText = By.xpath("//div[@class='result']");
    public By continueTab = By.xpath("//a[normalize-space()='Continue']");
    public By selectCountry = By.id("BillingNewAddress_CountryId");
    public By cityName = By.id("BillingNewAddress_City");
    public By address1 = By.id("BillingNewAddress_Address1");
    public By postalCode = By.id("BillingNewAddress_ZipPostalCode");
    public By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    public By continueButton = By.name("save");
    public By radio2dayAir = By.xpath("//input[@id='shippingoption_2']");
    public By continueShippingNext = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public By radioCC = By.xpath("//input[@id='paymentmethod_1']");
    public By continuePaymentNext = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    public By cardOption = By.xpath("//select[@id='CreditCardType']");
    public By cardHolderName = By.xpath("//input[@id='CardholderName']");
    public By cardNumber = By.xpath("//input[@id='CardNumber']");
    public By expireYear = By.xpath("//select[@id='ExpireYear']");
    public By cardCode = By.xpath("//input[@id='CardCode']");
    public By continueToDetailsButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public By paymentMethodCC = By.xpath("//span[normalize-space()='Credit Card']");
    public By shippingMethod2Day = By.xpath("//span[normalize-space()='2nd Day Air']");
    public By totalFinal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    public By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    public By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");
    public By orderConfirmationMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    public By continueButtonAfterPayment = By.xpath("//button[normalize-space()='Continue']");
    public By welcomeToStoreMessage = By.xpath("//h2[normalize-space()='Welcome to our store']");
    public By logOut = By.xpath("//a[normalize-space()='Log out']");

    public String getVerificationText(By by) {
        return getTextFromElement(by);
    }

    public void select(By by, String value) {
        selectByValueFromDropDown(by, value);
    }

    public void clickOn(By by) {
        clickOnElement(by);
    }

    public void mouseHoverOnElementAndClick(By by) {
        mouseHoverToElementAndClick(by);
    }

    public void mouseHoverOnElement(By by) {
        mouseHoverToElement(by);
    }

    public void sendText(By by, String value) {
        sendTextToElement(by, value);
    }

    public void clearAndSendText(By by, String value) {
        driver.findElement(by).clear();
        sendTextToElement(by, value);
    }

    public String getAttribute(By by) {
        return driver.findElement(by).getAttribute("value");
    }

    public String generateEmailId() {
        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);            //Create random username
        String emailID = "User" + userName + "@example.com";                        //Create random email Id
        return emailID;
    }
}
