package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CrossDriver {
    private  CrossDriver(){
        //herhangı bı clastan drıver clasında obje olusturamaz ve onun uzerınde ıslem yapamaz
        //amacımız drıver ı ozel yapmak ve sadece bır amca ıcın kullanmak
        //bir clastan obje uretılmesını enghellemek ıcın sıngleton PAttern yaparız ve drıver ı prıvate yaparız
        //parametresız consructor olustumalı ve bunu prıvate yaparsak drıver özel olur
        //sadece bıızm olsuturdugumuz getdRIVER VE cLOSEdRIVER KULLANILSIN BASKADA URETILMESIN

    }

    //driver clası sayesınde eskı drıver a ıhıtyac kalmadı  extends etmeden
    //statıc method kullnarak cagıracagız

    public static WebDriver driver;


    public static WebDriver getDriver(String browser){
        //buraya parametre olarak yazdıgımız browser sayesınde coklu testler çalıstırılırken
        // arada CrossDriver a yenı browser ataması yapabılmemeıze ımkan tanıması ıcındır

        browser = browser == null ? ConfigReader.getProperty("browser") : browser;

        if (driver==null){//bu if sayesınde kod calısırken new keyword ıle drıver olusturacak
            // dıgerlerınde new keyword u devreye gırmeyecek ve her testte yenı bır drıver olusturmayacak
            //mevcut drıver ıle yola devam edecek

            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver=new OperaDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
            }
        }



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
        }
        driver=null;


    }


}

