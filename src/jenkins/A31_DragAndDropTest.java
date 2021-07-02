package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utils.PreCondition;

public class A31_DragAndDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		PreCondition.loginVcentry(wd);
		wd.get("http://djangovinoth.pythonanywhere.com/draganddrop/");
		
		WebElement drag=wd.findElement(By.id("draggable"));
		WebElement drop=wd.findElement(By.id("droppable"));
		
		// Select s=new Select(dropdown);  import org.openqa.selenium.support.ui.Select;
		
		// Actions a=new Actions(wd);   import org.openqa.selenium.interactions.Actions;
		
		
		Actions a=new Actions(wd);
		// a.dragAndDrop(drag, drop);   won't run
		// a.dragAndDrop(drag, drop)perform();  it will run but don't use
		a.dragAndDrop(drag, drop).build().perform();
	
		System.out.println("hi");
}
}
