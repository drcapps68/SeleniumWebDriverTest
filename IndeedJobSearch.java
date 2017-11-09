import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndeedJobSearch
{
    public static void main(String[] args) {
        //Open Google Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dan\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Open Mozilla Firefox
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\Dan\\Downloads\\geckodriver-v0.19.1-win64.exe");
//        WebDriver driver = new FirefoxDriver();

        //Navigate to website
        driver.get("https://www.indeed.com/");

        //Enter search fields
        driver.findElement(By.id("what")).sendKeys("Selenium");
        driver.findElement(By.id("where")).clear();
        driver.findElement(By.id("where")).sendKeys("United States");
        driver.findElement(By.id("fj")).click();

        //Print title and job count
        System.out.println(driver.findElement(By.id("searchCount")).getText());
        System.out.println(driver.getTitle());

        driver.close();
    }
}
