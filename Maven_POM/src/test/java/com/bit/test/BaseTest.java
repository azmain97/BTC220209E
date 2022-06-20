package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utility.Helper;

public class BaseTest {


	Properties prop;
	WebDriver dr;
	/*
	 * @Before public void openBrowser() throws IOException {
	 * prop=Helper.readPropFile(
	 * "/Users/bittechconsulting/eclipse-workspace/com.bit.ui.test/src/test/resources/config.properties"
	 * );
	 * 
	 * String b=prop.getProperty("browser"); if(b.equals("chrome")) {
	 * 
	 * dr=new ChromeDriver(); }else if(b.equals("safari")) { dr=new SafariDriver();
	 * }else if(b.equals("firefox")) { dr=new FirefoxDriver(); }
	 * dr.get(prop.getProperty("url")); }
	 */
	

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.get("http://www.target.com");
	}

	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
	}
}

