package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "xpathofmenmenu")
	WebElement menmenubar;
	@FindBy(xpath = "xpathofshirtsubmenu")
	WebElement shirtsubmenu;

	public void hoveroveronmenmenu() {
		Shared.hoverover(menmenubar);
	}

	public ShirtPage clickonshirtsubmenu() {
Shared.click(shirtsubmenu);
return new ShirtPage(driver);
	}
}