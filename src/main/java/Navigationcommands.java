import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands {

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.youtube.com");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 driver.navigate().refresh();

	}

}
