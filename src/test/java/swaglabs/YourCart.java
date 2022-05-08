package swaglabs;

import base.TestContext;
import org.testng.annotations.Test;
import pages.saucedemo.YourCartPage;

public class YourCart extends TestContext {
    YourCartPage yourCartPage=new YourCartPage();

    @Test
    public void cartCheckout(){
        yourCartPage.checkoutButton();
    }
}
