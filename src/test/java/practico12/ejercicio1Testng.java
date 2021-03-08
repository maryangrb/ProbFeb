package practico12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class ejercicio1Testng {

    private static String SPOTIFY_URL = "https://www.spotify.com";
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        driver.get(SPOTIFY_URL);
    }

    @Test
    public void prueba(){
        System.out.println("el title es "+ driver.getTitle());
    }

   /* @AfterMethod
    public void closeDriver(){
        driver.quit();
    }*/
}
