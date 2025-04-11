package demoblazeTests;

import demoblazePages.PageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class TestScenario {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        PageElements elements = new PageElements();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoblaze.com/index.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
        loginLink.click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
        elements.getLoginUsername(driver).sendKeys("group2");
        Thread.sleep(2000);
        elements.getLoginPassword(driver).sendKeys("test123");
        Thread.sleep(2000);
        elements.getLoginButton(driver).click();
        WebElement welcomeMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        assert welcomeMsg.getText().contains("group2"): "Login failed or username not displayed";
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-img-top")));
        elements.getProductImageByIndex(driver, 0).click();
        assert driver.getCurrentUrl().contains("prod.html"): "Didn't navigate to product details page.";
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-success")));
        elements.getAddTOCartButton(driver).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        Thread.sleep(2000);
        WebElement homePageLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nav-link")));
        homePageLink.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-img-top")));
        Thread.sleep(2000);
        elements.getProductImageByIndex(driver, 1).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-success")));
        elements.getAddTOCartButton(driver).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        homePageLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nav-link")));
        homePageLink.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-img-top")));
        Thread.sleep(2000);
        elements.getProductImageByIndex(driver, 2).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-success")));
        elements.getAddTOCartButton(driver).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        Thread.sleep(2000);
        elements.getViewCartButton(driver).click();
        wait.until(ExpectedConditions.urlContains("cart.html"));
        assert driver.getCurrentUrl().contains("cart.html"):"Didn't navigate to cart page.";
        Thread.sleep(2000);
        WebElement deleteButton = driver.findElement(By.xpath("//a[contains(@onclick,'deleteItem')]"));
        deleteButton.click();
        Thread.sleep(5000);
        System.out.println("All assertions passed successfully.");
        driver.quit();
    }
}
