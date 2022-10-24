package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMyCampNegativeTest {

    @Test
    public void hotelMyCampTesti(){
    //NegativeTest
        //1	Bir test method olustur NegativeLoginTest() https://www.concorthotel.com/ adresine git
        Driver.getDriver().get("https://www.concorthotel.com/");

        // login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkloginButtonu.click();

        // test data username: manager1 ,
        hotelMyCampPage.usernameBox.sendKeys("manager1");

        // test data password : manager1!
        hotelMyCampPage.passwordBox.sendKeys("manager1!");
        hotelMyCampPage.loginButtonu.click();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelMyCampPage.girişYapılamadıText.isDisplayed(),"giris yapılamamsı gerekırken gırıs yapıldı");

        Driver.closeDriver();

    }
}
