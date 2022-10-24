package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlısKeyKullanımı {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCurl"));
        //ust satırda hatalı gırıs olmustur
        //HMCURL yerıne HCMurl olarak yazılmıs
        //ıfadeler strıng oldugu ıcın yazım hatasında bulununca exceotıon verır
        //NullPoınterExceptıon verır


    }

}
