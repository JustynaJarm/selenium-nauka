import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public Css() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pudelek.pl/");
		driver.findElement(By.xpath("//*[contains(text(), 'AKCEPTUJÊ I PRZECHODZÊ DO SERWISU')]")).click();

	}

}
