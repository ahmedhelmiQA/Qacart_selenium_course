package findElmenets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElmenetByXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file://D:\\testing\\Automation project\\Qacart_selenium_course\\src\\main\\resources\\index.html");
          //tagName[@attribute = 'value']       //// Absolute path///
           /*
                //                    (console)            2- $x("//h1[@id='welcome']")
       // String elementtext = driver.findElement(By.xpath("//h1[@id='welcome']")).getText();

                 //                     (console)        3- $x("//html/body/ul[2]/[li]")
     //   String elementtext = driver.findElement(By.xpath("//html/body/ul[2]/li[2]")).getText();

        //                            (console)           4-$x("//ul[@class='country-list']")
        //String elementtext = driver.findElement(By.xpath("//ul[@class='country-list']")).getText();

        //                               (console)         5- $x("//ul/li[@class='list1']")
        String elementtext = driver.findElement(By.xpath("//ul/li[@class='list1']")).getText();

        //                               (console)         6- $x("//ul[contains(@class, 'country-')]")
         String elementtext = driver.findElement(By.xpath("//ul[contains(@class,'country-')]")).getText();


        System.out.println(elementtext);
        driver.quit();
*/

          //*[@attribute = 'value']               //////  General tag name ///

      /*         //                    (console)            2- $x("//*[@id='welcome']")
         String elementtext = driver.findElement(By.xpath("//*[@id='welcome']")).getText();

                             (console)        3- $x("//html/body/ul[2]/[li]")
           String elementtext = driver.findElement(By.xpath("//html/body/ul[2]/li[2]")).getText();

                                    (console)           4-$x("//*[@class='country-list']")
        String elementtext = driver.findElement(By.xpath("//*[@class='country-list']")).getText();

                                       (console)         5- $x("//*[@class='list1']")
           String elementtext = driver.findElement(By.xpath("//*[@class='list1']")).getText();

          */

          //*[contains(@attribute = 'value')]               //////  contains ///

      /*  (console)         1- $x("//*[contains(@class, 'country-')]")
        String elementtext = driver.findElement(By.xpath("//*[contains(@class,'country-')]")).getText();

         */


       //*[@attribute = 'value']               //////  by text , contains /// [contains(@attribute = 'value')
/*/
              //                    (console)            1- $x("//*[text()='Get started']")
         String elementtext = driver.findElement(By.xpath("//*[text()='Get started']")).getText();

           //                 (console)            2- $x("//*[contains(text(),'started')]")
        String elementtext = driver.findElement(By.xpath("//*[contains(text(),'started')]")).getText();

 */

        //*[@attribute = 'value']               //////  Data test id ///

        //                    (console)            1- $x("//*[@data-testid='welecome-header']")
        String elementtext = driver.findElement(By.xpath("//*[@data-testid='welecome-header']")).getText();

        System.out.println(elementtext);
        driver.quit();

    }
}
