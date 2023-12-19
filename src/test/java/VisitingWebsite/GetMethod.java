package VisitingWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://qacart.com");
        driver.findElement(By.id("el_1662548420535_422")).click();
    }
}
