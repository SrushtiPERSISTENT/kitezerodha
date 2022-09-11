package POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
//declaration
	@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath = "//button[text()='Continue ']")private WebElement CNTBTN;
	
	//initialization
	public Pom2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void enterPIN(String pinvalue) {
		PIN.sendKeys(pinvalue);
	}
	public void clickCNTBTN() {
		CNTBTN.click();
	}
}
