import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSbt {
    public static WebDriver driver;

    @Test(priority = 1)
    public static void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Magazine\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Parameters.baseUrl);
    }

    @Test(priority = 2)
    public static void search() throws Throwable {
        driver.findElement(Locators.findField).sendKeys(Parameters.searchDyson);
        driver.findElement(Locators.findButton).click();
        driver.findElement(Locators.item).click();

    }

    @Test(priority = 3)
    public static void verifyItem() {
        System.out.println(driver.findElement(By.xpath("//h1[text()='Пылесос Dyson Cinetic Big Ball Parquet']")));
    }

    @Test(priority = 4)
    public static void selectTechnick() throws InterruptedException {
        WebElement link = driver.findElement(Locators.bitTechnick);
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();
        Thread.sleep(2000);
        driver.findElement(Locators.technick).click();

    }

    @Test(priority = 5)
    public static void selectAccs() throws InterruptedException {
        driver.findElement(Locators.accessories).click();
        driver.findElement(Locators.nozzle).click();

        Thread.sleep(10000);

        System.out.println(driver.findElement(Locators.nozzleIsExist));

    }
}


