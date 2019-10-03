import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
    public static void main(String[] args) {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("https://jqueryui.com/droppable/");
        WebDriverWait wait =new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe.demo-frame")));
        WebElement source =driver.findElement(By.cssSelector("#draggable"));
        WebElement target = driver.findElement(By.cssSelector("#droppable"));
        Actions myActions = new Actions(driver);
        myActions.dragAndDrop(source,target).build().perform();



    }
}
