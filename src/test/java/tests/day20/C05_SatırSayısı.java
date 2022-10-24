package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_SatırSayısı {

    @Test
    public void test01() throws IOException {

        //ülkeler excelındekı sayfa1 ve sayfa2 dekı satır sayılarını
        //ve kullanılan satır sayılarını bulun.
        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);
        int sayfa1SatırSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
        int sayfa1FizikiKullanılanSatırSayisi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();

        System.out.println("1.sayfa satir sayısı : "+sayfa1SatırSayisi);  //index ile gelır
        System.out.println("1 sayfa fızıkı kulanılan satır sayısı : "+sayfa1FizikiKullanılanSatırSayisi); //real deger gelır 1 den baslar

        //fiziki kullanılan satır sayısı ındex ıle degıl sayma sayıları ıle calısır


        int sayfa2SatırSayisi=workbook.getSheet("Sayfa2").getLastRowNum();
        int sayfa2FizikiKullanılanSatırSayisi=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();

        System.out.println("2.sayfa satir sayısı : "+sayfa2SatırSayisi);  //index ile gelır
        System.out.println("2 sayfa fızıkı kulanılan satır sayısı : "+sayfa2FizikiKullanılanSatırSayisi); //real
    }

}
