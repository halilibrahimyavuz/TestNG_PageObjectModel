package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {
    public DemoqaPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@class='rt-tr']")
    public WebElement baslikSatiriElementi;

    @FindBy(xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public List<WebElement> basliklarWebelementiListesi;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement bodyTekWebelement;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> tümDataWebelementList;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> tümSatırlarWebelementList;


    public void sutunYazdır(int sutunNo) {
       int satırSayısı=tümSatırlarWebelementList.size();
        String dinamikXpath;
        WebElement geciciElement;
        System.out.println(basliklarWebelementiListesi.get(sutunNo-1).getText());

       for (int i=1 ; i<=satırSayısı ; i++){

           dinamikXpath="((//div[@class='rt-tr-group'])["+ i +"]//div[@class='rt-td'])["+sutunNo +"]";
           geciciElement=Driver.getDriver().findElement(By.xpath(dinamikXpath));
           System.out.println(geciciElement.getText());
       }

    }

    public void ismeGöreMaasYAzdır(String isim) {
        int satırSayısı=tümSatırlarWebelementList.size();
        String dinamikXpath;
        String satırdakıİsim;
        String salary;

        for (int i=1 ; i<satırSayısı ; i++){
            dinamikXpath="((//div[@class='rt-tr-group'])["+ i +"]//div[@class='rt-td'])["+1 +"]";
            satırdakıİsim=Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            dinamikXpath="((//div[@class='rt-tr-group'])["+ i +"]//div[@class='rt-td'])["+5 +"]";
            salary=Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            if (satırdakıİsim.equals(isim)){
                System.out.println(salary);
            }
        }


    }

    public void hucreYazdır(int satır, int sütun) {
        String dinamikXpath="((//div[@class='rt-tr-group'])["+ satır+"]//div[@class='rt-td'])["+sütun +"]";

        System.out.println(Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText());
    }
}
