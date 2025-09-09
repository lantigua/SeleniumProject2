import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ElemntLocatorsTagName {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void TestCollection3(){
        driver.navigate().to("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));
        System.out.println("Number of Rows: " + tableRows.size());
        System.out.println(tableRows.getFirst().getText());
        System.out.println(tableRows.get(2).getText());

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
