import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver


class SeleniumGroovy {
    static void main(args){
        WebDriver driver = new FirefoxDriver()
        driver.get("http://www.google.com")
    }
}
