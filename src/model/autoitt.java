package model;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autoitt {
	@Test
	public void uploadfile() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenim jar\\New Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("E://seleniumhtml//uploadfile.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Runtime.getRuntime().exec("E:\\seleniumhtml\\autoitt.exe");
		

	}

}
