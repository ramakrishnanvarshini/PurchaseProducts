package swaglabs;

import base.TestContext;
import org.testng.annotations.Test;
import pages.saucedemo.ProductsPage;

public class Products extends TestContext {
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void productSelection() {
        productsPage.addProduct(properties.getProperty("onesie"));
        productsPage.cart();
    }
}
