package Selenium;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    @Test
    @RepeatedTest(10)
    public static void main(String[] args) {
        //make sure to have geckodriver at the relevant filepath
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
