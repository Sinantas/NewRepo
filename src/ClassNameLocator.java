import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

    static WebDriver turkishAirlans;

    public static void main(String[] args) throws InterruptedException {
        invokeChromeBrowser();
        turkishAirlans.get("https://www.turkishairlines.com");
        Thread.sleep(3000);
        turkishAirlans.findElement(By.className("thyHeaderLink")).click();

    }
    public static void invokeChromeBrowser(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        turkishAirlans= new ChromeDriver();
    }
}


