import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickOnProductAddToCart {

	public static void main(String[] args) throws InterruptedException {
		//Invoking Browser
				//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "/Users/shivarchetty/Downloads/chromedriver");		
				WebDriver driver = new ChromeDriver();
				
				//Getting to the website
				driver.get("https://www.takealot.com/");
				//Accepting the cookies on the page
				driver.findElement(By.className("cookies-banner-module_dismiss-button_24Z98")).click();
				//Clicking on search bar,typing to search a product by name
				driver.findElement(By.className("search-field")).sendKeys("PS5 Console");
				//Entering on search bar to search that product
				driver.findElement(By.className("search-field")).sendKeys(Keys.ENTER);
				//Allowing wait time
				Thread.sleep(1000);
				//Clicking on product to open the product page
				driver.findElement(By.id("70627462")).click();
				//Adding product to the cart
				driver.findElement(By.cssSelector(".add-to-cart-button:first-of-type")).click();
				

	}

}
