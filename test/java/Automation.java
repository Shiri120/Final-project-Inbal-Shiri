import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    private  String url;
            public Automation(String url){
        this.url = url;
            }
        public String SignUpTest() {
        System.setProperty("webdriver.chrome.driver",this.url);
            WebDriver driver = new ChromeDriver();

            driver.get("http://automationpractice.com/");
            return driver.getCurrentUrl();

        }

    public String NewTitle() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver",this.url);
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");

        //לחיצה על כפתור Sign In
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

        //הכנסת מייל משתמש חדש
        driver.findElement(By.xpath("//*[@id=\"create-account_form\"]/div/div[2]/label")).click();
       // Thread.sleep(2500);
        WebElement emailaddress= driver.findElement(By.id("email_create"));
        emailaddress.sendKeys("duv12228@gmail.com");
        //Thread.sleep(2500);

        //לחיצה על כפתור Create An Account
        WebElement createAccount=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        createAccount.click();
        Thread.sleep(2500);

        //הגדרת מין המשתמש
        driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]"));
        WebElement genderBTN= driver.findElement(By.id("uniform-id_gender1"));
        genderBTN.click();
        //Thread.sleep(2500);

        //הגדרת שם פרטי
        driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[2]/label"));
        WebElement firstName=driver.findElement(By.id("customer_firstname"));
        firstName.sendKeys("Duvi");
       // Thread.sleep(2500);

        //הגדרת שם משפחה
        driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[3]/label"));
        WebElement lastname=driver.findElement(By.id("customer_lastname"));
        lastname.sendKeys("Israel");
        //Thread.sleep(2600);

        //הגדרת מייל
        driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[4]/label"));
        driver.findElement(By.id("email")).click();
      //  Thread.sleep(2600);

        //הגדרת סיסמא
        driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[5]/label"));
        WebElement password=driver.findElement(By.id("passwd"));
        password.sendKeys("123l!");
       // Thread.sleep(2700);

        //הגדרת תאריך לידה
        driver.findElement(By.xpath("//*[@id=\"days\"]/option[29]")).click();
       // Thread.sleep(2700);
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[7]")).click();
       // Thread.sleep(2800);
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[44]")).click();
       // Thread.sleep(2800);

        //סימון בתיבות
        driver.findElement(By.xpath("//*[@id=\"uniform-newsletter\"]")).click();
       // Thread.sleep(2800);
        driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
       // Thread.sleep(2900);

        //הגדרת שם פרטי ושם משפחה של הכתובת
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[1]/input[1]")).click();
        driver.findElement(By.id("firstname")).click();
        //Thread.sleep(2800);
        driver.findElement(By.id("lastname")).click();
        //Thread.sleep(2800);

        //הגדרת שם החברה
        WebElement company=driver.findElement(By.id("company"));
        company.sendKeys("HAREL");
        //Thread.sleep(2900);

        //הגדרת כתובת 1
        WebElement addres1=driver.findElement(By.id("address1"));
        addres1.sendKeys("ABSCF");
        //Thread.sleep(2800);

        //הגדרת כתובת 2
        WebElement addres2=driver.findElement(By.id("address2"));
        addres2.sendKeys("11,50,1111");
       // Thread.sleep(2900);

        //שם העיר
        WebElement city=driver.findElement(By.id("city"));
        city.sendKeys("ramatgan");
       // Thread.sleep(2800);

        //הגדרת שם המדינה
        driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[34]")).click();
        //Thread.sleep(2900);

        //הגדרת מיקוד
        WebElement postcode=driver.findElement(By.id("postcode"));
        postcode.sendKeys("52355");
       // Thread.sleep(2800);

        //הגדרת מידע נוסף
        WebElement other=driver.findElement(By.id("other"));
        other.sendKeys("אנחנו שמחות שסיימנו עם החלק הראשון");
        //Thread.sleep(2800);

        //הגדרת טלפון 1
        WebElement homephone=driver.findElement(By.id("phone"));
        homephone.sendKeys("03678724");
        //Thread.sleep(2800);

        //הגדרת טלפון 2
        WebElement Mphone=driver.findElement(By.id("phone_mobile"));
        Mphone.sendKeys("0506978724");
       // Thread.sleep(2800);

        //הגדרת מייל נוסף
        WebElement alias=driver.findElement(By.id("alias"));
        alias.sendKeys("shuishf@gmail.com");
        //Thread.sleep(2800);

        //לחיצה על כפתור Register
        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();

        //המשתמש נוצר בהצלחה!!!

        return driver.getTitle();
}
}
