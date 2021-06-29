import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.tedi.com/pl/produkty/detal/lustro-scienne-2438/");
			System.out.println(driver.getTitle());
			

	}

}
