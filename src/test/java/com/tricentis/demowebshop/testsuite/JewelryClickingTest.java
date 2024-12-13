package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.testdata.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JewelryClickingTest extends TestBase {

    HomePage homePage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage= new HomePage();
    }

    @Test
    public void jewelryDisplay(){
        homePage.jewelyClicking();
    }
}
