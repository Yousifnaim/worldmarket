import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class mainTest {
    WebDriver driver;
    WebDriverWait Timer;
    @BeforeClass
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Timer = new WebDriverWait(driver , 500);
        driver.get("https://www.worldmarket.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("[+] The SetUp Done ");
    }
    @Test
    public void Test1(){
        WebElement CloseWelcome = driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
        CloseWelcome.click();
        System.out.println("[+] The Test1 Done and Close the Welcome page ");


    }

    //Check TheLogo Is Exist "Test2"
    @Test
    public void Test2(){
        WebElement VerifyThatTheClosedIsDone = driver.findElement(By.xpath("//*[@id='ml-body-container']/header/div[1]/div[6]/div/div/div/div[2]/div[2]/div/a/picture/img"));
        Assert.assertTrue(VerifyThatTheClosedIsDone.isDisplayed());
        System.out.println("[+] The Test2 Done and The Logo is Existing");
    }
    @Test
    public void Test3(){
        WebElement VerifyThatPersonaIconIsClickAble = driver.findElement(By.xpath("//form[@id='showLoginForm']//span[@class='ml-icon-lib ml-icon-user']"));
        VerifyThatPersonaIconIsClickAble.click();
        System.out.println("[+] The Test3 Done and The Persona Is Opened");
    }

}
