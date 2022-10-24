package tests.day19;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.HotelMyCampWebTablePage;
import utilities.Driver;

public class C01_WeTableDinamikLocate {
    HotelMyCampWebTablePage hotelMyCampWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    //3 test methodu olustur...
    //1. method === satır numarası verdıgımde bana o satırdakı dataları yazdırsın
    //2.method  === satır no ve data numarsı gırdıgımde (hucre) o data yı yazdırsın
    //3.method === sutun numarsı verdıgımde tum sutunu yazdırsın

    @Test (priority = 1)
    public void satırYazdırTesti(){
        hotelMyCampPage=new HotelMyCampPage();
         hotelMyCampPage.girişYap(); //
        //1. method === satır numarası verdıgımde bana o satırdakı dataları yazdırsın

        //2.satır yazdır --> //tbody//tr[2]
        //7.satır -->    //tbody//tr[7]
        //dolasyısıyla method olsutup parametre olarak gırılen sayıyı gırsek sonra onu yazdırsa
        //bu methodu pages sayfasında yapmak daha mantıklı

        hotelMyCampWebTablePage=new HotelMyCampWebTablePage();
        WebElement ücüncüSatırElementi=hotelMyCampWebTablePage.satırGetir(3);
        System.out.println(ücüncüSatırElementi.getText());

        Driver.closeDriver();

    }


@Test (priority = 2)
    public void hücreGetirTesti(){
    //2.method  === satır no ve data numarsı gırdıgımde (hucre) o data yı yazdırsın
    hotelMyCampPage=new HotelMyCampPage();
    hotelMyCampPage.girişYap();

        //2. satırın 4. data sı?? ----> //tbody//tr[2]//td[4]
        //4. satırın 5. data sı?? ----> //tbody//tr[4]//td[5]

    hotelMyCampWebTablePage=new HotelMyCampWebTablePage();
    System.out.println("girdigiiniz hucredekı element : "+hotelMyCampWebTablePage.hücreWebElementGetir(3, 5));

    Driver.closeDriver();
}

@Test (priority = 3)
    public void tümSutunYazdırTesti(){
    //3.method === sutun numarsı verdıgımde tum sutunu yazdırsın
    hotelMyCampPage=new HotelMyCampPage();
    hotelMyCampPage.girişYap();

    hotelMyCampWebTablePage=new HotelMyCampWebTablePage();
    hotelMyCampWebTablePage.dataYazdır(4); //her bır satır ın ısteden datası sutun olmadıgı ıcın bu sekılde ısterız


}











}
