package KiteTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import POM_classes.Pom1;
import POM_classes.Pom2;
import POM_classes.Pom3;
import Utility.UtilityClass;

public class TestClass extends BaseClass {
	//declare all useful members as global
	Pom1 Login1;
	Pom2 Login2;
	Pom3 Home;
	
	@BeforeClass
	public void openBrowser()throws
	Throwable{
		initializeBrowswer();
		
		//all objects of POM class
		Login1=new Pom1(driver);
		Login2=new Pom2(driver);
		Home=new Pom3(driver);
		
	}
       @BeforeMethod
       public void loginToApp()throws
       Throwable{
    	   
    	   //enter UN
    	   Login1.enterUN(UtilityClass.getTD(0, 0));  //DPG458
    	   System.out.println((UtilityClass.getTD(0, 0)));
    	   
    	   //enter pwd
    	   Login1.enterPWD(UtilityClass.getTD(0, 1));
    	   
    	   //click on login btn
    	   Login1.clickLOGINBTN();
    	   
    	   //enter pin
    	   Login2.enterPIN(UtilityClass.getTD(0, 2));
    	   //click on continue btn
    	   Login2.clickCNTBTN();
       }
       @Test
       public void verifyuserID()throws
       Throwable{
    	   Reporter.log("running verify user id",true);
    	   String actID=Home.verifyuserID();
    	   String expID=UtilityClass.getTD(0, 0);
    	   
    	   Assert.assertEquals(expID, actID,"both are diff,tc is failed");
       }
       
       @AfterMethod
       public void logoutApp() {
    	   Reporter.log("logout the application",true);
       }
       @AfterClass
       public void closeBrowser(){
    	   Reporter.log("close the app",true);
    	   
	
		
	}

}
