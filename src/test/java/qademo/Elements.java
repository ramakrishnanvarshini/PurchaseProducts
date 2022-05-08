package qademo;

import base.TestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.qademo_elements.ElementsPage;
import utils.Util;

public class Elements extends TestContext {
    ElementsPage elementsPage = new ElementsPage();
    Util util = new Util();

    @BeforeTest
    public void openUrl() {
        getUrl("qaDemoUrl");
    }

    @Test
    public void clickElements() {
        util.adHandle(driver);
        elementsPage.setFieldButtons("Elements");

    }
}
