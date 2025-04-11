package demoblazeTests;

import demoblazePages.HomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
    public class TestHomePage {
        public static void main(String[]args)throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            HomePageElements elements = new HomePageElements();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://demoblaze.com/index.html");
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
            assert driver.getCurrentUrl().contains("demoblaze"):"URL is incorrect, not navigating to demoblaze.com";
            assert elements.getPhonesLink(driver).isDisplayed() : "Phones link is not displayed";
            String pageTitle = driver.getTitle();
            assert pageTitle.contains("Store"): "Page title is incorrect, exepected it to contain'Store'";
            System.out.println("All assertions passed!");
            driver.quit();

        }
    }
