package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_FacebookTesti extends TestBaseRapor {


    @Test
    public void facebookTest() throws InterruptedException {

        extentTest=extentReports.createTest("facebook","fake ısımle gırılemedıgı test edıldı");


        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");
extentTest.info("facebook a gıdıldı");

        //2-	POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

        //3-	Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin

        FacebookPage facebookPage=new FacebookPage();
        Faker faker=new Faker();

        facebookPage.emailButton.sendKeys(faker.internet().emailAddress());
        facebookPage.passWordButton.sendKeys(faker.internet().password());
        facebookPage.loginButton.click();
    extentTest.info("ilgılı alanlarfaker ile  dolduruldu");
        //4-	Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookPage.girişYapılamadıTExt.isDisplayed());
        extentTest.pass("girilemedıgını test edın");

    }


}
