package java_introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TristanGraaff\\OneDrive - Squerist\\Documenten\\browser_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.yahoo.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input[id='login-username']")).sendKeys("barryprisoner@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("testingsomething@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).clear();
		driver.findElement(By.id("login-username")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.cssSelector("#login-username")).sendKeys("css-id-selector");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#login-username")).clear();
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("jimmyjones");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@name='username']")).clear();
		driver.findElement(By.cssSelector("input[type*=\"te\"]")).sendKeys("regular-expression");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type*=\"te\"]")).clear();
		driver.findElement(By.cssSelector("div input[name='username']")).sendKeys("tristangraaff@yahoo.com");
//		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.cssSelector(".puree-button-primary")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("login-passwd")).sendKeys("whyisntitworking");
		driver.findElement(By.id("login-signin")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error-msg")).getText());
		driver.close();
//		driver.findElement(By.linkText("Dummy text")).click();
		//test
		
	}

}

