package ar.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.time.Duration;



    //@Liisteners({FilterForTests.class})
    public abstract class BaseTest {

        public static final String URL = "";
        public static final String INPUT_PASSWORD = "//input[@class='ant-input']";
        public static final String INPUT_EMAIL = "//input[@class='ant-input primaryInput  not-entered']";
        public static final String BTN_PASSWORD = "//button[@class='ant-btn ant-btn-default authButton big colorPrimary ']";
        public static final String EMAIL = "";
        public static final String PASSWORD = "";

        //    public static final String DESCRIPTION = "Test description";

        public WebDriver driver;


        static void login(WebDriver driver) {
            driver.findElement(By.xpath(INPUT_EMAIL)).sendKeys(EMAIL);
            driver.findElement(By.xpath(INPUT_PASSWORD)).sendKeys(PASSWORD);
            driver.findElement(By.xpath(BTN_PASSWORD)).click();
        }

        @BeforeMethod
        protected void beforeMethod(Method method) {
//            driver = new ChromeDriver(ProjectUtils.chromeOptions);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @AfterMethod
        protected void afterMethod(Method method, ITestResult testResult) {
            driver.quit();
        }

        protected WebDriver getDriver() {
            return driver;
        }

    }


