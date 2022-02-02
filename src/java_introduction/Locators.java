package java_introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TristanGraaff\\OneDrive - Squerist\\Documenten\\browser_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.yahoo.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("login-username")).sendKeys("tristangraaff");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("whyisntitworking");
		driver.findElement(By.id("login-signin")).click();
	}

}

