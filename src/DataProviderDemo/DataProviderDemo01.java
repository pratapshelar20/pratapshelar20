package DataProviderDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo01 {
	  @DataProvider(name="TestData" )
	    public Object[][] getData1(){
	    	Object[][] data = new Object[1][2];//1-row,2-column
	    	
	    	data[0][0]="user1";
	    	data[0][1]="password1";
	    	
//	    	data[1][0]="user2";
//	    	data[1][1]="password2";
//	    	
//	    	data[2][0]="user3";
//	    	data[2][1]="password3";
	    	
			return data;
	    	
	    }
	    @Test
	    (dataProvider= "TestData")
	    public void login(String username,String password) 
	    {
	    	

			
			System.out.println("Username is : " +username);//user1
			System.out.println("Password is : " +password);//password1
			
//			System.out.println("Username is : " +username);//user1
//			System.out.println("Password is : " +password);//password1
//			
//			System.out.println("Username is : " +username);//user1
//			System.out.println("Password is : " +password);//password1

	    }
}
