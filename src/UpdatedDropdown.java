import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); //sprawdza czy checkboxy sa zaznaczone
	//	System.out.println("Czy checkbox zaznaczony:" + driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println("Ile checkboxow na stronie:" + driver.findElements(By.cssSelector("input[type='checkbox']")).size()); //zlicza ilosc checkboxow
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();   //skrocone id * znaczy, ze szuka kazdego id ktore zawiera
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
	//	System.out.println("Czy checkbox zaznaczony:" + driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(1000L);
		//int i = 1;	 	
//		while(i<4)	{
//			driver.findElement(By.id("hrefIncAdt")).click(); //kliknie 3x
//			i++;
//		}
		for(int i=1; i<4; i++) {
		driver.findElement(By.id("hrefIncAdt")).click(); //kliknie 3x
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		
		
		
		
		
		
		
		//driver.close();
	}
		

	}

