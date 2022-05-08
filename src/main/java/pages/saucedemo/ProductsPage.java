package pages.saucedemo;

import base.TestContext;
import org.openqa.selenium.By;

public class ProductsPage extends TestContext {
    By cart =By.xpath("//*[@id='shopping_cart_container']/a/span");

    public void addProduct(String productName) {
        driver.findElement(By.xpath("//div[contains(text(),'" + productName + "')]/../../../div[@class='pricebar']/button")).click();
    }
    public void cart(){
        driver.findElement(cart).click();
    }
}
