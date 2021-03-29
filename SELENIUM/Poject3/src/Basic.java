import java.sql.Driver;


public class Basic {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Welcome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   // Webdriver is an interface , Chromedriver is a class
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");  //provide the url to redirect to the particular webpage
}
}