import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DXpath {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\kambl\\eclipse-workspace\\SeleniumProject\\Dynamic_xpath.html");
		
	driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("Anuradha Kamble");
	driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("123456");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.findElement(By.xpath("//a[text()='Forgot Password']")).click();
		

	}

}
