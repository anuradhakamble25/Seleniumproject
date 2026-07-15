import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webControls {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		WebDriver driver= new ChromeDriver();
		driver.get("C:\\Users\\kambl\\eclipse-workspace\\SeleniumProject\\WebControls.html");
		
 driver.findElement(By.id("name")).sendKeys("Anuradha Kamble");
 driver.findElement(By.id("password")).sendKeys("123456");
 driver.findElement(By.id("male")).click();
 driver.findElement(By.id("selenium")).click();

@SuppressWarnings("unused")
WebElement country= driver.findElement(By.id("country"));
@SuppressWarnings("unused")
Select s = new Select(country);

s.selectByIndex(2);
List<WebElement> list = s.getOptions();

System.out.println(list.size());for(WebElement option : list)
{
    System.out.println(option.getText());
}

driver.findElement(By.id("register")).click();
driver.findElement(By.id("loginLink")).click();


	}

}
