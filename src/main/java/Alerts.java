import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("C:\\Users\\kambl\\eclipse-workspace\\SeleniumProject\\alerts.html");
		
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
		Alert alert = driver.switchTo().alert();

		

		Thread.sleep(2000);

		alert.sendKeys("Anuradha Kamble");

		Thread.sleep(5000);

		alert.accept();
System.out.println("Welcome in Selenium");
	}

}