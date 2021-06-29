import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductsList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> productsNumber = driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		
	
		
		
		for (int i=0; i<productsNumber.size(); i++) {
			
			String productsName = productsNumber.get(i).getText();
			//System.out.println(productsName);
			
			if (productsName.contains("C")){
				System.out.println(productsName);
				
			}
			
			else  {
				System.out.println("Nie zawieraja litery c: " + productsName);
			}
		
		
		}
		
		
		driver.close();

	}

}
