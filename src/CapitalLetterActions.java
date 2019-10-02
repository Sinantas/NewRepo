import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CapitalLetterActions {
    public static void main(String[] args) {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions myActions = new Actions(driver);
        WebElement myWebElement = driver.findElement(By.cssSelector("input#email"));
        myActions.click().build().perform();
        myActions.keyDown(myWebElement, Keys.SHIFT).build().perform();
        myActions.sendKeys("Asude").build().perform();
        myActions.keyUp(myWebElement,Keys.SHIFT).build().perform();
        Actions actions = (Actions) myActions.moveToElement(myWebElement)
                .click()
                .keyDown(myWebElement,Keys.SHIFT)
                .build();
        actions.perform();
    }
}
