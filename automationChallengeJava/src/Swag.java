import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/shivarchetty/Downloads/chromedriver");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("shopping_cart_link")).click();
		//driver.findElement(By.id("checkout")).click();
	}

}
