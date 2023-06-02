package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Pom extends Baseclass{
	public WebDriver driver;
	public Pom(WebDriver driver) {
		this.driver=driver;
	}
	private Firstpage fp;
	
	public Firstpage getFp() {
		fp = new Firstpage(driver);
		return fp;
	}
	private Winterpage wp;
	
	public Winterpage getwp() {
		wp = new Winterpage(driver);
		return wp;
	}
	
	
	private Kidspage kp;
	
	public Kidspage getkp() {
		kp = new Kidspage(driver);
		return kp;
	}
	
	private Jeanspage jp;
	
	public Jeanspage getjp() {
		jp = new Jeanspage(driver);
		return jp;
	}
	private Shirtpage sp;
	public Shirtpage getsp() {
		sp = new Shirtpage(driver);
		return sp;
		
	}
	private Footpage ffp;
	public Footpage getffp() {
		ffp= new Footpage(driver);
		return ffp;
	}
}
