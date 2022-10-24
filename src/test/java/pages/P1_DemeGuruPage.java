package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P1_DemeGuruPage {
    public P1_DemeGuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@class='button button-orange'])[5]")
    public WebElement bankElementi;

    @FindBy (xpath = "(//a[@class='button button-orange'])[6]")
    public  WebElement salesElementi;

    @FindBy (xpath = "(//a[@class='button button-orange'])[2]")
    public WebElement ilkbesbinElementi;

    @FindBy (xpath = "(//a[@class='button button-orange'])[4]")
    public WebElement ikincibesbinElementi;


    @FindBy (xpath="(//li[@class='placeholder'])[1]")
    public WebElement debitSideAccount;


    @FindBy (xpath="(//li[@class='placeholder'])[2]")
    public WebElement debitSiteAmmount;

    @FindBy (xpath="(//li[@class='placeholder'])[3]")
    public WebElement creditSideAccount;

    @FindBy (xpath="(//li[@class='placeholder'])[4]")
    public WebElement creditSideAmmount;

@FindBy (xpath = "(//a[@class='button button-green'])[1]")
    public WebElement perfectElementi;

}
