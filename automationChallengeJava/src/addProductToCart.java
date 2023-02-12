import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addProductToCart {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Browser
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/shivarchetty/Downloads/chromedriver");		
		WebDriver driver = new ChromeDriver();
		
		//Getting the website
		driver.get("https://www.takealot.com/");
		//Accepting the cookies
		driver.findElement(By.className("cookies-banner-module_dismiss-button_24Z98")).click();
		//Clicking on search bar and entering a product
		driver.findElement(By.className("search-field")).sendKeys("PS5 Console");
		//Entering on search bar to search product
		driver.findElement(By.className("search-field")).sendKeys(Keys.ENTER);
		//Allowing wait time
		Thread.sleep(1000);
		//Adding product to cart
		driver.findElement(By.cssSelector(".add-to-cart-button:first-of-type")).click();
		//Allowing sleep time
		Thread.sleep(2000);
		//Clicking on cart, to view product in cart
		driver.findElement(By.cssSelector(".mini-cart-button")).click();

	}

}