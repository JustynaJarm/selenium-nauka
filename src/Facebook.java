import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//button[@title='Akceptuj wszystkie']")).click();
		driver.findElement(By.id("email")).sendKeys("jastynka2@wp.pl");
		driver.findElement(By.id("pass")).sendKeys("aaaaaaa");
		driver.findElement(By.name("login")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/a")).getText());
	}

}
