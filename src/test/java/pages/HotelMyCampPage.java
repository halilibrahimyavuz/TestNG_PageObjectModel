package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {

    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[text()='Log in']")
    public WebElement ilkloginButtonu;

    @FindBy (xpath = "//*[@placeholder='Username']")
    public WebElement usernameBox;


    @FindBy (xpath = "//*[@placeholder='Password']")
    public WebElement passwordBox;


    @FindBy (id = "btnSubmit")
    public WebElement loginButtonu;

    @FindBy(xpath = "//span[text()='Try again please']")
    public WebElement girişYapılamadıText;

    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy (linkText = "Hotel Management")
    public WebElement hotelManagement;

    @FindBy (xpath = "/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[1]/a")
    public WebElement hotelList;


    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addUser;

    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement userCreateUsername;

    @FindBy (xpath = "//select[@id='IDRole']")
    public WebElement userCreateDropdown;

    @FindBy (tagName = "(//span)[10]")
    public WebElement userCreateYesButtonu;

    @FindBy (xpath = "//button[@id='btnSubmit']")
    public WebElement userCreateSaveButton;


    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;

    @FindBy ( xpath="//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement addHotelSaveButonu;


    public void bekle(int saniye){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { //exceptıon fırlatmaması ıcın try catch bloguna attık
            e.printStackTrace();
        }

    }

    public void girişYap(){
        //her gırıste aynı ıslemlerı yapmamak ıcın bır method olusturduk ve buradan alıyoruz

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkloginButtonu.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButtonu.click();


    }

}
