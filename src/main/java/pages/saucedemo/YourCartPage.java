package pages.saucedemo;

import base.TestContext;
import org.openqa.selenium.By;

public class YourCartPage extends TestContext {

    By checkoutButton=By.xpath("//*[@id='checkout']");

    public void checkoutButton(){
        driver.findElement(checkoutButton).click();
    }
}
