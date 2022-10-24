package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_WebTablesTekrar {
    @Test
    public void test01(){
        //Bir Class olusturun D19_WebtablesHomework
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));

        //  2. Headers da bulunan department isimlerini yazdirin
        DemoqaPage demoqaPage=new DemoqaPage();
        System.out.println("baslık satırı elementı : "+demoqaPage.baslikSatiriElementi.getText());

        //baska bır yontem baslıları lısteye koy ----> basliklarWebelementiListesi

        //  3.---> 3.  sutunun basligini yazdirin
        System.out.println("3. sutun baslıgı  : "+demoqaPage.basliklarWebelementiListesi.get(2).getText());


        //  4. Tablodaki tum datalari yazdirin
        System.out.println("body dekı tum datalar"+demoqaPage.bodyTekWebelement.getText());

        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println( "tablodakı data sayısı : "+demoqaPage.tümDataWebelementList.size());

        //  6. Tablodaki satir sayisini yazdirin
        System.out.println("tum satırların sayısı : "+demoqaPage.tümSatırlarWebelementList.size());

        //  7. Tablodaki sutun sayisini yazdirin
        System.out.println("tablodakı sutun sayısı : "+demoqaPage.basliklarWebelementiListesi.size());
        System.out.println("tablodakı sutun sayısı : "+demoqaPage.tümDataWebelementList.size()/demoqaPage.tümSatırlarWebelementList.size());

        //  8. Tablodaki 3.kolonu yazdirin
        demoqaPage.sutunYazdır(3);

        demoqaPage.sutunYazdır(1);

        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin

        demoqaPage.ismeGöreMaasYAzdır("Kierra");


        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve
        // sutun sayisini girdigimde bana datayi yazdirsin
        demoqaPage.hucreYazdır(1,2);
    }
}
