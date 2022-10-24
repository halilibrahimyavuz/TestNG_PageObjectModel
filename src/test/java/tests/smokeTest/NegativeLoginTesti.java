package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class NegativeLoginTesti {

    //1- Farkli test Methodunda 3 senaryoyu test et
    //                - yanlisSifre
    //                - yanlisKulllanici
    //                - yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1
    //2) https://www.hotelmycamp.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et

    HotelMyCampPage hotelMyCampPage;

    @Test
    public void hatalıPasswordTest(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkloginButtonu.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginButtonu.click();
        Assert.assertTrue(hotelMyCampPage.girişYapılamadıText.isDisplayed());
        Driver.closeDriver();

    }

@Test
    public void yanlısusernameTesti(){
    Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    hotelMyCampPage=new HotelMyCampPage();
    hotelMyCampPage.ilkloginButtonu.click();
    hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    hotelMyCampPage.loginButtonu.click();
    Assert.assertTrue(hotelMyCampPage.girişYapılamadıText.isDisplayed());
    Driver.closeDriver();

}

    @Test
    public void ikisideyanlısTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkloginButtonu.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginButtonu.click();
        Assert.assertTrue(hotelMyCampPage.girişYapılamadıText.isDisplayed());
        Driver.closeDriver();

    }



}
