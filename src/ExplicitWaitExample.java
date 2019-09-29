import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
    // Sinan Tas Cration Date: 2019
    //Ticket #123478 Ticket submit Scenario
    public static void main(String[] args) {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        //set the timeout for explicit wait
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#tab-flight-tab-hp"))));
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        //Click hoteI button
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("tab-hotel-tab-hp"))));
        driver.findElement(By.id("tab-hotel-tab-hp")).click();
        //Click Bundle and save
        wait.until((ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']")))));
        driver.findElement(By.xpath("//button[@id='tab-package-tab-hp']")).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("hotel-destination-hp-hotel"))));
        System.out.println("The input of hotel is invisible");


    }
}
