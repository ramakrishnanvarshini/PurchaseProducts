package pages.saucedemo;

import base.TestContext;
import org.openqa.selenium.By;

public class CheckoutCompletePage extends TestContext {
    By backHomeBtn = By.id("back-to-products");

    public void backHomeBtn() {
        driver.findElement(backHomeBtn).click();
    }
}
