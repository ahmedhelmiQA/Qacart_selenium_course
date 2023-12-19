package findElmenets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElmenet {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://D:\\testing\\Automation project\\Qacart_selenium_course\\src\\main\\resources\\index.html");
        //////////////// By id /////////////
        /*
        String elementtext = driver.findElement(By.id("welcome")).getText();
        System.out.println(elementtext);
        driver.quit();
        */
          ////////////////// By name /////////////
        /*
        String elementtext = driver.findElement(By.name("description")).getText();
        System.out.println(elementtext);
        driver.quit();
        */

        //////////////// By class /////////////
      /*
        String elementtext = driver.findElement(By.className("list1")).getText();
        System.out.println(elementtext);
        driver.quit();
        */
        //////////////// By tag name /////////////

        /*
        String elementtext = driver.findElement(By.tagName("li")).getText();
        System.out.println(elementtext);
        driver.quit();

         */
        //////////////// By link text /////////////

       /*
        String elementtext = driver.findElement(By.linkText("Go to About Page")).getText();
        System.out.println(elementtext);
        driver.quit();

        */
        //////////////// By patrial link text /////////////

        String elementtext = driver.findElement(By.partialLinkText("About Page")).getText();
        System.out.println(elementtext);
        driver.quit();




    }
}
