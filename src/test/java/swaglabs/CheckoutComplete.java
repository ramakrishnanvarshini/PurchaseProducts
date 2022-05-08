package swaglabs;

import base.TestContext;
import org.testng.annotations.Test;
import pages.saucedemo.CheckoutCompletePage;

public class CheckoutComplete extends TestContext {
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @Test
    public void backToHomeBtn() {
        checkoutCompletePage.backHomeBtn();
    }
}
