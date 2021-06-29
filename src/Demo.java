import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.tedi.com/pl/produkty/detal/lustro-scienne-2438/");
		WebElement search = driver.findElement(By.id("site-search"));
		search.sendKeys("Amanda to dzban");
		System.out.println(driver.getTitle());
		System.out.println("Actual url is: " + driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
//		driver.get("http://pudelek.pl");
//		driver.navigate().back();
//		driver.navigate().forward();
//	//	driver.close();
	//	driver.findElement(By.xpath("//*[text()='Kariera']")).click();
		driver.findElement(By.cssSelector("[title='Kariera']")).click();
	

	}

}
