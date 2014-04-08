package com.ibm.fancyclock;
 import junit.framework.Test;
 import junit.framework.TestCase;
 import junit.framework.TestSuite;
 import com.ibm.fancyclock.App;
 
 public class AppTest extends TestCase
 {
       
	   
	   public void testApp()  
       {
           assertTrue( App.now().length() > 0 );
		   try{
		   System.out.println("Hi this is empty try block");
		   }
		   catch(Exception e)
		   {
		}
		finally
		{
		}
       }
	   public void myMethod()
	   {
	   }
	   
}