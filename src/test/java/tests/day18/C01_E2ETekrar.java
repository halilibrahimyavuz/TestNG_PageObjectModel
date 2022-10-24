package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_E2ETekrar {

    @Test
    public void e2eTesti(){
        //1.	Tests packagenin altına class olusturun: D18_HotelRoomCreation
        //2.	Bir metod olusturun: RoomCreateTest()
        //3.	https://qa-environment.concorthotel.com/ adresine gidin.

       Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkloginButtonu.click();

        //4.	Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
        //	a. Username : manager	b. Password : Manager1!
            hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
            hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

            //5.	Login butonuna tıklayın.
        hotelMyCampPage.loginButtonu.click();


        //6.	Hotel Management menusunden Add Hotelroom butonuna tıklayın.
        hotelMyCampPage.addUser.click();

        //7.	Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        actions.click(hotelMyCampPage.userCreateUsername)
                .sendKeys(ConfigReader.getProperty("HMCValidUsername"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("HMCValidPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.idNumber().ssnValid())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.random().hex())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.country().name())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.date().birthday().toString())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.random().hex())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Select select=new Select(hotelMyCampPage.userCreateDropdown);
        select.selectByValue("4");

         hotelMyCampPage.userCreateYesButtonu.click();
        hotelMyCampPage.userCreateSaveButton.click();


        //8.	Save butonuna basin.
        //9.	“HotelRoom was inserted successfully” textinin göründüğünü test edin.
        //10.	OK butonuna tıklayın.
        //11.	Hotel rooms linkine tıklayın.
        //12.	"LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..






    }
}
