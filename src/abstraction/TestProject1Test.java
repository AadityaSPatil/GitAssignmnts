// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestProject1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testProject1() {
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email_create")).click();
    driver.findElement(By.id("email_create")).sendKeys("aadityapatil1810@gmail.com");
    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
    driver.findElement(By.id("id_gender1")).click();
    driver.findElement(By.id("customer_firstname")).click();
    driver.findElement(By.id("customer_firstname")).sendKeys("Aaditya");
    driver.findElement(By.id("customer_lastname")).click();
    driver.findElement(By.id("customer_lastname")).sendKeys("Patil");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).sendKeys("Aaditya@12");
    driver.findElement(By.cssSelector(".required:nth-child(4)")).click();
    driver.findElement(By.id("days")).click();
    {
      WebElement dropdown = driver.findElement(By.id("days"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:18\\s+']")).click();
    }
    driver.findElement(By.id("months")).click();
    {
      WebElement dropdown = driver.findElement(By.id("months"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:October\\s']")).click();
    }
    driver.findElement(By.id("years")).click();
    {
      WebElement dropdown = driver.findElement(By.id("years"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:1995\\s+']")).click();
    }
    driver.findElement(By.id("firstname")).click();
    driver.findElement(By.id("company")).click();
    driver.findElement(By.id("company")).sendKeys("GlobalLogic");
    driver.findElement(By.id("address1")).click();
    driver.findElement(By.id("address1")).sendKeys("bhaskar nagar,pachora");
    driver.findElement(By.id("address2")).click();
    driver.findElement(By.id("address2")).sendKeys("maharashtra");
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("city")).sendKeys("pachora");
    driver.findElement(By.id("id_state")).click();
    {
      WebElement dropdown = driver.findElement(By.id("id_state"));
      dropdown.findElement(By.xpath("//option[. = 'California']")).click();
    }
    driver.findElement(By.id("city")).click();
    driver.findElement(By.id("postcode")).click();
    driver.findElement(By.id("postcode")).sendKeys("424201");
    driver.findElement(By.id("id_country")).click();
    driver.findElement(By.id("other")).click();
    driver.findElement(By.id("other")).click();
    driver.findElement(By.id("other")).sendKeys("8554927736");
    driver.findElement(By.id("phone_mobile")).click();
    driver.findElement(By.id("phone_mobile")).sendKeys("8208240528");
    driver.findElement(By.cssSelector(".columns-container")).click();
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.id("alias")).click();
    driver.findElement(By.id("alias")).sendKeys("Bhaskar nagar,pachora");
    driver.findElement(By.cssSelector("#submitAccount > span")).click();
    driver.findElement(By.id("postcode")).click();
    driver.findElement(By.id("postcode")).sendKeys("42420");
    driver.findElement(By.cssSelector("#submitAccount > span")).click();
    driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).sendKeys("Aaditya@12");
    driver.findElement(By.cssSelector("#submitAccount > span")).click();
    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
    driver.findElement(By.cssSelector(".sfHover > a")).click();
    driver.findElement(By.cssSelector(".sfHover > a")).click();
    driver.findElement(By.cssSelector("#ul_layered_id_feature_5 > .nomargin")).click();
    driver.findElement(By.id("layered_id_feature_5")).click();
    {
      WebElement element = driver.findElement(By.id("layered_id_feature_5"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("layered_id_attribute_group_14")).click();
    driver.findElement(By.id("layered_id_feature_5")).click();
    driver.findElement(By.id("layered_id_attribute_group_13")).click();
    driver.findElement(By.id("layered_id_feature_11")).click();
    driver.findElement(By.id("layered_id_feature_11")).click();
    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
    driver.findElement(By.cssSelector(".sfHover:nth-child(1) > a")).click();
    driver.findElement(By.cssSelector(".ajax_add_to_cart_button > span")).click();
    driver.findElement(By.cssSelector(".ajax_add_to_cart_button > span")).click();
    driver.findElement(By.cssSelector(".ajax_add_to_cart_button > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".ajax_add_to_cart_button > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("page")).click();
    driver.findElement(By.cssSelector(".button-medium:nth-child(2) > span")).click();
    driver.findElement(By.cssSelector(".second > span")).click();
    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
    driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
    driver.findElement(By.cssSelector(".fancybox-item")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
    driver.findElement(By.linkText("Pay by bank wire (order processing will be longer)")).click();
    driver.findElement(By.cssSelector("#cart_navigation span")).click();
    driver.findElement(By.cssSelector(".navigation_page")).click();
    driver.findElement(By.linkText("Back to orders")).click();
  }
}
