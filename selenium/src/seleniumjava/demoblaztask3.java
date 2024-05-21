package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaztask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("cartur")).click();
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
	driver.findElement(By.id("name")).sendKeys("amaya");
	driver.findElement(By.id("country")).sendKeys("india");
	driver.findElement(By.id("city")).sendKeys("sfgrthgfht");
	driver.findElement(By.id("card")).sendKeys("125562");
	driver.findElement(By.id("month")).sendKeys("may");
	driver.findElement(By.id("year")).sendKeys("2024");
	driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
	driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
	}

}
