import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSbt {
    public static WebDriver driver;

    @Test(priority=1)
    public static void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Magazine\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Parameters.baseUrl);
    }
    @Test(priority=2)
    public void search() throws Throwable {
        driver.findElement(Locators.findField).sendKeys(Parameters.searchIphone);
        driver.findElement(Locators.findButton).click();
        driver.findElement(Locators.url).click();
                Thread.sleep(8000);

        driver.findElement(Locators.buyWatch);

//        Thread.sleep(20000);
//
//        Robot robot = new Robot();
//        for (int i = 0; i < 115; i++) {
//            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//            Thread.sleep(100);
//            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//        }
//        Thread.sleep(5000);
//        driver.findElement(Locators.urlAccessories).click();
    }

    }


