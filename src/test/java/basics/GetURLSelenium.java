package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURLSelenium {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
       driver.get("https://www.selenium.dev/");
        String url= driver.getCurrentUrl();
        System.out.println("The current URL is " + url);
    }
}
