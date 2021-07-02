package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreCondition {

	public static void loginVcentry(WebDriver wd) {
		// TODO Auto-generated method stub
		
		wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
		wd.findElement(By.linkText("Login")).click();
		wd.findElement(By.name("username")).sendKeys("SatheeshKM");
		wd.findElement(By.name("password")).sendKeys("shyma@18");
		wd.findElement(By.name("password")).submit();


	}

}
