package main;

import base.CommonAPI;

public class CheckEbayHome extends CommonAPI {
    //Buy
    public void Buy(){
        clickByLinkedText("Registration");
        navigateBack();
        clickByLinkedText("eBay Money Back Guarantee");
        navigateBack();
        clickByLinkedText("Bidding & buying help");
        navigateBack();
        clickByLinkedText("Stores");
    }
    //Sell
    public void Sell(){
        clickByLinkedText("Start selling");
        navigateBack();
        clickByLinkedText("Learn to sell");
        navigateBack();
        clickByLinkedText("Business sellers");
        navigateBack();
        clickByLinkedText("Affiliates");
        navigateBack();
    }
    //Tools & apps
    public void TnA(){
        clickByLinkedText("Mobile apps");
        navigateBack();
        clickByLinkedText("Developers");
        navigateBack();
        clickByLinkedText("Security center");
        navigateBack();
        clickByLinkedText("eBay official time");
        navigateBack();
        clickByLinkedText("Site map");
        navigateBack();
    }
    //eBay companies
    public void companies(){
        clickByLinkedText("eBay Classifieds");
        navigateBack();
        clickByLinkedText("StubHub");
        navigateBack();
        clickByLinkedText("See all companies");
        navigateBack();
    }
    //about ebay
    public void about(){
        clickByLinkedText("Company info");
        navigateBack();
        clickByLinkedText("News");
        navigateBack();
        clickByLinkedText("Investors");
        navigateBack();
        clickByLinkedText("Careers");
        navigateBack();
        clickByLinkedText("Diversity & Inclusion");
        navigateBack();
        clickByLinkedText("Global Impact");
        navigateBack();
        clickByLinkedText("Government relations");
        navigateBack();
        clickByLinkedText("Advertise with us");
        navigateBack();
        clickByLinkedText("Policies");
        navigateBack();
    }
}
