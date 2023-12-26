package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/testing/Automation project/Qacart_selenium_course/HTML/wait.html");
        //                          sleep
        /*
        Thread.sleep(6000);
        driver.findElement(By.className("primary")).click();
        */
         //                          implicitlyWait
   /*
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.className("primary")).click();
   */
        //                           wait an Element to be visible
        /*
        new WebDriverWait(driver,Duration.ofSeconds(10))
        .until(ExpectedConditions.visibilityOfElementLocated(By.className("primary"))).click();
        */
        //                            Deal with covered elements
        /*
        //                         ظهور ال cover
        new WebDriverWait(driver,Duration.ofSeconds(10))
        .until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));
              //                       اختفاء ال cover
        new WebDriverWait(driver,Duration.ofSeconds(10))
        .until(ExpectedConditions.invisibilityOfElementLocated(By.className("cover")));

        driver.findElement(By.className("secondary")).click();
         */

        //                     create an object, To reduce the steps
        /*
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("primary"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cover")));

        driver.findElement(By.className("secondary")).click();
        */



  // Warning: Do not mix implicit and explicit waits. Doing so can cause unpredictable wait times
      //  لا تخلط بين فترات الانتظار الضمنية والصريحة. قد يؤدي القيام بذلك إلى أوقات انتظار غير متوقعة
    }
}
