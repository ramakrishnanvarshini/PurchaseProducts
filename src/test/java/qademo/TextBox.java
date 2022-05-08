package qademo;

import base.TestContext;
import org.testng.annotations.Test;
import pages.qademo_elements.TextBoxPage;

public class TextBox extends TestContext {
    TextBoxPage txtBox = new TextBoxPage();

    @Test
    public void clickTextBox() {
        txtBox.clickTextBox();
    }

    @Test
    public void enterTxtFields() {
        txtBox.setUserName();
        txtBox.setUserEmail();
        txtBox.setCurrentAddress();
        txtBox.setPermanentAddress();
        txtBox.setSubmit();
    }
}
