package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;
import com.pom.Pom;
import com.runner.Testrunner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class Stepdefinition extends Baseclass {
	
	public WebDriver driver = Testrunner.driver;
	Pom p = new Pom(driver);
	
	
	
	@Given("Launch the url {string}")
	public void launch_the_url(String string) {
		geturl("https://www.limeroad.com/");
	    }

	@When("click the element to select the shop men to navigate to men page")
	public void click_the_element_to_select_the_shop_men_to_navigate_to_men_page() throws InterruptedException {
	  clickonelement(p.getFp().getMen());
	  
	}

	@When("Click the element to select winter icon")
	public void click_the_element_to_select_winter_icon() throws InterruptedException {
		
	   clickonelement(p.getFp().getWinter());
	}

	@When("user click cutest duo rn")
	public void user_click_cutest_duo_rn() {
	  clickonelement(p.getFp().getCutest());
	}

	@When("Click the element to select Solids Polyester Single Breasted Suits")
	public void click_the_element_to_select_solids_polyester_single_breasted_suits() {
	   clickonelement(p.getwp().getSolids());
	}

	@When("Click the element to select add to cart")
	public void click_the_element_to_select_add_to_cart() {
	  clickonelement( p.getwp().getCart());
	}

	

	@When("Click the element to select kids icon")
	public void click_the_element_to_select_kids_icon() {
	    clickonelement(p.getFp().getKids());
	}
	@When("user click wedding special edit")
	public void user_click_wedding_special_edit() {
	    clickonelement(p.getFp().getWedding());
	}

	@When("Click the element to select Boys Turquoise Solid Dhoti Kurta Set")
	public void click_the_element_to_select_boys_turquoise_solid_dhoti_kurta_set() {
	 clickonelement(p.getkp().getKurta());
	}
	@When("Click the element to select add to cart1")
	public void click_the_element_to_select_add_to_cart1() {
		clickonelement(p.getkp().getCart());
	   }
	




	@When("Click the element to select jeans icon")
	public void click_the_element_to_select_jeans_icon() {
	   clickonelement( p.getFp().getJeans());
	}

	@When("user click funk it up a notch")
	public void user_click_funk_it_up_a_notch() {
	 clickonelement(p.getjp().getFunk());
	}


	@When("Click the element to select mid rise light washed denim jean")
	public void click_the_element_to_select_mid_rise_light_washed_denim_jean() {
	   clickonelement(p.getjp().getJeanspant()); 
	}

	@When("click the element to select add to cart2")
	public void click_the_element_to_select_add_to_cart2() {
		clickonelement(p.getjp().getCart());
	  }



	@When("Click the element to select shirts icon")
	public void click_the_element_to_select_shirts_icon() {
		p.getFp().getShirts();
	    }

	@When("user click top summer faves")
	public void user_click_top_summer_faves() {
		clickonelement(p.getsp().getSunny());
	  }

	@When("Click the element to select Beige Coloured Printed Casual Shirt")
	public void click_the_element_to_select_beige_coloured_printed_casual_shirt() {
		
		clickonelement(p.getsp().getPrinted());	  
	}
		
		@When("Click the element to select add to cart3")
		public void click_the_element_to_select_add_to_cart3() {
			clickonelement(p.getsp().getCart());
		  
		}
		
		    
		

	@When("Click the element to select footwear icon")
	public void click_the_element_to_select_footwear_icon() {
		clickonelement(p.getFp().getFootwear());
		
	 }

	@When("user click comfort over everything")
	public void user_click_comfort_over_everything() {
		
		clickonelement(p.getFp().getCoe());
	    }
	@When("Click the element to select black back strap sandal")
	public void click_the_element_to_select_black_back_strap_sandal() {
	clickonelement(p.getffp().getSandal());
	
	
	}
	

	@When("Click the element to select add to cart4")
	public void click_the_element_to_select_add_to_cart4() {
		
		clickonelement(p.getffp().getCart());
	   }
	
	
	    
	
	}


