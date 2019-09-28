import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataPicker {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser = new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.expedia.com");
        driver.findElement(By.id("package-departing-hp-package")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.datepicker-paging.datepicker-next.btn-paging.btn-secondary.next")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.datepicker-paging.datepicker-next.btn-paging.btn-secondary.next")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[data-year='2019'][data-month='11'][data-day='29']")).click();

    }
}
