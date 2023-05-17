package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class ShirtPage {
	WebDriver driver;

	public ShirtPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "xpathofanyshirt")
	WebElement anyshirt;
	public ProductDetailsPage clickanyshirt() {
		Shared.click(anyshirt);
		return new ProductDetailsPage();
	}
}
