import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addingProductTwice {

	public static void main(String[] args) throws InterruptedException {
		//Invoking Browser
				//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "/Users/shivarchetty/Downloads/chromedriver");		
				WebDriver driver = new ChromeDriver();
				
				//Getting the website
				driver.get("https://www.takealot.com/");
				//Accepting the cookies
				driver.findElement(By.className("cookies-banner-module_dismiss-button_24Z98")).click();
				//Clicking on search bar and then entering a product
				driver.findElement(By.className("search-field")).sendKeys("PS5 Console");
				//Entering on search bar to search that product
				driver.findElement(By.className("search-field")).sendKeys(Keys.ENTER);
				//Allowing wait time
				Thread.sleep(1000);
				//Adding product to cart
				driver.findElement(By.cssSelector(".add-to-cart-button:first-of-type")).click();
				//Allowing sleep time
				Thread.sleep(1000);
				//Adding product again to cart
				driver.findElement(By.cssSelector(".add-to-cart-button:first-of-type")).click();
				//Clicking on cart, to view product in cart
				driver.findElement(By.cssSelector(".mini-cart-button")).click();


	}

}
