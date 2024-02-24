//Package arSoft;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArTest {
    public class RegressTest {




        @Test
        public void PassworTest () throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get(URL);

            String titlel = driver.getTitle();

            WebElement textBoxl = driver.findElement(By.xpath("//h2[@class='ant-typography h2_m Login__restore-text']"));

            textBoxl.click();

            Thread.sleep(2000);

            WebElement submitPassword = driver.findElement(By.xpath("//input[@id='RestorePassword_email']"));


            WebElement submitButtonlProject = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default primaryButton big colorPrimary ']"));

            submitButtonlProject.click();


            WebElement textProjectName = driver.findElement(By.xpath("//input[@class='ant-input primaryInput  not-entered']"));

            textProjectName.sendKeys("1Новый проект");
