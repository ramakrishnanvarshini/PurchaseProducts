package pages.saucedemo;

import base.TestContext;
import org.openqa.selenium.By;

public class CheckoutInfoPage extends TestContext {
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBut = By.id("continue");

    public void firstName() {
        driver.findElement(firstName).sendKeys(properties.getProperty("firstName"));
    }

    public void lastName() {
        driver.findElement(lastName).sendKeys(properties.getProperty("lastName"));
    }

    public void postalCode() {
        driver.findElement(postalCode).sendKeys(properties.getProperty("postalCode"));
    }

    public void continueBut() {
        driver.findElement(continueBut).click();
    }
}
