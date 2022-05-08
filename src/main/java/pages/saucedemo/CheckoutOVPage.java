package pages.saucedemo;

import base.TestContext;
import org.openqa.selenium.By;

public class CheckoutOVPage extends TestContext {

    By finishBtn = By.id("finish");

    public void finishBtn() {
        driver.findElement(finishBtn).click();
    }
}
