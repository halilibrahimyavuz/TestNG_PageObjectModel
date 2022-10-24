package tests.day22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNGReports extends  TestBaseRapor {


    @Test
    public void windowHandlereusableTest() throws IOException {

        extentTest=extentReports.createTest("window Handle","title ile ikinci sayfaya gecıs yaoıldı test edıldı");
        //extends TEst sayeesınde bılgılendırme yazma yetkısı verır


        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("herokuapp sayfasına gıdıldı"); //bılgı verırız bu yazılarla

        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("yenı wındoe lınkıne tıklandı");

        ReusableMethods.switchToWindow("New Window");
        extentTest.info("reusable methoes kullanrakacılan 2 sayfya gecıldı");


        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("title ın beklenen deger ıle aynı oldugu etst edıldı");


    }


}
