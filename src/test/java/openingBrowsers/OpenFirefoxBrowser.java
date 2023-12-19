package openingBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenFirefoxBrowser {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
    }
}
