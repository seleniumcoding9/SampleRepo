import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SwaglabsExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
        driver.manage().window().maximize();
        //WebElement webelement = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        //driver.findElement(By.xpath("//option[@value='lohi']")).click();
        WebElement web = driver.findElement(By.className("spTextField"));

        Select select = new Select(web);
        //List<WebElement> listoptions = select.getOptions();
        //System.out.println(listoptions.size());
        select.selectByIndex(2);
    }
}
