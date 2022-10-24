package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverİlkTest {
    //Driver classı sayesınde eskı driver ı kullanmıyoruz
    // artık driver a ıhtıyac olunca Driver.getDriver() yazacagız


    @Test
    public void test01(){
        //amazon git
        //amazon a gıttıgımızı test edelım

        Driver.getDriver().get("https://www.amazon.com");
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
        // Driver.getDriver
        Driver.closeDriver();
    }

    @Test
    public void test02(){
        Driver.getDriver().get("https://www.bestbuy.com");
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains("best"));
        Driver.closeDriver();
    }



}
