package utils;

import base.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.qademo_elements.ElementsPage;

public class Util {

    ElementsPage elementsPage = new ElementsPage();

    public void adHandle(WebDriver driver){
      driver.switchTo().frame("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0");
      driver.findElement(By.xpath("//*[@id=\"cbb\"]/svg/path[2]")).click();
      driver.switchTo().defaultContent();
    }
}
