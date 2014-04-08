package com.ibm.fancyclock;

public class App
{
       /**This is used to get the current date
	   */
	   	   
	   public static String now(){
           try{
			  System.out.println("Hi this is try block");
       }
	   catch(Exception e)
	   {
	   }
	   	   return new java.util.Date().toString();
	   }
 }
