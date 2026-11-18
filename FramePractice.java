package frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramePractice {
	public static void main(String[] args) {
		WebDriver web = new FirefoxDriver();
		web.manage().window().maximize();
		

		web.get("https://the-internet.herokuapp.com/nested_frames");
		
		
	}
	
	

}
