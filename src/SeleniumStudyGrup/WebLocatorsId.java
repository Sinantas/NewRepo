package SeleniumStudyGrup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebLocatorsId {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http ://www.skyscanner.com");
        driver.findElement(By.id("fsc-origin-search")).clear();
        driver.findElement(By.id("fsc-origin-search")).sendKeys("Dallas");
        driver.findElement(By.id("fsc-destination-search")).sendKeys("Izmir");
    }
}
