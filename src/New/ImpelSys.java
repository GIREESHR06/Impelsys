package New;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import com.hrms.lib.General;
public class ImpelSys {
	public static void main(String args[])throws Exception {
		System.out.println("login done");
		General g =new General();
		g.openbrowser();
		Thread.sleep(10000);
		g.closebrowser();
		
		System.out.println("completed");

	}

}
