package demoblazeTests;

import demoblazePages.HomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.time.Duration;
    public class TestHomePage {
        WebDriver driver;
        HomePageElements elements;

        @BeforeClass
        public void setUp() {
            driver = new ChromeDriver();
            elements = new HomePageElements();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://demoblaze.com/index.html");
        }

        @Test
        public void testNavigationAndElements() throws InterruptedException {
            Thread.sleep(3000);
            elements.getPhonesLink(driver).click();
            Thread.sleep(3000);
            elements.getFirstProduct(driver).click();
            Thread.sleep(3000);
            elements.getHomeLink(driver).click();
            Thread.sleep(3000);
            elements.getLapTopsLink(driver).click();
            Thread.sleep(3000);
            elements.getFirstProduct(driver).click();
            Thread.sleep(3000);
            elements.getHomeLink(driver).click();
            Thread.sleep(3000);
            elements.getMonitorsLink(driver).click();
            Thread.sleep(3000);
            elements.getFirstProduct(driver).click();
            Thread.sleep(3000);
            elements.getHomeLink(driver).click();
            Thread.sleep(3000);
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    }