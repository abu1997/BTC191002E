package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/abujunelsiddiq/Downloads/chromedriver");
	WebDriver	driver=new ChromeDriver();
	   driver.get("http://www.amazon.com");
	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("kid toys");
	   driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	   driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
	   
driver.quit();
}
}