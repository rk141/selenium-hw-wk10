package barclay_browser_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BarclayFirefoxTest {

    public static void main(String[] args) {


        String baseurl = "https://www.barclays.co.uk/\n";

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        String title = driver.getTitle();
        boolean verifyTitle = title.equals("Personal Banking");
        boolean verifyTitleContain = title.contains("Register");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        System.out.println(title.length());
        System.out.println(title);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();
    }
}
