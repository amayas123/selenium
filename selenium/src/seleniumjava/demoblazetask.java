package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblazetask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		driver.findElement(By.id("recipient-email")).sendKeys("lami@gmail.com");
		driver.findElement(By.id("recipient-name")).sendKeys("lamiy");
		driver.findElement(By.id("message-text")).sendKeys("anneyo");
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
//		driver.findElement(By.id("signin2")).click();
//		driver.findElement(By.id("sign-username")).sendKeys("aami");
//		driver.findElement(By.id("sign-password")).sendKeys("lami");		
	}

}
