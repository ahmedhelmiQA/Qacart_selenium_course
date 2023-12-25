package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/testing/Automation project/Qacart_selenium_course/HTML/wait.html");
        Thread.sleep(6000);
        driver.findElement(By.className("primary")).click();

    }
}
