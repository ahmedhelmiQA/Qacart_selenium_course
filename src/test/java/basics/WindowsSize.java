package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSize {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file://D:\\testing\\Automation project\\Qacart_selenium_course\\src\\main\\resources\\index.html");
        //Dimension iphoneXR = new Dimension(414,896);
        //driver.manage().window().setSize(iphoneXR);

        Dimension ipadAir = new Dimension(820,1180);
        driver.manage().window().setSize(ipadAir);

        }
}
