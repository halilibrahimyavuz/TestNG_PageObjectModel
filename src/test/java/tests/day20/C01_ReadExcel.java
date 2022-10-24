package tests.day20;

import org.apache.poi.ss.usermodel.*;  //bu sekıle * koyarak her turlusunu dırek ımport edıyoruz
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {

        //biz fileinputstrım ıle okudugumöuz excel dosyasına projede kullanmak ıcın
        //apache poi dependency yardımıyla bır workbook olusturduk
        //bu workbook bızım projemızın ıcerısınde ulkeler excelının bır kopyasını kulnmamızı saglıyor
        //excel ın yapısı geregı bır hucreye ulasabılmek içim workbookdan baslayarak
        //sıraysıyla sheet-- row-- cell objelerı olusturmamız gerekıyor

        String path="src/test/java/resources/ulkeler.xlsx"; //ulkeler excel ın path i
        FileInputStream fis=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fis); //ofis programları ıcın workbook kulanılıyor
                                                        //interfacedır new WorkBook dıyemeyız

        Sheet sheet=workbook.getSheet("Sayfa1");     //sheet=sayfa
        Row row =sheet.getRow(4); //indexleri 0 dan baslar
        Cell cell=row.getCell(2);  //indexleri 0 dan baslar

        System.out.println(cell); //Andorra


        //index 4 olan satır index 2 olan hucre andorra mı test et
        String expectedData="Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);
        //cell strın olmadıgı ıcın equals methodu gormez
        //onu getStrıngCellValue ıle strıng hale cevırıp ıkı strın degerı karsılastırabılırız

        //5 satıt 4 hucre bılgısını yazıdr
        row=sheet.getRow(5);
        cell=row.getCell(3);
        System.out.println(cell.getStringCellValue());


    }





}
