package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("file:///D:/testing/Automation project/Qacart_selenium_course/HTML/alert.html");

        //driver.findElement(By.className("alert")).click();
        //Thread.sleep(4000);
       // driver.switchTo().alert().accept();
       // System.out.println(driver.switchTo().alert().getText());

        driver.findElement(By.className("prompt")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("ahmed");
        driver.switchTo().alert().accept();


    }
}
