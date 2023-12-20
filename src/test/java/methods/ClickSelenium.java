package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file://D:\\testing\\Automation project\\Qacart_selenium_course\\src\\main\\resources\\index.html");
         driver.manage().window().maximize();
        driver.manage().window().wait(3000,1000);

                       /// DropDown //
        /*
        Select coursesDropDown = new Select(driver.findElement(By.id("courses")));
        //coursesDropDown.selectByIndex(2);
        //coursesDropDown.selectByValue("selenium");
        coursesDropDown.selectByVisibleText("wdiocourse");
         */
                                                /// is Displayed //



        driver.quit();

    }
}
