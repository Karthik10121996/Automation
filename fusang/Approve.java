package fusang;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approve {
	static {
		System.setProperty("webdriver.chrome.driver","/home/hashworks/Downloads/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Enter the URL
        driver.get("https://beta-vault.fusang.co/#/");
        // Enter the User mail id(Name)
        driver.findElement(By.name("username")).sendKeys("aditya@getnada.com");
        // Enter the Password
        driver.findElement(By.name("password")).sendKeys("12345678901234567890");
        // Click on SignIn button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(8000);
        // Enter the Auth Code
        String c="061395";
        driver.findElement(By.name("verificationCode")).sendKeys(c);
        // Click on Submit button
        driver.findElement(By.xpath("//button[@class='btn sub-btn-info']")).click();
        // Click on open tickets under approver card
        driver.findElement(By.xpath("//div[@class='ticket-cellopen ticket-cell ticketCellActive']")).click();
        Thread.sleep(2000);
        // Click on Claim button
        driver.findElement(By.xpath("(//span[@class='tableStatus claim1 ng-star-inserted'])[1]")).click();
        // Click on CONFIRM button on Confirmation popup
        driver.findElement(By.xpath("//button[@class='successBtn']")).click();
        // Wait untill Toaster message is disappear
         Thread.sleep(8000);
        // Click CANCEL button on Confirmation popup
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2000);
        // Click on claimed grid under approver card
        driver.findElement(By.xpath("(//div[@class='col-md-4 ticketcelcol'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//tr[@role='row'])[2]")).click();
        // Click on approve button
        driver.findElement(By.xpath("//button[@class='btn-orange btn-orange-cap ng-star-inserted']")).click();
        // Enter Auth code
        driver.findElement(By.name("authcode")).sendKeys(c);
        // Click on Verify button
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        // Enter the note
        driver.findElement(By.xpath("//textarea[@placeholder=\"Enter the Note\"]")).sendKeys("verified");
        // Click on Submit button
        driver.findElement(By.xpath("//button[@class='btn-orange marg32']")).click();
        Thread.sleep(7000);
	}
}
