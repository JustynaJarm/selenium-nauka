import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookingAutoSugestive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.booking.com/index.pl.html?label=gen173nr-1BCAEoggI46AdIM1gEaLYBiAEBmAEeuAEXyAEM2AEB6AEBiAIBqAIDuAKhmN-BBsACAdICJGRiMmQwZDE3LTIzNGYtNGZhYi1iM2M0LWQ1MTczNzQ5ODAxNNgCBeACAQ;sid=970abf4c70b7fce0496a0364e8eacb16;keep_landing=1&sb_price_type=total&");

		
		driver.findElement(By.id("ss")).sendKeys("lubl");
		//driver.findElement(By.xpath("//[contains(text(), 'Lublin')]")).click();
		driver.findElement(By.cssSelector("li[data-label='Lublin, lubelskie, Polska']")).click();
		
		
		
	
		
		
		
		
	}

}
