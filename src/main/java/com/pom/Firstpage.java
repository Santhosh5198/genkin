package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Firstpage extends Baseclass {

	public Firstpage(WebDriver driver1) {
		
		driver = driver1;
		PageFactory.initElements(driver, this);
		}
	
	
	

	@FindBy(xpath="//span[text()='SHOP MEN']")
	private WebElement men;

	

	@FindBy(xpath="//img[@alt='T-shirt']")
	private WebElement tshirt;
	
	@FindBy(xpath="//img[@alt='Shirts']")
	private WebElement shirts;
	
	@FindBy(xpath="//img[@alt='Jeans']")
	private WebElement jeans;
	
	@FindBy(xpath="(//img[@alt='Kids'])[1]")
	private WebElement kids;
	
	@FindBy(xpath="(//img[@alt='Home'])[1]")
	private WebElement home;
	
	@FindBy(xpath="//div[@class='loaderCat vipwinterwear_menLdr dIb mA pA r0   h80 b4 l0 t0 ']")
	private WebElement winter;
	
	@FindBy(xpath="(//div[@class='bs oH toE strC pR taL p4  bd2E br4 bgF m6  fg2t dIb vT'])[2]")
	private WebElement cutest;
	
	@FindBy(xpath="//img[@alt='Wedding Special Edit']")
	private WebElement wedding;
	
	@FindBy(xpath="(//img[@alt='Footwear'])[1]")
	private WebElement footwear;
	
	@FindBy(xpath="//img[@alt='Comfort Over Everything']")
	private WebElement coe;
	
	public WebElement getCoe() {
		return coe;
	}

	public WebElement getCutest() {
		return cutest;
	}

	public WebElement getFootwear() {
		return footwear;
	}

	public WebElement getMen() {
		return men;
	}

	public WebElement getWedding() {
		return wedding;
	}



	public WebElement getWinter() {
		return winter;
	}



	public WebElement getShirts() {
		return shirts;
	}
	public WebElement getJeans() {
		return jeans;
	}
	public WebElement getKids() {
		return kids;
	}
	public WebElement getHome() {
		return home;
	}
	public WebElement getTshirt() {
		return tshirt;
	}
}
