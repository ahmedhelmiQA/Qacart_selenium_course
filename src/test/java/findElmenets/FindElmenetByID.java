package findElmenets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElmenetByID {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://D:\\testing\\Automation project\\Qacart_selenium_course\\src\\main\\resources\\index.html");
        String elementtext = driver.findElement(By.id("welcome")).getText();
        System.out.println(elementtext);
        driver.quit();
    }
}
