package tests.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.P2_WebTablePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class P2_WebTableTest {
    /*
   go to url : https://en.wikipedia.org/wiki/Dell
   go to table which name is 'List of companies acquired by Dell Inc.'
   print row 4 of the table on console
   also print on console the 2nd and 3rd elements (middle 2 elements) in line 5
   ( 2nd and 3rd elements : November 2, Cloud integration leader)
   url'ye gidin: https://en.wikipedia.org/wiki/Dell
    'List of companies acquired by Dell Inc.' isimli tabloya gidin,
    tablonun 4. satırını konsolda yazdırın
    ayrıca 5. satırdaki 2. ve 3. öğeleri (ortadaki 2 öğe) konsola yazdırın
    ( 2nd and 3rd ogeler : November 2, Cloud integration leader)
    */

    @Test
    public void test01(){
        P2_WebTablePage p2_webTablePage=new P2_WebTablePage();
        Driver.getDriver().get(ConfigReader.getProperty("wikipediaUrl"));

        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",p2_webTablePage.webTableElementi);

        System.out.println("4.satır dataları :"+p2_webTablePage.dördüncüsatırElementi.getText());
        System.out.println("5.satır 2.data :"+p2_webTablePage.besinciSatırİkinciElementi.getText());
        System.out.println("5.satır 3. data :"+p2_webTablePage.besinciSatırÜcüncüElement.getText());

        ReusableMethods.waitFor(2);

        Driver.closeDriver();

    }






























}
