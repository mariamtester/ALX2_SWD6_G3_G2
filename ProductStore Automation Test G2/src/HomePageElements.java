import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements {
    public WebElement getPhonesLink(WebDriver driver) {
        return
    driver.findElement(By.linkText("Phones"));
    }
public WebElement getLapTopsLink(WebDriver driver){
        return
driver.findElement(By.linkText("Laptops"));
}
public WebElement getMonitorsLink(WebDriver driver){
        return
driver.findElement(By.linkText("Monitors"));
}
public WebElement getFirstProduct(WebDriver driver){
       return
driver.findElement(By.cssSelector(".card-title a"));
}
public  WebElement getHomeLink(WebDriver driver){
        return
driver.findElement(By.className("navbar-brand"));
}
}
