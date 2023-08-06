


package test_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nokrilogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.setProperty("webdriver.chrome.driver", "F:\\selenium dowload\\chromedriver_win32\\chromedriver.exe"	);
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Enter Email ID / Username']"));
		username.sendKeys("chavanvicky903@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Vicky@123");
		WebElement submit=driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']"));
		submit.click();
		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']")).click();

		driver.findElement(By.xpath("//a[@class='nI-gNb-info__sub-link']")).click();
		driver.findElement(By.xpath("//span[@class='edit icon']")).click();
		driver.findElement(By.xpath("//textarea[@maxlength='250']")).sendKeys(" ");
		driver.findElement(By.xpath("(//button[@class='btn-dark-ot'])[3]")).click();
		
		
		
	}
}