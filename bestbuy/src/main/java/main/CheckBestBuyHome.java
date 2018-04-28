package main;

import base.CommonAPI;

public class CheckBestBuyHome extends CommonAPI {
    //my best buy
    public void myBestBuy(){
        clickByLinkedText("MY BEST BUY ›");
        navigateBack();
        clickByLinkedText("View Points & Certificates");
        navigateBack();
        clickByLinkedText("Member Offers");
        navigateBack();
        clickByLinkedText("Sign in or Create Account");
    }

    //CREDIT CARDS ›
    public void creditCards(){
        clickByLinkedText("CREDIT CARDS ›");
        navigateBack();
        clickByLinkedText("Make Payment/Check Balance");
        navigateBack();
        clickByLinkedText("Credit Card Offers");
        navigateBack();
        clickByLinkedText("Apply Now");
        navigateBack();

    }

    //ORDERS & RETURNS ›
    public void OnR(){
        clickByLinkedText("ORDERS & RETURNS ›");
        navigateBack();
        clickByLinkedText("Order Status");
        navigateBack();
        clickByLinkedText("Shipping, Delivery & Store Pickup");
        navigateBack();
        clickByLinkedText("Return & Exchange Promise");
        navigateBack();
        clickByLinkedText("Price Match Guarantee");
        navigateBack();
        clickByLinkedText("Pay with Points");

    }

    //SUPPORT & SERVICES ›
    public void support(){
        clickByLinkedText("SUPPORT & SERVICES ›");
        navigateBack();
        clickByLinkedText("Customer Service");
        navigateBack();
        clickByLinkedText("Protection Plans");
        navigateBack();
        clickByLinkedText("Trade-In Program");
        navigateBack();
        clickByLinkedText("Product Recalls");
        navigateBack();
    }

    //Others
    public void others(){
        clickByLinkedText("PARTNERSHIPS ›");
        navigateBack();
        clickByLinkedText("Affiliate Program");
        navigateBack();
        clickByLinkedText("Developers");
        navigateBack();
        clickByLinkedText("Best Buy Education");
        navigateBack();
        clickByLinkedText("Best Buy for Business");
        navigateBack();
        clickByLinkedText("Advertise with Us");
        navigateBack();
        clickByLinkedText("Government relations");
        navigateBack();
        clickByLinkedText("Advertise with us");
        navigateBack();
        clickByLinkedText("INTERNATIONAL SITES ›");
        navigateBack();
    }

}
