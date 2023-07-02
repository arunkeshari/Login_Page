package Login_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/MAHADEV/Documents/Automation/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //1.Go to https://www.amazon.in
        driver.get("https://www.amazon.in/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        
        //Search Item
        searchBox.sendKeys("Wrist watches");
        searchBox.submit();

        WebElement display = driver.findElement(By.xpath("//span[contains(text(),'Analogue')]"));
        display.click();

        WebElement brandMaterial = driver.findElement(By.xpath("//span[contains(text(),'Leather')]"));
        brandMaterial.click();

        WebElement brand = driver.findElement(By.xpath("//span[contains(text(),'Titan')]"));
        brand.click();

        WebElement discount = driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]"));
        discount.click();
        
        
        WebElement fifthElement = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[5]"));
        System.out.println("Fifth element: " + fifthElement.getText());

        driver.quit();
    }
}