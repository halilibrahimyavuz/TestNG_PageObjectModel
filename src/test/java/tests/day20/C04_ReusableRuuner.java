package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_ReusableRuuner {

    @Test
    public void test01(){
        //ülkeler excelınde sayfa1 de 11. dekı satırın 2 . hucresın Azerbaycan oldugunu test et

        String path="src/test/java/resources/ulkeler.xlsx";
        String expectedData="Azerbaycan";
        String actualData= ReusableMethodsExcel.hucreGetir(path,"Sayfa1",11,2).toString();

        Assert.assertEquals(actualData,expectedData);

    }
}
