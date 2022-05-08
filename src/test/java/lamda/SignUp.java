package lamda;

import base.TestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.lamda.SignUpPage;

public class SignUp extends TestContext {
    SignUpPage signUpPage = new SignUpPage();

    @BeforeTest
    public void openUrl() {
        getUrl("url");
    }

    @Test
    public void fillSignUp() {
        signUpPage.startFreeTesting();
        signUpPage.fullName();
        signUpPage.businessEmail();
        signUpPage.desiredPassword();
        signUpPage.phone();
        signUpPage.companyName();
        signUpPage.designation();
        signUpPage.agree();
    }

    @AfterTest
    public void exit() {
        close();
    }

}
