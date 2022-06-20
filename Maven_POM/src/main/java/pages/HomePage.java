package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class HomePage {
	ChromeDriver dr; 
	Helper hp; 
	
	public HomePage(ChromeDriver dr) {
		this.dr = dr;
		hp = new Helper(this.dr);
		PageFactory.initElements(dr, this);
	}
	
	//------------- Page Factory / Element repository 
	@FindBy(how = How.CSS, using="#headerPrimary>a:nth-child(10)") 
	WebElement signInButton;
	
	@FindBy(xpath="//div[@id='overlay-16']/ul/li[1]/a") 
	WebElement signLink;
	
	
	
	
	
	//----------------------------------------------------
	
	public void homePageTitle() {
		boolean b = dr.getTitle().contains("Target : Expect More. Pay Less.");
		System.out.println(b);
	}
	
	public void homePageURL() {
		boolean r = dr.getCurrentUrl().equals("https://www.target.com/");
		System.out.println(r);
	}

	public void signInButton() {
		//dr.findElement(By.id("")).click();
		signInButton.click();
	}
	
	public SignInPage signInLink() {
		signLink.click();
		return new SignInPage(dr);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

