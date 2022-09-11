package Test;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B {
public static void main(String[] args) {
	
	WebDriver driver=WebDriverManager.chromedriver().create();
	
	driver.get("https://www.flipkart.com/");
}
}
