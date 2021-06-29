import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class AutomFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
	
      	
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//button[@title='Akceptuj wszystkie']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jastynka2@wp.pl");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("wiaderko2");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@aria-label='Messenger']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Nowa wiadomoœæ']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Wyszukaj osobê lub grupê']")).sendKeys("Amanda Porêba");
		driver.findElement(By.xpath("//a[@role='presentation']/div/div[2]/div/div/span/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\'mount_0_0\']/div/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div/div/div/div/div/div[3]/div/div/div[2]/form/div/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div/div")).sendKeys("Tu Œmierdzioch - Bot. Ta wiadomoœæ zosta³a wys³ana automatycznie. Amanda to Kupa" + Keys.ENTER);
		
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.close();

		
	//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//	

	}

}
