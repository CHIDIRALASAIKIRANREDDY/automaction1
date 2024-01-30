package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class facebookxpath {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//id,class,name
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saikiran7252@gmail.com");
	//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("123456789");
//driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1233456789");
		Thread.sleep(200);
	//	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saikiran123@.com");
	}

}
