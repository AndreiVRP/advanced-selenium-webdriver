package com.herokuapp.theinternet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class KeyPressesPage extends BasePage {

	private String pageUrl = "http://the-internet.herokuapp.com/key_presses";

	private By body = By.xpath("//body");
	private By resultTextLocator = By.id("result");

	public KeyPressesPage(WebDriver driver, Logger log) {
		super(driver, log);
	}

	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	public void pressKey(Keys key) {
		log.info("Pressing " + key.name());
		pressKey(body, key);
	}

	public String getResultText() {
		String result = find(resultTextLocator).getText();
		log.info("Result text: " + result);
		return result;
	}

}
