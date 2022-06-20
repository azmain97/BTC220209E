package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

	ChromeDriver dr;
	public Helper(ChromeDriver dr) {
		this.dr = dr;
	}

	public void click() {
		System.out.println("Clicked");

	}

	public static void click(WebElement element) {
		System.out.println("clicked");
		element.click();
	}
	
	public static Properties readPropFile(String path) throws IOException {
		FileInputStream f=new FileInputStream(new File(path));
		Properties p=new Properties();
		p.load(f);
		return p;
	}
}

