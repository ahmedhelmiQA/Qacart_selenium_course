package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qacart.com/");
       String pageSource = driver.getPageSource();
        System.out.println("The current page source is " + pageSource);
        driver.quit();
    }
}
