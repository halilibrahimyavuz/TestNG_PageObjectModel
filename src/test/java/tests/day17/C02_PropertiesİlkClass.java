package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesİlkClass {

    @Test
    public void positiveLoginTest(){
        //hotel my camp sıtesıne posıtıve testını POM a uygun yapınız
        // https://https://www.hotelmycamp.com/ adresine git

        //Driver.getDriver().get("buraya propertıes dosyasına gıt HMCUrl yı getır");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        // login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkloginButtonu.click();

        // test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));


        // test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.bekle(3);


        hotelMyCampPage.loginButtonu.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

          Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());
         Driver.closeDriver();

    }

}
