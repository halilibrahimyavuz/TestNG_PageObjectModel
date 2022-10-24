package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HotelMyCampWebTablePage {


    public HotelMyCampWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy (xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatırDatalar;
    //tek element dondursede cok da dondurse bu sekılde tek bır formatta yazılır
    // bu satırn elemanları bırden fazkla oldugu ıcın
    // void olarak -->List<WebElement>  dondurur ve lıstın ııcıne atarız

@FindBy (xpath = "//tbody")
    public WebElement tümBodyWebElement;


   @FindBy (xpath = "//tbody//td")
    public List<WebElement> tümBodyDatalarıList;

   @FindBy (xpath = "//tbody//tr")
    public List<WebElement> bodydekiTümSatır;


     public WebElement satırGetir(int satırNO){
       //2.satır yazdır --> //tbody//tr[2]
       //7.satır -->    //tbody//tr[7]
       //dolasyısıyla method olsutup parametre olarak gırılen sayıyı gırsek sonra onu yazdırsa
       //bu methodu pages sayfasında yapmak daha mantıklı

       String satırDinamikXpath="//tbody//tr["+ satırNO +"]";
       WebElement satırElementi=Driver.getDriver().findElement(By.xpath(satırDinamikXpath));
       //satır elementı webElement olarak hazr hale geldı

         return satırElementi;

   }

    public String hücreWebElementGetir(int satır, int data) { //2 parametre gırdık satır ve data için

        //2. satırın 4. data sı?? ----> //tbody//tr[2]//td[4]
        //4. satırın 5. data sı?? ----> //tbody//tr[4]//td[5]

        String dinamikHücreXpath="//tbody//tr["+satır+"]//td["+data+"]"; // satır ve data yı strıngden ayırıyorum onları dınamık yapıyorum
        //ayırmasaydım sabıt olacaktı bu yuzden boldum ve dınamık hale getırdım
        WebElement dinamikHücreElementi=Driver.getDriver().findElement(By.xpath(dinamikHücreXpath)); //dınamık xpath ı xpath ıcıne yazdım

        String hücreDatasi=dinamikHücreElementi.getText(); // strıng dodursun dedıgımız ıcın Strıng e esıtledık
        // ve webElementı getTExt ile strıng halıne getırdık

        return hücreDatasi;

    }


    public void dataYazdır(int data) {
         // her bır satırdakı ıstenen data elementını yazdırabılmek ıcın once satır sayısını bılmeye ıhtıyacım var
        // satır sayısını bul

        int satırSayısı= bodydekiTümSatır.size(); //bu classta olduguı ıcın obje ye gerek yok

        for (int i=1; i<=satırSayısı; i++){
            System.out.println(hücreWebElementGetir(i, data));
        }



    }


}
