package seleniumjava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");;
WebDriver driver =new ChromeDriver();
driver.get("https://www.saucedemo.com/v1/");
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
//driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
driver.get("https://www.saucedemo.com/v1/cart.html");
driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("sss");
driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("sss");
driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("sss");
driver.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_buttons > input")).click();
driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
//driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
driver.findElement(By.cssSelector("#about_sidebar_link")).click();
driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
driver.findElement(By.cssSelector("#inventory_filter_container > select")).sendKeys("Name (Z to A)");
Thread.sleep(4000);
driver.navigate().refresh();
driver.findElement(By.cssSelector("#inventory_filter_container > select")).sendKeys("Price (high to low)");
Thread.sleep(4000);
driver.navigate().refresh();
driver.findElement(By.cssSelector("#inventory_filter_container > select")).sendKeys("Price (low to high)");
Thread.sleep(4000);
driver.navigate().refresh();
driver.findElement(By.cssSelector("#inventory_filter_container > select")).sendKeys("Name (A to Z)");
Thread.sleep(4000);
driver.navigate().refresh();
driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
driver.findElement(By.id("logout_sidebar_link")).click();
driver.close();
}
}