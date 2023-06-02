package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\santh\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\feature\\lime.feature", glue ="com.stepdefinition")
//monochrome = true,
//dryRun = false,
//strict = true,
//plugin = {"pretty", "html:Reports/limeroad.html",
//		"json:reports/limeroad.json",
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//
//		)

public class Testrunner extends Baseclass{
	public static WebDriver driver;
	@BeforeClass
	public static void basic() {
		driver=browserlaunch("chrome");
	}
//	@AfterClass
//	public static void end() {
//		shut();
//	}

}
