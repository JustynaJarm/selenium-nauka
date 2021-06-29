import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JustynaPC\\Desktop\\sel1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='AMD']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']"))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its disabled ");
			Assert.assertTrue(true);
		} else {
			System.out.println("its enabled");
			Assert.assertTrue(false);
		}

		driver.findElement(By.id("divpaxinfo")).click();

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		WebElement staticDropdownCurrency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdownCurrency = new Select(staticDropdownCurrency);
		dropdownCurrency.selectByIndex(2);
		System.out.println(dropdownCurrency.getFirstSelectedOption().getText());

		System.out.println(
				"Ile checkboxow na stronie:" + driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 8);

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		driver.close();

	}

}
