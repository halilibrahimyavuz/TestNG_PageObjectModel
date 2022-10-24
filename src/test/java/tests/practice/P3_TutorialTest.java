package tests.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P3_TutorialPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P3_TutorialTest {

//~ url'ye gidin: "http://tutorialsninja.com/demo/index.php?route=common/home"
//~ Phones & PDAs e tıklayın
//~ telefonların marka adını al
//~ tüm elemanlar için ekle düğmesine tıklayın
//~ siyah toplam eklenen sepet düğmesine tıklayın
//~ listenin isimlerini sepetten al
//~ görüntülenen listeden ve sepet listesinden isimleri karşılaştırın
//~ goruntulenen listede toplam fiyatin $583.19 oldugunu test edin
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("tutorialUrl"));
        P3_TutorialPage p3_tutorialPage=new P3_TutorialPage();

        p3_tutorialPage.phoneLinkElementi.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        System.out.println("*****Telefon Marka İsimleri****");
        for (WebElement each: p3_tutorialPage.telefonMarkaAdı) {
            System.out.println(each.getText());
        }
        Thread.sleep(2000);

           for (WebElement each: p3_tutorialPage.hepsiİçinsepeteEkleButonu) {
            each.click();
        }

        Thread.sleep(2000);

        p3_tutorialPage.sepetbutonu.click();
        Thread.sleep(2000);
        System.out.println("****sepettekı telefonların marka adı *****");
        for (WebElement each:p3_tutorialPage.sepettekiTelMarkaAdı) {
            System.out.println(each.getText());

        }

        //~ görüntülenen listeden ve sepet listesinden isimleri karşılaştırın
        List<String> goruntulenenUrunler = p3_tutorialPage.telefonMarkaAdı.stream().map(WebElement::getText).collect(Collectors.toCollection(ArrayList::new));
        List<String> sepettekiUrunler = p3_tutorialPage.sepettekiTelMarkaAdı.stream().map(WebElement::getText).collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(goruntulenenUrunler);
        Collections.sort(sepettekiUrunler);

        Assert.assertEquals(goruntulenenUrunler,sepettekiUrunler);




        Assert.assertTrue(p3_tutorialPage.totalPrice.getText().contains("$583.19"));
    }
}
