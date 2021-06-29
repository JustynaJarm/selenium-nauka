import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.pl/ref=nav_logo");
		Actions a = new Actions (driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		Thread.sleep(2000);
		a.moveToElement(move).contextClick().build().perform();  //context click -> right click
	}

}
