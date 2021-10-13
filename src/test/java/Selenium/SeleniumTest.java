package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\CodeStuffs\\geckodriver-v0.30.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String appTitle = driver.getTitle();
        String expTitle = "Google";
        if(appTitle.equals(expTitle)){
            System.out.println("Verification Successful");
                    } else {
            System.out.println("Verification Failed");
        }
        driver.close();
        System.exit(0);
    }

}