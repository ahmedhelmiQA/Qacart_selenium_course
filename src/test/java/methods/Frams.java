package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frams {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/testing/Automation project/Qacart_selenium_course/HTML/frames.html");
                    ///            switch by id
    /*
       driver.switchTo().frame("qacart");

     driver.findElement(By.id("actions-button"));
     driver.findElement(By.name("firstName")).sendKeys("ahmed");
     driver.findElement(By.name("lastName")).sendKeys("helmi");

        Select level = new Select(driver.findElement(By.id("level")));
        level.selectByValue("senior");

        driver.findElement(By.id("web")).click();
     driver.findElement(By.className("button")).click();
     */
                      ///            switch by webElement
     /*
        WebElement aboutFrame = driver.findElement(By.id("qacart"));
        driver.switchTo().frame(aboutFrame);

        driver.findElement(By.id("actions-button"));
        driver.findElement(By.name("firstName")).sendKeys("ahmed");
        driver.findElement(By.name("lastName")).sendKeys("helmi");

        Select level = new Select(driver.findElement(By.id("level")));
        level.selectByValue("senior");
        driver.findElement(By.id("web")).click();
        driver.findElement(By.className("button")).click();
         */
        ///                         switch by parent
    /*
        WebElement aboutFrame = driver.findElement(By.id("qacart"));
        driver.switchTo().frame(aboutFrame);
        driver.findElement(By.id("actions-button")).click();
        driver.switchTo().parentFrame();
       System.out.println(driver.findElement(By.id("welcome")).getText());
*/
        //                         Nested frames   / parent to frame to sub frame or vice versa بالعكس
    /*
    driver.switchTo().frame("menu");
    driver.switchTo().frame("links");
        System.out.println(driver.findElement(By.id("welcome")).getText());
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.id("welcome")).getText());
*/


    }

}
