package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.BasePage;

public class Login extends BasePage{
	@FindBy(id="login_Layer")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	private WebElement password;
	
	@FindBy(xpath = "//div[@class='view-profile-wrapper']")
	private WebElement Profile;
	
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement updateResume;
	
	@FindBy(xpath = "//img[@alt='naukri user profile image']")
	private WebElement userProfile;
	
	@FindBy(xpath = "//a[@title='Logout']")
	private WebElement logout;

	public Login(WebDriver driver) {
		super(driver);
	}

	public void tapaswiniUpload() throws AWTException, InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(loginBtn));
		loginBtn.click();
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("tapaswiniautomationqa@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("tapaswiniQA@123");
		password.submit();
		wait.until(ExpectedConditions.visibilityOf(Profile));
		Profile.click();
		wait.until(ExpectedConditions.visibilityOf(updateResume));
		updateResume.click();
		Thread.sleep(3000);
		StringSelection tapaswinifile=new StringSelection("C:\\Users\\TAPASWINI\\OneDrive\\Desktop\\Selenium\\NaukriAutomation\\CV\\TapaswiniPradhan_Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(tapaswinifile, null);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(userProfile));
		userProfile.click();
		wait.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
		Thread.sleep(2000);
	}


}
