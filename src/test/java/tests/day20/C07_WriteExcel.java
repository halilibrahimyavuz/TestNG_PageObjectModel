package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C07_WriteExcel {

    @Test
    public void test() throws IOException {



        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        //ülkeler excelıne 5. sutun olarak NUfus Sutunu ekle
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");

        //3. satırdakı ulkenın nufusunu 1.000.000 yaoalım
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");

    }
}
