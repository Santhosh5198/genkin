package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Winterpage extends Baseclass{


public Winterpage(WebDriver driver1) {
		
		driver = driver1;
		PageFactory.initElements(driver, this);
		}
	
@FindBy(xpath="//img[@alt='solids polyester single breasted suits']")
private WebElement solids;

@FindBy(xpath="//div[@data-pgn='Add to Cart']")
private WebElement cart;	


public WebElement getSolids() {
	return solids;
}

public WebElement getCart() {
	return cart;
}
}