package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookTest {

    @Test (groups = "miniRegression")
    public void facebookTest() throws InterruptedException {

        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");

        //2-	POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //3-	Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin

        FacebookPage facebookPage=new FacebookPage();
        Faker faker=new Faker();

        facebookPage.emailButton.sendKeys(faker.internet().emailAddress());
        facebookPage.passWordButton.sendKeys(faker.internet().password());
        facebookPage.loginButton.click();

        //4-	Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookPage.girişYapılamadıTExt.isDisplayed());


    }









}
