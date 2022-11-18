package apponte1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Deneme {

    public AppiumDriver driver;

    public WebDriverWait wait;


    By kurumsalButton = By.id("mobi.appcent.apponte:id/btnInstitutional");
    By signUpButton = By.id("mobi.appcent.apponte:id/ibSignIn");

    By phoneNumberBox = By.id("mobi.appcent.apponte:id/etPhoneNumber");


    @BeforeTest()
    public void setUp() {

        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "pixel_2");
            cap.setCapability("platformName", "Android");
            cap.setCapability("udid", "emulator-5554");
            cap.setCapability("platformVersion", "11.0");
            cap.setCapability("appPackage", "mobi.appcent.apponte");
            cap.setCapability("appActivity", "mobi.appcent.apponte.ui.activity.login.LoginActivity");
            cap.setCapability("skipUnlock", "true");
            cap.setCapability("noReset", "false");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            // wait = new WebDriverWait(driver,Duration.ofSeconds(10));


        } catch (MalformedURLException er) {
            System.out.println("HATA");
        }

    }


    @Test
    public void test01() throws InterruptedException {
        Thread.sleep(5000);

        WebElement kurumsalButtonSelect = driver.findElement(kurumsalButton);
        kurumsalButtonSelect.click();

        Thread.sleep(5000);

        WebElement signInButtonSelect = driver.findElement(signUpButton);
        signInButtonSelect.click();

        Thread.sleep(5000);


    }

    /*@AfterTest()
    public void tearDown() {

    }*/
}
