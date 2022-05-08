package swaglabs;

import base.TestContext;
import org.testng.annotations.Test;
import pages.saucedemo.CheckoutOVPage;

public class CheckoutOV extends TestContext {
    CheckoutOVPage checkoutOVPage = new CheckoutOVPage();

    @Test
    public void checkOV() {
        checkoutOVPage.finishBtn();
    }
}
