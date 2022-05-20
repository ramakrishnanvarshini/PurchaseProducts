package swaglabs;

import base.TestContext;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.saucedemo.SwagLoginPage;

public class SwagLogin extends TestContext {
    SwagLoginPage swagLoginPage = new SwagLoginPage();

    @BeforeTest
    public void openUrl() {
        getUrl("sauceDemoUrl");
    }

    @Test
    public void swagLoginPage() {
        swagLoginPage.userName(properties.getProperty("userName"));
        swagLoginPage.password(properties.getProperty("password"));
        swagLoginPage.submit();
    }

    @Test
    public void invalidUserNameAndValidPassword(){
        try{
            swagLoginPage.userName(properties.getProperty("wrongUserName"));
            swagLoginPage.password(properties.getProperty("wrongPassword"));
            swagLoginPage.submit();
            Assert.assertEquals(swagLoginPage.actualErrorMessage(),properties.getProperty("errorMsg"),"actual and expected both are same");
        }catch (AssertionError a){
            a.printStackTrace();
        }
    }
    @Test
    public void verifyTotalProducts(){
        swagLoginPage.totalItems(properties.getProperty("6"));
    }
}
