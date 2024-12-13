package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu']//a[normalize-space()='Jewelry']")
    WebElement jewelry;

    // Constructor to initialize elements
    public HomePage() {
        PageFactory.initElements(driver, this); // Make sure this line is included
    }
    public void jewelyClicking(){
        clickOnElement(jewelry);
        Reporter.log("click" + jewelry.toString());
        CustomListeners.test.log(Status.PASS,"click" + jewelry);
    }
}
