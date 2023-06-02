package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Shirtpage extends Baseclass {

	
	public Shirtpage(WebDriver driver1) {
		driver = driver1;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Sunny Days Ahead']")
	private WebElement sunny;
	
	@FindBy(xpath="(//img[@alt='white printed casual shirt'])[1]")
	private WebElement printed;
	
	@FindBy(xpath="//div[@data-pgn='Add to Cart']")
	private WebElement cart;

	public WebElement getCart() {
		return cart;
	}

	public WebElement getSunny() {
		return sunny;
	}

	public WebElement getPrinted() {
		return printed;
	}
}
