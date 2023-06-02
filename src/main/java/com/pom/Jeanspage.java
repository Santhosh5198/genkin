package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Jeanspage extends Baseclass {
	
	public Jeanspage(WebDriver driver1) {
		
		driver = driver1;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@alt='Funk It Up A Notch']")
	private WebElement funk;
	
	@FindBy(xpath="(//img[@alt='men mid rise denim jeans'])[1]")
	private WebElement jeanspant;
	
	@FindBy(xpath="//div[@data-pgn='Add to Cart']")
	private WebElement cart;

	public WebElement getCart() {
		return cart;
	}

	public WebElement getFunk() {
		return funk;
	}

	public WebElement getJeanspant() {
		return jeanspant;
	}
}
