package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C06_ExceliMapeYukleme {


    @Test
    public void test01(){
        // dosya yolu ve sayfa ismi verilen bie excel sheet'i map olarak kaydeden
        // reusable bir method olusturalim

        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        System.out.println(ReusableMethodsExcel.mapOlustur(path,sayfaAdi));

        //olusturdugumuz map ı kullnarak Turkey in bilgilerini yazdırın

        Map<String,String> ülkelerMap= ReusableMethodsExcel.mapOlustur(path,sayfaAdi);
        System.out.println(ülkelerMap.get("Turkey"));

        //nederland varmı etst et
        Assert.assertTrue(ülkelerMap.containsKey("Netherlands"));


    }
}
