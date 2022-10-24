package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class P3_TutorialPage {
    public P3_TutorialPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//a[text()='Phones & PDAs']")
    public WebElement phoneLinkElementi;


    @FindBy(xpath = "//div[@class='caption']/h4")
    public List<WebElement> telefonMarkaAdı;

@FindBy (xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")
    public List<WebElement> hepsiİçinsepeteEkleButonu;


@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[2]")
    public WebElement likeButonu;

@FindBy (xpath="//*[@id=\"cart\"]/button")
    public WebElement sepetbutonu;

@FindBy (xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[2]/a")
    public List<WebElement> sepettekiTelMarkaAdı;

@FindBy (xpath = "//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[4]/td[2]")
    public WebElement totalPrice;








}
