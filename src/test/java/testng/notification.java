package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions add=new ChromeOptions();
add.addArguments("--disable-notification");
WebDriver driver=new ChromeDriver(add);
driver.get("https://www.hdfc.com");
	}

}
