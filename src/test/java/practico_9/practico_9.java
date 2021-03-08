package practico_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class practico_9 {
    //Ej 1: Crear un método que abra el browser y muestre el explorador de google con chrome
    @Test
    public void ejercicio1(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.google.com";
        driver.get(baseURL);
    }

    //Ej2: Crear un método llamado mostrarTitulo, que muestre el título del sitio web.
    @Test
    public void mostrarTitulo(){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.google.com";
        driver.get(baseURL);

        System.out.println(driver.getTitle());
    }
}
