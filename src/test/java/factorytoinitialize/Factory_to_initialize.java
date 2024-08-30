package factorytoinitialize;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Factory_to_initialize {
	
	
	
	public WebDriver driver;
	public Properties prop;
	public Properties dataprop;
	public FileInputStream ip;
	
	public Factory_to_initialize() throws Exception {
		
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\difficult_Selenium_Framework_quetionsConfig\\config.prop");		
		prop.load(ip);
		
		dataprop = new Properties();
		ip = new FileInputStream(System.getProperty("user.di") + "\\src\\test\\java\\difficult_Selenium_Framework_quetionsdataProp.properties");
		dataprop.load(ip);
		
		
	}
	
	public WebDriver initializeBrowserAndOpenApplication(String browserName) {
		if(browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-inforbars"));
			driver = new ChromeDriver(options);
			
		}else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}else {
			System.out.println("Browser Not matching");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.implicit_wait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.pageload_timeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.script_timeout));
		driver.get("https://tutorialsninja.com/demo");
		return driver;
	}

}
