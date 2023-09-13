package org.ictkerala.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	

	private WebElement username;
	private WebElement passt;
	private WebElement logina;
	private WebElement passErr;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void setUsername(String setUser)
	{
		username=driver.findElement(By.id("user-name"));
		//username.sendKeys(setUser);
		username.clear();
		username.sendKeys(setUser);
	}
	
	public void setPass(String passw)
	{
		//passt.sendKeys(passw);
		passt=driver.findElement(By.id("password"));
		passt.clear();
		passt.sendKeys(passw);
	}
	
	public void loginclick() {
		logina=driver.findElement(By.id("login-button"));
		logina.click();
	}
	public String getError() {
		
		return(driver.findElement(By.xpath("//h3[@data-test='error']")).getText());
		
	}
	public String getLogotext()
	{
		return(driver.findElement(By.xpath("//span[@class='title']")).getText());
	}
	
}
