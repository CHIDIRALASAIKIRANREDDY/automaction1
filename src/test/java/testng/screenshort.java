package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		//screenshort for google
      driver.get("https://www.google.com");
//upcasting
TakesScreenshot ts =(TakesScreenshot)driver;
//give source file
File src =ts.getScreenshotAs(OutputType.FILE);
//Copy path of given folder and we can write aa or bb.png
File dest=new File("C:\\Users\\saiku\\OneDrive\\Desktop\\seleniumpics\\AA.png");
//copy file
Files.copy(src, dest);


	}

}
