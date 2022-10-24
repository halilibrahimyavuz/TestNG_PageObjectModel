package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampTest {


    @Test
    public void hotelMyCampTesti(){

        //  https://www.concorthotel.com/ adresine git
        Driver.getDriver().get("https://www.concorthotel.com/");

        // login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkloginButtonu.click();

        // test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys("manager");

        // test data password : Manager1!
         hotelMyCampPage.passwordBox.sendKeys("Manager1!");

         //logın e bas
        hotelMyCampPage.loginButtonu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

       // ????
        Driver.closeDriver();
    }


}
