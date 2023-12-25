package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class ClickSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://mydexefcustomerapi.azurewebsites.net/swagger/index.html");
        //driver.get("http://9.0.0.45:11080/swagger/index.html");


                       /// DropDown //
        /*
        Select coursesDropDown = new Select(driver.findElement(By.id("courses")));
        //coursesDropDown.selectByIndex(2);
        //coursesDropDown.selectByValue("selenium");
        coursesDropDown.selectByVisibleText("wdiocourse");
         */
                                                /// is Displayed //

      //////////////                              getWindowHandle
/*
        driver.get("https://qacart.com");
         String parent = driver.getWindowHandle();
        System.out.println(driver.getWindowHandles());
          */
                                   //// getWindowHandles //
    /*
     driver.get("https://the-internet.herokuapp.com/login");
            System.out.println(driver.getWindowHandle());
        driver.findElement(By.linkText("Elemental Selenium")).click();
            System.out.println(driver.getWindowHandles());
*/
                                   //// switch to window //
/*
        driver.get("https://the-internet.herokuapp.com/login");
       String parent = driver.getWindowHandle();
        driver.findElement(By.linkText("Elemental Selenium")).click();
        Set<String> allwindows = driver.getWindowHandles();
        System.out.println(allwindows);

        for(String window:allwindows){
            if (!window.equalsIgnoreCase(parent)){
              System.out.println(driver.getTitle());
             driver.switchTo().window(window);
              */
                               /// close and quite
    /*
               driver.switchTo().window(window);
             //driver.close();
             //driver.quit();
             driver.switchTo().window(parent);
             driver.close();
             driver.quit();
              */

            }
        }


//        driver.quit();

    }
}
