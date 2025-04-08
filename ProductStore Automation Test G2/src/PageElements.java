import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageElements {

public WebElement getLoginLink(WebDriver driver){
    return
driver.findElement(By.id("login2"));
}
public WebElement getLoginUsername(WebDriver driver){
   return
driver.findElement(By.id("loginusername"));
}
public WebElement getLoginPassword(WebDriver driver){
    return
driver.findElement(By.id("loginpassword"));
}
public WebElement getLoginButton(WebDriver driver){
    return
driver.findElement(By.cssSelector("#logInModal .btn.btn-primary"));
}
public WebElement getProductImageByIndex(WebDriver driver, int index){
List<WebElement> products = driver.findElements(By.className("card-img-top"));
    return
products.get(index);
}
public WebElement getAddTOCartButton(WebDriver driver){
    return
driver.findElement(By.className("btn-success"));
}
public WebElement getViewCartButton(WebDriver driver){
    return
driver.findElement(By.id("cartur"));
}
public WebElement getHomeLink(WebDriver driver){
    return
driver.findElement(By.className("nav-link"));
}
}

