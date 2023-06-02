package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Kidspage extends Baseclass {
	


public Kidspage(WebDriver driver1) {
		
		driver = driver1;
		PageFactory.initElements(driver, this);
		}

@FindBy(xpath="//img[@alt='boys turquoise solid dhoti kurta set ']")
private WebElement kurta;

@FindBy(xpath="//div[@data-pgn='Add to Cart']")
private WebElement cart;
public WebElement getKurta() {
	return kurta;
}

public WebElement getCart() {
	return cart;
}


}
