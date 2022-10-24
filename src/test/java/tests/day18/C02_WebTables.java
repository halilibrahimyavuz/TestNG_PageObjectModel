package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.HotelMyCampWebTablePage;
import utilities.Driver;

import java.util.List;

public class C02_WebTables {

    HotelMyCampPage hotelMyCampPage;
    HotelMyCampWebTablePage hotelMyCampWebTablePage;

    @Test (priority = 1)
    public void login(){
        //● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.
        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin

        //            ○ Username : manager
        //            ○ Password : Manager1!
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girişYap();



    }

    @Test (priority = 2)
    public void table(){
        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun.
        //         sutun dedıgı = tbody  bunların sayısını lıst e atarak sıze uzerınde bulabılırız
        //header kısmında 1. satır ve altındakı dataları locate edelım
        ////thead//tr[1]//th

        hotelMyCampWebTablePage=new HotelMyCampWebTablePage();
        List<WebElement> headerDataLis=hotelMyCampWebTablePage.headerBirinciSatırDatalar;
        System.out.println("tablodakı sutun sayısı : "+headerDataLis.size());

        //      ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.

        System.out.println(hotelMyCampWebTablePage.tümBodyWebElement.getText());
        //bir tane body elemnetının getır o gelınce uzerındekı tum elementlerde onunla beraber hepsı gelecek
        //List yapmama gerek kalmadı
        //bu ozellık body ın ozellıgıdır
        //tek bır strıng ın parcxası gıbı gelırler tek tek ulasmamaız mumkun olmaz
        // sadece CONTAINS METthodu İLE  var olup olmadıgını bakabılırız
        //eger her bır datayı ayrı ayrı almak ıstersek o zaman
        //---->    //tbody//td seklınde lcate edıp bır lıste atabılırız

        List<WebElement> bodyTümDataList=hotelMyCampWebTablePage.tümBodyDatalarıList;
        System.out.println("body de kı data sayısı : "+bodyTümDataList.size());

        for (WebElement each:bodyTümDataList) {
            System.out.print(each.getText());

        }

    }


    @Test (priority = 3)
    public void printRows(){
        //● printRows( ) metodu oluşturun //tr
        //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        List<WebElement> tumSatırlar=hotelMyCampWebTablePage.bodydekiTümSatır;
        System.out.println("body dekı tum satır sayısı"+tumSatırlar.size());

        //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        int sayaç=1;
        for (WebElement each:tumSatırlar) {
            System.out.println(sayaç+". satır elemanları : "+each.getText());
            sayaç++;
        }

        //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.

        System.out.println("4.satır : "+tumSatırlar.get(3).getText());
        //ındex 0 dan basladıgı ıcın lıstenın 4. satırı ındexı=3 olan olacagı ııcn 3. satırı getırdık





    }



}
