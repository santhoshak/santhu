package santhosh;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class settings2 
{

      public static void main(String[] args) throws IOException, InterruptedException {
              System.setProperty("webdriver.chrome.driver", "/home/param/Documents/chromedriver");
              

              WebDriver driver = new ChromeDriver();
              driver.manage().window().maximize();
              
             
              
              
              driver.get("https://getnada21584.app.param.ai/app/onboarding");
              Thread.sleep(1000L);
          
              //login credentiles jithendar reddy
     
              driver.findElement(By.id("id_email")).sendKeys("vihakyc@getnada.com");
              driver.findElement(By.id("id_password")).sendKeys("Santhosh123$");
              driver.findElement(By.id("btn")).click();
              
              Thread.sleep(2000L);
              
              driver.findElement(By.xpath("/html/body/div[1]/header/div/a[9]/i")).click();
              
              Thread.sleep(2000L);
              
              //My profile
              
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div[1]/a[1]/i")).click();
             driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[1]/div[1]/input")).clear();
             Thread.sleep(1000L);
             driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("jithendar");
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[1]/div[2]/input")).clear();
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[1]/div[2]/input")).sendKeys("reddy");
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[2]/input"));
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[3]/input"));
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[4]/input"));
             
         
                   
             WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[5]/div/input[2]"));
             
             element1.click();
             
             WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[5]/div/div[2]/div[583]"));
             
             
             element.click();
             
             
             
             driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[3]/button")).click();
             Thread.sleep(2000L);
             
             //Company profile
             
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div[3]/a[1]")).click();
             Thread.sleep(2000L);
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[1]/input")).clear();
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[1]/input")).sendKeys("param.ai");
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[2]/input")).clear();
             
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[2]/input")).sendKeys("https://param.ai/");
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[3]/input")).sendKeys("https://paramteam/");
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[4]/textarea")).clear();
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[4]/textarea")).sendKeys("about the company");
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[6]/div/input")).clear();
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[6]/div/input")).sendKeys("santhosh.adlam26@gmail.com");
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[7]/div/input")).clear();
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[7]/div/input")).sendKeys("@santhu");
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[8]/div/input")).clear();
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/form/div[8]/div/input")).sendKeys("santhoshreddy121");
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[3]/button")).click();
             
             //Office locations
             
             driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/div[3]/a[2]")).click();
             Thread.sleep(3000L);
             driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div[1]/div")).click();
             
             driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div[1]/input")).sendKeys("Head office");
          
         
          
             driver.findElement(By.xpath("//*[@id=\"content\"]/div[6]/div/div[2]/div/div[2]/div[1]/div/input[2]")).sendKeys("India");
             
             driver.findElement(By.xpath("//*[@id=\"content\"]/div[6]/div/div[2]/div/div[2]/div[2]/input")).sendKeys("telangana");
             driver.findElement(By.xpath("//*[@id=\"content\"]/div[6]/div/div[2]/div/div[3]/div[1]/input")).sendKeys("5000001");
             
             
             
             WebElement elementcou=driver.findElement(By.xpath("//*[@id=\"content\"]/div[6]/div/div[2]/div/div[3]/div[2]/div/input[2]"));
             
             elementcou.click();
                        
             WebElement elementcouval=driver.findElement(By.xpath("//*[@id=\"content\"]/div[6]/div/div[2]/div/div[3]/div[2]/div/div[2]/div[99]"));        
           
             elementcouval.click();
          
             Thread.sleep(1000L);
             
             
             WebElement elementtime=driver.findElement(By.xpath("//*[@id=\"content\"]/div[6]/div/div[2]/div/div[4]/div/div/input[2]"));
             
             elementtime.click();
             
             WebElement elementtimeval=driver.findElement(By.xpath("//*[@id=\"content\"]/div[6]/div/div[2]/div/div[4]/div/div/div[2]/div[386]"));
             
             elementtimeval.click();
             Thread.sleep(1000L);
             driver.findElement(By.xpath("//*[@id=\"content\"]/div[6]/div/div[3]/div[2]")).click();
             driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div/div/div[2]/div[3]/div/div[2]/div[2]/div/div[3]/div/a[2]/i")).click();
        
              //Business unit
             
             
             driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div/div/div/div[1]/div/div[5]/a[4]")).click();
             
             //LOGOUT JITHENDARREDDY
             
             driver.findElement(By.className("company_details")).click();
             Thread.sleep(2000L);
             driver.findElement(By.cssSelector("a[href='/logout']")).click();
             Thread.sleep(2000L);
             driver.quit();
  	        
      
      
           
          
            
             
        
             
             
             
      }         
             
             
             
             
             
}
