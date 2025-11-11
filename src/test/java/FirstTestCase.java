


/*Test Case
 *1)LAunch Browser(Chrome)
 *2)Open URL: https://demo.opencart.com/
 *3)Validate title should be "Your Store"
 *4)Close Browser 
 * */


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver; // this is added manually 

public class FirstTestCase {

	public static void main(String[] args) {
		
		// 1)LAunch Browser(Chrome)---
		// we create  an object for ChromeDriver class  because we need chrome launch , and 
		// as soon as we create object ,that ChromeDriver class has an constructor which launches chrome browser
		
//		ChromeDriver driver= new ChromeDriver();
		WebDriver driver= new ChromeDriver();  // upcasting // either is fine // this is preferred 
		
		//2)Open URL: https://demo.opencart.com/
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//3)Validate title should be "Your STore"
		
		String act_title=driver.getTitle();
		if(act_title.equalsIgnoreCase("OrangeHRM"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed ");
		}
		
		//4)Close Browser 
		//driver.close();
		driver.quit();

	}

}
