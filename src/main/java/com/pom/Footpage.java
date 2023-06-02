package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Footpage extends Baseclass{

	public Footpage(WebDriver driver1) {
		
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='black back strap sandal']")
	private WebElement sandal;
	
	@FindBy(xpath="//div[@data-pgn='Add to Cart']")
	private WebElement cart;
	
	


	public WebElement getSandal() {
		return sandal;
	}

	public WebElement getCart() {
		return cart;
	}
	
	

	}

