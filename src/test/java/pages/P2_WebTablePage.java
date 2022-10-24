package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class P2_WebTablePage {

public P2_WebTablePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy (xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[4]/caption")
    public WebElement webTableElementi;

@FindBy (xpath ="//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr[4]")
    public WebElement dördüncüsatırElementi;

    @FindBy (xpath ="//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr[5]/td[1]/span")
    public WebElement besinciSatırİkinciElementi;

@FindBy (xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr[4]/td[2]")
    public WebElement besinciSatırÜcüncüElement;


}
