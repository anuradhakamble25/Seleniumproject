import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		 
		driver.get("C:\\Users\\kambl\\eclipse-workspace\\SeleniumProject\\login.html");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Anuradha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='remember']")).click();
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		

	}

}
