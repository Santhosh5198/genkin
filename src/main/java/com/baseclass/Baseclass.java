package com.baseclass;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class Baseclass {
	
		public static WebDriver driver;
		public static 	Actions a;
		public static JavascriptExecutor js;

		public static WebDriver browserlaunch(String browser) {
			if(browser.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
		driver = new ChromeDriver(ch);
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
			}
			
			else if(browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("opera")) {
				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();
			}
			return driver;
		}
		public static void geturl(String url) {
			driver.manage().window().maximize();
			driver.get(url);
		}
		public static void clickonelement(WebElement element) {
			
			if(element.isDisplayed() ) {
				element.click();
				
			}
		}
		public static void stay(long sec) throws InterruptedException {
			Thread.sleep(sec);
		}
		public static void shut() {
			
			driver.quit();
		}

}
