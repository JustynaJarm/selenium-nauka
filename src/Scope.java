import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		

		System.out.println(driver.findElements(By.tagName("a")).size());

		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement footerFirstColumn = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerFirstColumn.findElements(By.tagName("a")).size());
		
		
		//check if links working
		for (int i = 1; i< footerFirstColumn.findElements(By.tagName("a")).size(); i++) {
			
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			
			footerFirstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			
			System.out.println(driver.getTitle());
			Keys.chord(Keys.CONTROL,Keys.TAB);
			
		}
	}

}
