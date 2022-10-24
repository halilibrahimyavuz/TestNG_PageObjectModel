package tests.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P1_DemeGuruPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P1_DemeGuruTest {
    /*
    http://demo.guru99.com/test/drag_drop.html url e git
    DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
    CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
    DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
    CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
    Perfect butonun goruntulendigini dogrulayin
     */


    @Test
    public void test01() throws InterruptedException {
        P1_DemeGuruPage p1_demeGuruPage =new P1_DemeGuruPage();
        Driver.getDriver().get(ConfigReader.getProperty("demoGuruUrl"));

        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(p1_demeGuruPage.bankElementi, p1_demeGuruPage.debitSideAccount)
                .dragAndDrop(p1_demeGuruPage.salesElementi, p1_demeGuruPage.creditSideAccount)
                .dragAndDrop(p1_demeGuruPage.ilkbesbinElementi, p1_demeGuruPage.debitSiteAmmount)
                .dragAndDrop(p1_demeGuruPage.ikincibesbinElementi,p1_demeGuruPage.creditSideAmmount)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();

        Assert.assertTrue(p1_demeGuruPage.perfectElementi.isDisplayed());

        ReusableMethods.waitFor(2);

        Driver.closeDriver();

    }



}
