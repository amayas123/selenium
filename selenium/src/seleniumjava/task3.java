package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=4409041C8CC20D4C97E51AA6931B59C8");
//	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
//	driver.findElement(By.id("customer.firstName")).sendKeys("lisa");
//	driver.findElement(By.id("customer.lastName")).sendKeys("la");
//	driver.findElement(By.id("customer.address.street")).sendKeys("seol");
//	driver.findElement(By.id("customer.address.city")).sendKeys("seol");
//	driver.findElement(By.id("customer.address.state")).sendKeys("seol");
//	driver.findElement(By.id("customer.address.zipCode")).sendKeys("675204");
//	driver.findElement(By.id("customer.phoneNumber")).sendKeys("9446281784");
//	driver.findElement(By.id("customer.ssn")).sendKeys("956248563");
//	//driver.findElement(By.id("customer.username")).sendKeys("rosesarerosie");
//	driver.findElement(By.id("customer.password")).sendKeys("lili@123");
//	driver.findElement(By.id("repeatedPassword")).sendKeys("lili@123");
//	driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("rosesarerosie");
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("lili@123");
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[2]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[3]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[4]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[5]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[2]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[4]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[4]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[3]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[4]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a")).click();
	driver.findElement(By.id("name")).sendKeys("jungkook");
	driver.findElement(By.id("email")).sendKeys("jk@gmail.com");
	driver.findElement(By.id("phone")).sendKeys("7559050028");  
	driver.findElement(By.id("message")).sendKeys("anneyo");
	driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("aaaaa");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("aaaaa");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("aaaaa");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("aaaaa");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("659542561");
	driver.findElement(By.id("4c1592b5-4f0a-448b-9c10-091344796117")).sendKeys("9446281495");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("956234856");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("956234856");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[11]/td[2]/input")).sendKeys("2500");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[13]/td[2]/select")).sendKeys("13677");
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")).click();
	}
}
