package swaglabs;

import base.TestContext;
import org.testng.annotations.Test;
import pages.saucedemo.CheckoutInfoPage;

public class CheckoutInfo extends TestContext {
    CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage();

    @Test
    public void CheckInfo() {
        checkoutInfoPage.firstName();
        checkoutInfoPage.lastName();
        checkoutInfoPage.postalCode();
        checkoutInfoPage.continueBut();
    }
}
