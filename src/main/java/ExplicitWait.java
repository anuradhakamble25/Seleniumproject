import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
driver.get("C:\\Users\\kambl\\eclipse-workspace\\SeleniumProject\\ExplicitWait.html");

WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("Anuradha");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("1234");
wait.until(ExpectedConditions.elementToBeClickable(By.id("login"))).click();
wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//a[text()='Forgot Password']")));

driver.findElement(By.xpath("//a[text()='Forgot Password']")).click();

	}

}
