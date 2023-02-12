import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class takealot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/shivarchetty/Downloads/chromedriver");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.takealot.com/");
		driver.findElement(By.className("cookies-banner-module_dismiss-button_24Z98")).click();
		driver.findElement(By.className("search-field")).sendKeys("PS5 Console");
		driver.findElement(By.className("search-field")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.id("70627462")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.cssSelector(".add-to-cart-button:first-of-type")).click();
		//driver.findElement(By.cssSelector(".add-to-cart-button:first-of-type")).click();
		//driver.findElement(By.className("cookies-banner-module_dismiss-button_24Z98")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".mini-cart-button")).click();
		//Thread.sleep(1000);
		
		//driver.findElement(By.cssSelector(".checkout-now:last-of-type")).click();
		

		

		

	}

}
