import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class landingPage {

    public static void main(String[] args) {
        //Invoking Browser
        //Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/shivarchetty/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Getting the website
        driver.get("https://www.takealot.com/");
        //Accepting the cookies
        driver.findElement(By.className("cookies-banner-module_dismiss-button_24Z98")).click();
        //Clicking on checkout cart



    }

}
