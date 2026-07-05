import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\kambl\\eclipse-workspace\\SeleniumProject\\locator.html");
		
		driver.findElement(By.id("username")).sendKeys("Anuradha");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.id("loginBtn")).click();
		
	
		
		

	}

}
