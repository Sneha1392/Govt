package pages;

import org.apache.tools.ant.taskdefs.Java;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.io.IOException;
import java.sql.Time;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class LoginPage {
    static WebDriver driver;
Logger log= Logger.getLogger(LoginPage.class.getName());


public static String menu= "{$menu}";
private static String menuselected=String.format("//a[@alt='%s']",menu);

public static String submenu = "{$submenu}";
private static String submenuselected=String.format("//h4[text()='%s']",submenu);

public static String Sector= "{$Sector}";
private static String sectors=String.format("//div[text()='%s']",Sector);

public static String yesoption="{$yesoption}";
private static String yes=String.format("//input[@name='%s']//following-sibling::span[text()='Yes']",yesoption);

public static String nooption="{@nooption}";
private static String no=String.format("//input[@name='%s']//following-sibling::span[text()='No']",nooption);

public static String grantid= "{$grantid}";
private static String grantbtn=String.format("//input[@id='%s']",grantid);

    public LoginPage() throws IOException {
    }

    @FindBy(how = How.XPATH, using = "//p[@class='help-inline field-error-message']")
    private static WebElement errmsg;
@FindBy(how = How.XPATH, using = "//input[@id='react-contact_info-primary_email']")
private static WebElement email;
    @FindBy(how = How.XPATH, using = "//input[@id='react-contact_info-name']")
    private static WebElement name;
    @FindBy(how = How.XPATH, using = "//input[@id='react-contact_info-phone']")
    private static WebElement phone;
    @FindBy(how = How.XPATH, using = "//input[@id='react-contact_info-designation']")
    private static WebElement jobtitle;
    @FindBy(how = How.XPATH, using = "//input[@id='react-contact_info-secondary_email']")
    private static WebElement altemail;

    @FindBy(how = How.XPATH, using ="//button[@id='review-btn']")
    private static WebElement reviewbtn;

@FindBy(how = How.XPATH,using = "//input[@id='react-contact_info-correspondence_address-block']")
private static WebElement hseno;

@FindBy(how = How.XPATH,using = "//input[@id='react-contact_info-correspondence_address-street']")
private static WebElement street;

@FindBy(how = How.XPATH,using = "//input[@id='react-contact_info-correspondence_address-postal']")
private static WebElement postalcode;

@FindBy(how = How.XPATH, using = "//input[@id='react-contact_info-offeree_name']")
private static WebElement lettername;

@FindBy(how = How.XPATH, using = "//input[@id='react-contact_info-offeree_designation']")
private static WebElement offerjobtitle;

@FindBy(how = How.XPATH,using = "//input[@id='react-contact_info-offeree_email']")
private static WebElement offeremail;

@FindBy(how = How.XPATH, using = "//input[@id='react-project-title']")
private static WebElement projecttitle;

@FindBy(how = How.XPATH, using = "//input[@id='react-project-start_date']")
private static WebElement startdate;

@FindBy(how = How.XPATH, using = "//input[@id='react-project-end_date']")
private static WebElement enddate;

@FindBy(how = How.XPATH, using = "//div[@class='bgp-readonly']")
private static WebElement Projduration;

@FindBy(how = How.XPATH, using = "//textarea['react-project-description']")
private static WebElement description;

//@FindBy(how = How.XPATH, using = "//span[@id='react-select-project-activity--value']")
@FindBy(how = How.XPATH, using = "//*[@id='react-select-project-activity--value']/div[1]")
private static WebElement activity;

@FindBy(how = How.XPATH, using = "//*[@id='react-select-project-primary_market--value']/div[1]")
private static WebElement targetmarket;

@FindBy(how = How.XPATH, using = "//input[@id='react-project-entity_type']")
private static WebElement entity;

@FindBy(how = How.XPATH, using = "//input[@id='react-project-shareholding_percentage']")
private static WebElement percentage;

@FindBy(how = How.XPATH, using = "//input[@id='react-project_impact-fy_end_date_0']")
private static WebElement fyienddate;


    public void setup(String username, String password) {
        String path=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",path+"\\src\\test\\resources\\drivers\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        LoginPage al = PageFactory.initElements(driver, LoginPage.class);

        String URL = "https://" + username + ":" + password + "@" + "bgp-qa.gds-gov.tech/";
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


     public void corpass(String NRIC, String name, String UEN, String Role)
     {
         WebElement logintocorpass=driver.findElement(By.xpath("//div[@id='login-button']"));
         logintocorpass.click();
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
         Assert.assertEquals(driver.getCurrentUrl(),"https://bgp-qa.gds-gov.tech/saml/sso_stub");
         driver.findElement(By.xpath("//h6[text()='Login with predefined user']"));
         WebElement nric=driver.findElement(By.xpath("//input[@placeholder='NRIC']"));
         nric.clear();
         nric.sendKeys(NRIC);
         WebElement Name= driver.findElement(By.xpath("//input[@placeholder='Name']"));
         Name.clear();
         Name.sendKeys(name);
         WebElement Uen= driver.findElement(By.xpath("//input[@placeholder='UEN']"));
         Uen.clear();
         Uen.sendKeys(UEN);
         Select s=new Select(driver.findElement(By.xpath("//select[@name='CPRole']")));
         s.selectByVisibleText("Acceptor");
         driver.findElement(By.xpath("//button[text()='Login']")).click();
         Assert.assertEquals(driver.findElement(By.xpath("//a[@class='masthead-link']")).getText(),"A Singapore Government Agency Website");

     }

     public void clickgrant(String Menu, String SubMenu)
     {
         WebElement menutobeselected=driver.findElement(By.xpath(String.format(menuselected.replace(menu,Menu))));
      Actions a=new Actions(driver);
      a.moveToElement(menutobeselected).click().perform();
       //menutobeselected.click();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         WebDriverWait wait = new WebDriverWait(driver, 60);
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(submenuselected.replace(submenu,SubMenu))))).click();

     }
     public void selectsector(String sector)
     {
         WebElement sectorselected=driver.findElement(By.xpath(String.format(sectors.replace(Sector,sector))));
         sectorselected.click();
     }
    public void selectgrant(String grant)
    {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement selectgrant= driver.findElement(By.xpath(grantbtn.replace(grantid,grant)));
        Actions a= new Actions(driver);
        a.moveToElement(selectgrant).click().perform();

    }

    public void selectmarketgrant(String marketgrant) throws InterruptedException {
        Actions a= new Actions(driver);
        WebElement market=driver.findElement(By.xpath(sectors.replace(Sector,marketgrant)));
        market.click();

       WebElement applybtn=driver.findElement(By.xpath("//button[text()='Apply']"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(applybtn));
      // a.moveToElement(applybtn).click().perform();
       applybtn.click();
    }

    public void applicationform(String q1, String q2, String q3, String q4, String q5)
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//h3[text()='Application Form']"));
       driver.findElement(By.xpath("//button[text()='Proceed']")).click();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.findElement(By.xpath("//h2[text()='Check Your Eligibility']"));
       answeredno(q1, q2, q3, q4, q5);
       answeredyes(q1, q2, q3, q4, q5);
       movetonewtab();
       save();

    }
    public void clicksave()
    {
        driver.findElement(By.xpath("//button[@id='save-btn']")).click();
        try{
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Draft saved')]")));
        }catch(Throwable e){
            System.err.println("Error while waiting for the notification to appear: "+ e.getMessage());
        }

        driver.navigate().refresh();
    }

    public void answeredno(String q1, String q2, String q3, String q4, String q5)
    {
       Actions a=new Actions(driver);
        WebElement Q1=driver.findElement(By.xpath(String.format(no.replace(nooption,q1))));
       a.moveToElement(Q1).click().perform();
        WebElement Q2=driver.findElement(By.xpath(String.format(no.replace(nooption,q2))));
        a.moveToElement(Q2).click().perform();
        WebElement Q3=driver.findElement(By.xpath(String.format(no.replace(nooption,q3))));
        a.moveToElement(Q3).click().perform();
        WebElement Q4=driver.findElement(By.xpath(String.format(no.replace(nooption,q4))));
        a.moveToElement(Q4).click().perform();
        WebElement Q5=driver.findElement(By.xpath(String.format(no.replace(nooption,q5))));
        a.moveToElement(Q5).click().perform();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='eligibility-advice']")).getText(),"The applicant may not meet the eligibility criteria for this grant. Visit FAQ page for more information on other government grants.");
    }
    public void answeredyes(String q1, String q2, String q3, String q4, String q5)
    {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions a=new Actions(driver);
        WebElement ques1=driver.findElement(By.xpath(String.format(yes.replace(yesoption,q1))));
        a.moveToElement(ques1).click().perform();
        WebElement ques2=driver.findElement(By.xpath(String.format(yes.replace(yesoption,q2))));
        a.moveToElement(ques2).click().perform();
        WebElement ques3=driver.findElement(By.xpath(String.format(yes.replace(yesoption,q3))));
        a.moveToElement(ques3).click().perform();
        WebElement ques4=driver.findElement(By.xpath(String.format(yes.replace(yesoption,q4))));
        a.moveToElement(ques4).click().perform();
        WebElement ques5=driver.findElement(By.xpath(String.format(yes.replace(yesoption,q5))));
        a.moveToElement(ques5).click().perform();

    }

    public void save()
    {
        WebElement yes=driver.findElement(By.xpath("//input[@value='true']"));
        yes.isSelected();
    }



    public void next()
    {
        driver.findElement(By.xpath("//button[text()='Next']")).click();
    }
    public void movetonewtab()
    {
        String handle=driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();
        Iterator<String>h= handles.iterator();;
        while (h.hasNext())
        {
            String newtab=h.next();
            driver.switchTo().window(newtab);

        }
        Assert.assertEquals("https://www.gov.sg/",driver.getCurrentUrl());
        driver.close();

        driver.switchTo().window(handle);
    }

    public void contactdetails()
    {
        driver.findElement(By.xpath("//h2[text()='Provide Your Contact Details']"));
    }
    public void invalidemail()
    {
      contactdetails();
      email.sendKeys("abc");
      altemail.sendKeys("");
      Assert.assertEquals(errmsg.getText(),"Oops, that doesn't seem like a valid email address");

    }

    public void blankfieldvalues()
    {
       for(int i=0;i<5;i++)
       {
           next();
       }
       driver.findElement(By.xpath("//button[text()='Review']")).click();
        try{
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'There are errors in your application.')]")));
        }catch(Throwable e){
            System.err.println("Error while waiting for the notification to appear: "+ e.getMessage());
        }
    }

    public void maincontact()
    {
        name.clear();
        jobtitle.clear();
        phone.clear();
        email.clear();
        altemail.clear();
        name.sendKeys("Sneha");
        jobtitle.sendKeys("Tester");
        phone.sendKeys("99999999");
        email.sendKeys("sneha@gmail.com");
        altemail.sendKeys("chai@gmail.com");
    }
    public void invalidcontactno()
    {
        contactdetails();
        phone.sendKeys("abc");
       email.sendKeys("");
       //To check phone number doesn't accept alphabets/less than 8 digits
        phone.sendKeys("12345");
        Assert.assertEquals(errmsg.getText(),"Oops, that’s not an 8-digit Singapore contact number");
    }

    public void invalidpostalcode()
    {
        postalcode.sendKeys("12345");
        driver.findElement(By.xpath("//span[@class='input-group-addon bgp-search-group-addon']")).click();
        Assert.assertEquals(errmsg.getText(),"Oops, that’s not a 6-digit Singapore postal code");
        postalcode.clear();
        postalcode.sendKeys("123456");
        driver.findElement(By.xpath("//span[@class='input-group-addon bgp-search-group-addon']")).click();
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      Assert.assertEquals(errmsg.getText(),"We can't find the postal code. Please try again.");

    }
    public void mailingaddress()
    {
        String Blkno = hseno.getAttribute("readonly");
        String Street = street.getAttribute("readonly");
        postalcode.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        postalcode.sendKeys(Keys.BACK_SPACE);
        //postalcode.clear();
        postalcode.sendKeys("650223");
       log.info("Blk No: "+hseno.getAttribute("value")+ "Street: "+street.getAttribute("value"));

       WebElement unitno=driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-unit']"));
       unitno.sendKeys("148");
       WebElement level=driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-level']"));
       level.sendKeys("4");

    }

    public void autofilladdress()
    {
        WebElement checkbox=driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-copied']"));
        checkbox.click();
        if(postalcode.getText()!="")
        {
            log.info("The details of logged in person: "+"Postal code: "+postalcode.getAttribute("value")+" "+"House no: "+hseno.getAttribute("value")+" "+"Street: "+street.getAttribute("value"));
        }
    }

    public void letterofoffer()
    {
        driver.findElement(By.xpath("//h3[text()='Letter Of Offer Addressee']"));
        lettername.sendKeys("Chai");
        offerjobtitle.sendKeys("Manager");
        offeremail.sendKeys("chai@yahoo.com");
    }
    public void selectsamemaincontact()
    {
        driver.findElement(By.xpath("//input[@id='react-contact_info-copied']")).click();
        Assert.assertEquals(lettername.getAttribute("value"),name.getAttribute("value"));
        Assert.assertEquals(offerjobtitle.getAttribute("value"),jobtitle.getAttribute("value"));
        Assert.assertEquals(offeremail.getAttribute("value"),email.getAttribute("value"));

    }

    public void proposal() throws AWTException {
        Actions a= new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        projecttitle.sendKeys("");
        projecttitle.sendKeys("Grant");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Robot rbt= new Robot();

        startdate.sendKeys("04 Aug 2020");
        Assert.assertEquals(errmsg.getText(),"Must be today or later");

        startdate.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        startdate.sendKeys(Keys.BACK_SPACE);
      //  startdate.sendKeys(Keys.DELETE);
        startdate.sendKeys("01 Sep 2020");
        //End date in before start date
        enddate.sendKeys("30 Aug 2020");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Assert.assertEquals(errmsg.getText(),"The end date should be later than the start date");
        enddate.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        enddate.sendKeys(Keys.BACK_SPACE);
        enddate.sendKeys("10 Sep 2020");
        Assert.assertEquals("1 month",Projduration.getText());
           driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        description.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vestibulum tempus diam ac accumsan. In cursus rutrum lectus vitae bibendum. Maecenas gravida ipsum felis, sed rhoncus nunc condimentum quis. Phasellus non sem lacus. Etiam non purus vitae libero fringilla condimentum eget at sapien. Aliquam erat volutpat. Phasellus nibh sem, fermentum vitae tellus id, imperdiet molestie libero.Fusce iaculis porta neque, ut tincidunt magna fermentum at. Donec et rutrum tellus. Curabitur venenatis mauris id bibendum posuere. Praesent sollicitudin tristique odio id lacinia. Aliquam tellus neque, congue pulvinar ante ac, elementum ullamcorper eros. Nunc ultrices lorem vel scelerisque facilisis. Nulla in odio in lacus dignissim luctus non quis arcu.Sed non bibendum ligula. Proin in magna sed lacus facilisis accumsan quis id orci. Nam mattis dui eu purus fermentum, in posuere metus iaculis. Donec enim sem, volutpat id mi a, malesuada tristique dolor. In molestie orci augue, a lacinia erat tristique et. Vivamus scelerisque pulvinar massa sit amet laoreet. Donec lorem odio, consequat eu mollis at, finibus sit amet mauris. In ultrices leo molestie diam egestas, in sagittis purus posuere.Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Duis aliquam odio eget ultrices venenatis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras at purus est. Nullam blandit pharetra felis, fermentum vehicula mauris vehicula eget. Proin at augue justo. Etiam et odio et odio elementum rutrum.Duis nec lorem justo. In sit amet diam nisi. Praesent sed massa egestas mi lacinia consequat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Phasellus tincidunt volutpat aliquet. Donec volutpat pulvinar massa, cursus ullamcorper turpis feugiat vel. Suspendisse ut tempor ex. Etiam sapien tellus, efficitur sed placerat nec, pharetra vel leo.Praesent semper sed tortor sed feugiat. Praesent metus leo, feugiat sed pharetra maximus, mollis id massa. Quisque malesuada augue nisl, non ultricies urna gravida eget. Aliquam erat volutpat. Pellentesque nec orci in velit tempus venenatis. Donec tellus diam, pellentesque a lobortis non, placerat sed risus. Phasellus scelerisque lacinia augue in mattis. Praesent pretium posuere leo ut tincidunt. In hac habitasse platea dictumst. Phasellus id justo iaculis, pulvinar orci quis, dictum ipsum. Fusce interdum consequat nisi, et tincidunt mauris vulputate ut. Cras sed pulvinar magna. Cras dictum molestie ipsum et faucibus. Vestibulum aliquet sem ac vestibulum imperdiet. Vivamus elementum auctor nunc, vel tincidunt nunc vestibulum at.Donec dapibus in elit a pretium. Nulla in eleifend ex, quis varius sapien. Mauris sodales nisi luctus aliquet gravida. Fusce nec metus rhoncus, consectetur est vulputate, blandit nibh. Integer auctor consectetur feugiat. Nulla orci mauris, aliquam a erat ut, aliquet feugiat ligula. Vestibulum cursus pharetra urna vitae feugiat. Nulla lacus diam, rhoncus vel posuere nec, tincidunt interdum elit. Donec ornare mi id vestibulum tincidunt. Aenean nec tempus risus, quis luctus enim.Pellentesque purus turpis, congue aliquam gravida at, ullamcorper fringilla velit. Morbi sit amet ipsum sed nibh ullamcorper mattis at venenatis enim. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed eget tempor arcu. Suspendisse quis auctor lacus. Proin massa lectus, cursus vitae diam quis, tempus scelerisque orci. Vivamus ut velit viverra, euismod sem sed, rhoncus risus. Duis vel ante vel augue hendrerit lacinia. Donec ipsum nulla, malesuada mattis commodo ac, tristique eget tellus.Interdum et malesuada fames ac ante ipsum primis in faucibus. Integer sed metus quis elit bibendum convallis. Nullam ut consectetur elit. Maecenas faucibus eu felis vel accumsan. Praesent sollicitudin convallis augue, in dignissim libero tincidunt ac. Etiam feugiat orci ut neque pulvinar efficitur. Donec ac placerat....");
        a.moveToElement(activity).click().perform();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
       // Assert.assertEquals(driver.findElement(By.xpath("//p[@id='react-project-description-alert']")).getText(),"Your entry shouldn't be more than 4000 characters");
        description.clear();
        description.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vestibulum tempus diam ac accumsan. In cursus rutrum lectus vitae bibendum. Maecenas gravida ipsum felis, sed rhoncus nunc condimentum quis. Phasellus non sem lacus. Etiam non purus vitae libero fringilla condimentum eget at sapien. Aliquam erat volutpat. Phasellus nibh sem, fermentum vitae tellus id, imperdiet molestie libero.Fusce iaculis porta neque, ut tincidunt magna fermentum at. Donec et rutrum tellus. Curabitur venenatis mauris id bibendum posuere. Praesent sollicitudin tristique odio id lacinia. Aliquam tellus neque, congue pulvinar ante ac, elementum ullamcorper eros. Nunc ultrices lorem vel scelerisque facilisis. Nulla in odio in lacus dignissim luctus non quis arcu.Sed non bibendum ligula. Proin in magna sed lacus facilisis accumsan quis id orci. Nam mattis dui eu purus fermentum, in posuere metus iaculis. Donec enim sem, volutpat id mi a, malesuada tristique dolor. In molestie orci augue, a lacinia erat tristique et. Vivamus scelerisque pulvinar massa sit amet laoreet. Donec lorem odio, consequat eu mollis at, finibus sit amet mauris. In ultrices leo molestie diam egestas, in sagittis purus posuere.Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Duis aliquam odio eget ultrices venenatis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras at purus est. Nullam blandit pharetra felis, fermentum vehicula mauris vehicula eget. Proin at augue justo. Etiam et odio et odio elementum rutrum.Duis nec lorem justo. In sit amet diam nisi. Praesent sed massa egestas mi lacinia consequat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Phasellus tincidunt volutpat aliquet. Donec volutpat pulvinar massa, cursus ullamcorper turpis feugiat vel. Suspendisse ut tempor ex. Etiam sapien tellus, efficitur sed placerat nec, pharetra vel leo.Praesent semper sed tortor sed feugiat. Praesent metus leo, feugiat sed pharetra maximus, mollis id massa. Quisque malesuada augue nisl, non ultricies urna gravida eget. Aliquam erat volutpat. Pellentesque nec orci in velit tempus venenatis. Donec tellus diam, pellentesque a lobortis non, placerat sed risus. Phasellus scelerisque lacinia augue in mattis. Praesent pretium posuere leo ut tincidunt. In hac habitasse platea dictumst. Phasellus id justo iaculis, pulvinar orci quis, dictum ipsum. Fusce interdum consequat nisi, et tincidunt mauris vulputate ut. Cras sed pulvinar magna. Cras dictum molestie ipsum et faucibus. Vestibulum aliquet sem ac vestibulum imperdiet. Vivamus elementum auctor nunc, vel tincidunt nunc vestibulum at.Donec dapibus in elit a pretium. Nulla in eleifend ex, quis varius sapien. Mauris sodales nisi luctus aliquet gravida. Fusce nec metus rhoncus, consectetur est vulputate, blandit nibh. Integer auctor consectetur feugiat. Nulla orci mauris, aliquam a erat ut, aliquet feugiat ligula. Vestibulum cursus pharetra urna vitae feugiat. Nulla lacus diam, rhoncus vel posuere nec, tincidunt interdum elit. Donec ornare mi id vestibulum tincidunt. Aenean nec tempus risus, quis luctus enim.Pellentesque purus turpis, congue aliquam gravida at, ullamcorper fringilla velit. Morbi sit amet ipsum sed nibh ullamcorper mattis at venenatis enim. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed eget tempor arcu. Suspendisse quis auctor lacus. Proin massa lectus, cursus vitae diam quis, tempus scelerisque orci. Vivamus ut velit viverra, euismod sem sed, rhoncus risus. Duis vel ante vel augue hendrerit lacinia. Donec ipsum nulla, malesuada mattis commodo ac, tristique eget tellus.Interdum et malesuada fames ac ante ipsum primis in faucibus. Integer sed metus quis elit bibendum convallis. Nullam ut consectetur elit. Maecenas faucibus eu felis vel accumsan. Praesent sollicitudin convallis augue, in dignissim libero tincidunt ac. Etiam feugiat orci ut neque pulvinar efficitur. Donec ac placerat.");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   a.moveToElement(activity).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void businessimpact()
    {
       fyienddate.sendKeys("01 Jul 2020");
       driver.findElement(By.xpath("//th[text()='Projections for next three years']"));
       Assert.assertEquals("01 Jul 2021",driver.findElement(By.xpath("//*[@id=\"js-app\"]//div[4]/table/tbody/tr[1]/td[3]")).getText());
        Assert.assertEquals("01 Jul 2022",driver.findElement(By.xpath("//*[@id=\"js-app\"]//div[4]/table/tbody/tr[1]/td[4]")).getText());
        Assert.assertEquals("01 Jul 2023",driver.findElement(By.xpath("//*[@id=\"js-app\"]//div[4]/table/tbody/tr[1]/td[5]")).getText());
        driver.findElement(By.xpath("//*[contains(@id,\"react-project_impact-overseas_sales_0\" )and @type='text']")).sendKeys("12");
        driver.findElement(By.xpath("//*[contains(@id,\"react-project_impact-overseas_investments_0\" )and @type='text']")).sendKeys("12");
     driver.findElement(By.xpath("//*[contains(@id,\"react-project_impact-overseas_sales_1\" )and @type='text']")).sendKeys("12");
        driver.findElement(By.xpath("//*[contains(@id,\"react-project_impact-overseas_investments_1\" )and @type='text']")).sendKeys("12");
        driver.findElement(By.xpath("//*[contains(@id,\"react-project_impact-overseas_sales_2\" )and @type='text']")).sendKeys("12");
        driver.findElement(By.xpath("//*[contains(@id,\"react-project_impact-overseas_investments_2\" )and @type='text']")).sendKeys("12");
        driver.findElement(By.xpath("//*[contains(@id,\"react-project_impact-overseas_sales_3\" )and @type='text']")).sendKeys("12");
        driver.findElement(By.xpath("//*[contains(@id,\"react-project_impact-overseas_investments_3\" )and @type='text']")).sendKeys("12");
        WebElement rationale=driver.findElement(By.xpath("//textarea[@id='react-project_impact-rationale_remarks']"));
        rationale.sendKeys("Testing");
        WebElement benefits=driver.findElement(By.xpath("//textarea[@id='react-project_impact-benefits_remarks']"));
        benefits.sendKeys("Testing");
    }

    public void cost() throws AWTException {
        WebElement officespacerental= driver.findElement(By.xpath("//*[@id=\"react-project_cost-office_rentals-accordion-header\"]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", officespacerental);

        //WebDriverWait wait= new WebDriverWait(driver,10);
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='react-project_cost-office_rentals-add-item']")));
     WebElement addnewitembtn=driver.findElement(By.xpath("//*[@id=\"react-project_cost-office_rentals-add-item\"]"));
    executor.executeScript("arguments[0].click();", addnewitembtn);

    // Actions a= new Actions(driver);
     //a.moveToElement(addnewitembtn).click().perform();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement descriptionforrental= driver.findElement(By.xpath("//textarea[@id='react-project_cost-office_rentals-0-description']"));
        descriptionforrental.sendKeys("Testing");
        WebElement rentalduration= driver.findElement(By.xpath("//input[@id='react-project_cost-office_rentals-0-rental_duration']"));
        rentalduration.sendKeys("0");
        WebElement monthlyrental=driver.findElement(By.xpath("//input[@id='react-project_cost-office_rentals-0-amount_in_billing_currency']"));
        monthlyrental.sendKeys("");
        Assert.assertEquals(errmsg.getText(),"This number should be more than 0");
        rentalduration.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        rentalduration.sendKeys(Keys.BACK_SPACE);
        rentalduration.sendKeys("1");
        monthlyrental.sendKeys("0");
        driver.findElement(By.xpath("//div[@class='bgp-readonly']")).click();
        Assert.assertEquals(errmsg.getText(),"This number should be more than 0");
        monthlyrental.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        monthlyrental.sendKeys(Keys.BACK_SPACE);
        monthlyrental.sendKeys("");
        monthlyrental.sendKeys("5000");
      driver.findElement(By.xpath("//*[@id='react-project_cost-office_rentals-0']/div/div/div[6]/div[1]/label")).click();
       // uploaddoc();

    }
public void verifynooferrors()
{
    driver.findElement(By.xpath("//h2[text()='Provide Details of Costs']"));
    next();
    //Validating errors
   List<WebElement> errors= driver.findElements(By.xpath("//span[@class='label label-error']"));
   int nooferrors=errors.size();
   log.info("Total errors in form: "+nooferrors);
   /*if(nooferrors==0)
   {

   }*/

}
public void declarereview()
{
    driver.findElement(By.xpath("//h2[text()='Declare & Acknowledge Terms']"));
    Actions a= new Actions(driver);
    WebElement jurisdiction= driver.findElement(By.xpath("//input[@id='react-declaration-criminal_liability_check-false']//following-sibling::span[1]"));
    jurisdiction.click();
    WebElement civilsuit=driver.findElement(By.xpath("//input[@id='react-declaration-civil_proceeding_check-false']//following-sibling::span[1]"));
   civilsuit.click();
    WebElement bankruptcy= driver.findElement(By.xpath("//input[@id='react-declaration-insolvency_proceeding_check-false']//following-sibling::span[1]"));
   bankruptcy.click();
    WebElement incentives= driver.findElement(By.xpath("//input[@id='react-declaration-project_incentives_check-false']//following-sibling::span[1]"));
    incentives.click();
    WebElement otherincentives= driver.findElement(By.xpath("//input[@id='react-declaration-other_incentives_check-false']//following-sibling::span[1]"));
   otherincentives.click();
    WebElement projectcommencecheck= driver.findElement(By.xpath("//input[@id='react-declaration-project_commence_check-false']//following-sibling::span[1]"));
    projectcommencecheck.click();
    WebElement ques7=driver.findElement(By.xpath("//input[@id='react-declaration-related_party_check-false']//following-sibling::span[1]"));
   ques7.click();
    WebElement ques8= driver.findElement(By.xpath("//input[@id='react-declaration-covid_safe_check-false']//following-sibling::span[1]"));
    ques8.click();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='js-app']//div[1]/ol/h1")).getText(),"You must comply with all applicable SDMs to be eligible for this grant.");

}
public void review()
{
    WebElement yesoptionques8= driver.findElement(By.xpath("//input[@id='react-declaration-covid_safe_check-true']//following-sibling::span[1]"));
    yesoptionques8.click();
    WebElement ques9= driver.findElement(By.xpath("//input[@id='react-declaration-covid_safe_ques_check-true']//following-sibling::span[1]"));
    ques9.click();
    WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
    checkbox.click();
    reviewbtn.click();
}

public void verifyerrors()
{
    Actions a= new Actions(driver);
    WebElement errsidebar= driver.findElement(By.xpath("//span[@class='label label-error']"));
    log.info("No of errors: "+errsidebar.getText());
 driver.findElement(By.xpath("//h2[text()='Submit Your Proposal']"));

    WebElement yes=driver.findElement(By.xpath("//*[@id='js-app']//div[2]/label[1]/span[1]"));
    a.moveToElement(yes).click().perform();
    Actions actions = new Actions(driver);
    actions.moveToElement(activity).click().perform();

    actions.sendKeys(Keys.DOWN).build().perform();
    actions.sendKeys(Keys.ENTER).build().perform();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
entity.sendKeys("");

 // a.moveToElement(activity).click().sendKeys("Market Entry");
   entity.sendKeys("asdfghjklqwertyuiopzxcvbnm");
    Assert.assertEquals("asdfghjklqwertyuiopz",entity.getAttribute("value"));
    //Validating % between 0-100
    percentage.sendKeys("123");
  driver.findElement(By.xpath("//label[@id='react-project-primary_market-label']")).click();
    Assert.assertEquals(driver.findElement(By.xpath("//p[@id='react-project-shareholding_percentage-alert']")).getText(),"Your percentage should fall between 0 and 100");

  actions.moveToElement(targetmarket).click().perform();
    actions.sendKeys(Keys.DOWN).build().perform();
    actions.sendKeys(Keys.ENTER).build().perform();
    //percentage.sendKeys("");
    //percentage.sendKeys("12");

    actions.moveToElement(percentage).click().perform();
    actions.sendKeys("12");


clicksave();

    //Navigate back to Declare & Review
    driver.findElement(By.xpath("//span[text()='Declare & Review']")).click();
    reviewbtn.click();

}
public void reviewsubmission()
{
  driver.findElement(By.xpath("//h3[text()='Review Your Application']"));
  String eligibility=driver.findElement(By.xpath("//*[@id='react-eligibility-sg_registered_check']")).getAttribute("value");
  Assert.assertEquals(eligibility,"Yes");
  String nameonreview=driver.findElement(By.xpath("//div[@id='react-contact_info-name']")).getText();
  Assert.assertEquals(nameonreview,"Sneha");
  String proposalstartdate= driver.findElement(By.xpath("//div[@id='react-project-start_date']")).getText();
  Assert.assertEquals(proposalstartdate,"29 Aug 2020");
  WebElement declaration=driver.findElement(By.xpath("//input[@id='react-declaration-info_truthfulness_check']"));
  declaration.click();
  driver.findElement(By.xpath("//button[@id='submit-btn']")).click();
  driver.findElement(By.xpath("//h3[text()='Your application has been submitted.']"));
  WebElement refid=driver.findElement(By.xpath("//*[@id='js-app']//div[1]/section/div[2]/div[2]/table/tbody/tr[1]/td[2]"));
  log.info("Your ref id: "+refid.getAttribute("value"));
  String referenceid= refid.getAttribute("value");
  WebElement agencydetails= driver.findElement(By.xpath("//td[text()='Agency Details:']//following-sibling::td/span[1]"));
  Assert.assertEquals(agencydetails.getText(), "Enterprise Singapore");
 driver.findElement(By.xpath("//a[text()='My Grants']")).click();
 driver.findElement(By.xpath("//a[@href='#processing']")).click();
 if(driver.getPageSource().contains(referenceid))
 {
     log.info("Test Passed");
 }
 else
 {
     log.info("Ref id not found");
 }
}
}









