package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FramePractice2 {
	
	public static void main(String[] args) {
		
		WebDriver web = new FirefoxDriver();
		web.manage().window().maximize();
		
		web.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		web.switchTo().frame("frm1");
		
		WebElement home = web.findElement(By.id("selectnav1"));
		Select ss = new Select(home);
		
		ss.selectByIndex(3);
		
		web.switchTo().defaultContent();
		
	/*	WebElement selectcourse = web.findElement(By.id("course"));
		Select s1 = new Select(selectcourse);
		
		s1.selectByIndex(3);*/
		
		web.switchTo().frame("frm2");
		
		 web.findElement(By.id("firstName")).sendKeys("Ishwari ");
		
	}

}
