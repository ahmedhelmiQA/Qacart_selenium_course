package findElmenets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElmenetByCssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       driver.get("file://D:\\testing\\Automation project\\Qacart_selenium_course\\src\\main\\resources\\index.html");
        ///consol  $("#id")                           //// #id ////
        /*
        String elementtext = driver.findElement(By.cssSelector("#welcome")).getText();

         */
        ///consol  $(".class")                          /// .class ///
       /*
        String elementtext = driver.findElement(By.cssSelector(".list1")).getText();

        */
                                                        ///  [data-testid="value"]
        /*
        String elementtext = driver.findElement(By.cssSelector("[data-testid="welecome-header"]")).getText();
          */
                                                        ///  [data-testid=value]
        /*
        String elementtext = driver.findElement(By.cssSelector("[data-testid=welecome-header]")).getText();

         */
       ///consol  $("[name=description]")               ///   [name=value]
        /*
        String elementtext = driver.findElement(By.cssSelector("[name=description]")).getText();
         */

        ///consol $(".course-list .list2")                 //Parent and children//         (".parent .children")
        /*
        String elementtext = driver.findElement(By.cssSelector(".course-list .list2")).getText();

        ///consol $(".course-list > .list2")
        String elementtext = driver.findElement(By.cssSelector(".course-list > .list2")).getText();
        */
                                   ///      Nth child
        /*
        $(".course-list li:nth-of-type(5)")
        String elementtext = driver.findElement(By.cssSelector(".course-list li:nth-of-type(5)")).getText();
        */
                                                        // Web Element Class
        /*
        WebElement welcomeHeader = driver.findElement(By.id("welcome"));
        String elementtext = welcomeHeader.getText();
        */
                             // Multiple Elements
        /*
        String elementtext = driver.findElements(By.cssSelector(".course-list li")).get(5).getText();
        */

                                            // list of web elements
        /*
        List<WebElement> courselist = driver.findElements(By.cssSelector(".course-list li"));
        System.out.println(courselist.size());
        */

        // System.out.println(elementtext);
        driver.quit();

    }
}
