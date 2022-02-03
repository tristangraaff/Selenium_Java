package java_introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TristanGraaff\\OneDrive - Squerist\\Documenten\\browser_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.yahoo.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input[id='login-username']")).sendKeys("barryprisoner@yahoo.com");
		driver.findElement(By.cssSelector("input[id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("tristangraaff");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).clear();
		driver.findElement(By.id("login-username")).sendKeys("tristangraaff");
		driver.findElement(By.id("login-signin")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("login-passwd")).sendKeys("whyisntitworking");
		driver.findElement(By.id("login-signin")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error-msg")).getText());
//		driver.findElement(By.linkText("Dummy text")).click();
		
	}

}

