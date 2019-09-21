import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PositiveTicket {
    public static void main(String[] args) throws InterruptedException {
        Browser myBrowser= new Browser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Asude");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pwd");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type,'mai')]")).sendKeys("contains mai");


    }
}
