package pages.saucedemo;

import base.TestContext;
import org.openqa.selenium.By;

public class SwagLoginPage extends TestContext {

    By userName = By.id("user-name");
    By password = By.id("password");
    By submit = By.id("login-button");


    public void userName() {
        driver.findElement(userName).sendKeys(properties.getProperty("userName"));
    }

    public void password() {
        driver.findElement(password).sendKeys(properties.getProperty("password"));
    }

    public void submit() {
        driver.findElement(submit).click();
    }
}
