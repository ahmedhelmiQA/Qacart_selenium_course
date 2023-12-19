package openingBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager .chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.azure.com/Dexefdev0354/9AM/_workitems/myactivity/");
        Thread.sleep(5000,1000);
        driver.findElement(By.id("i0116")).sendKeys("ahmed.helmy@dexef.net");
        driver.findElement(By.id("idSIButton9")).click();

    }
}
