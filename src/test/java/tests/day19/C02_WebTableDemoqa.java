package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoqa {

    //Bir Class olusturun D19_WebtablesHomework
    //  1. “https://demoqa.com/webtables” sayfasina gidin
    //  2. Headers da bulunan department isimlerini yazdirin
    //  3. sutunun basligini yazdirin
    //  4. Tablodaki tum datalari yazdirin
    //  5. Tabloda kac cell (data) oldugunu yazdirin
    //  6. Tablodaki satir sayisini yazdirin
    //  7. Tablodaki sutun sayisini yazdirin
    //  8. Tablodaki 3.kolonu yazdirin
    //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
    //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve
    // sutun sayisini girdigimde bana datayi yazdirsin


    @Test
    public void demoqaTesti(){
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));

        //  2. Headers da bulunan department isimlerini yazdirin
        DemoqaPage demoqaPage=new DemoqaPage();
        System.out.print("başlık satırı elemenleri : "+demoqaPage.baslikSatiriElementi.getText());
        //ikinci.yontem--> baslıkların lıstesını koyabılreıız -*--> baslıklarWebelementListesi


        //  3. -->3.sutunun basligini yazdirin
        System.out.println("3.sutun başlıgı : "+demoqaPage.basliklarWebelementiListesi.get(2).getText());
                                                                //index=2 --> 3. eleman demektır

        //  4. Tablodaki tum datalari yazdirin
        System.out.println("=======TÜM BODY===== ");
        System.out.println(demoqaPage.bodyTekWebelement.getText());

        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("Tablodaki data sayısı : "+demoqaPage.tümDataWebelementList.size());

        //  6. Tablodaki satir sayisini yazdirin
        System.out.println("Tablodakı tum satir sayısı: "+demoqaPage.tümSatırlarWebelementList.size());

        //  7. Tablodaki sutun sayisini yazdirin
       // System.out.println("tablodakı sutun sayısı"+demoqaPage.basliklarWebelementiListesi.size());
        System.out.println("tablodakı sutun sayısı : "+
                demoqaPage.tümDataWebelementList.size()/demoqaPage.tümSatırlarWebelementList.size());


        //  8. Tablodaki 3.kolonu yazdirin
     //   demoqaPage.sutunYazdır(1);

        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
       //   demoqaPage.ismeGoreMaasYazdir("Kierra");

        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve
        // sutun sayisini girdigimde bana datayi yazdirsin
       // demoqaPage.hücreYazdır(2,3);



    }





}
