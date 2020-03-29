package selenium;

/*Koristeci selenijum, napravi screenshot svog okacenog domaceg zadatka na drajvu.
Okaciti ovaj zadatak i kao .java (kod sa selenijumom) i sliku(screenshot).*/

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMail {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://drive.google.com/open?id=1rFec0eFX81CExaVGN9lsPnSe9EBma79O");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		By pass = By.cssSelector(".pmHCK:nth-child(2) .l-u-Ab-zb-Pn-ve");
		wait.until(ExpectedConditions.visibilityOfElementLocated(pass));

		File someFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(someFile, new File("C:\\BootCamp\\screenshot.png"));

	}

}
