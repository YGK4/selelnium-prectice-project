package com.locators;

public interface RegistrationLocator {
	
	 String RegisterButton = "//a[normalize-space()='Register']";
	public static String LoginButton = "//a[normalize-space()='Log in']";
	public static String Shoppingcart = "//span[normalize-space()='Shopping cart']";
	public static String Wishlist = "//span[normalize-space()='Wishlist']";
	public static String Searchstore = "//input[@id='small-searchterms']";
	public static String Searchbutton = "//input[@value='Search']";
	public static String Computers = "//a[@class='hover']";
	public static String Electronics = "//a[@class='hover']";
	public static String Male = "//input[@id='gender-male']";
	public static String Female = "//input[@id='gender-female']";
	public static String FirstName = "//input[@id='FirstName']";
	public static String Lastname = "//input[@id='LastName']";
	public static String Email = "//input[@id='Email']";
	public static String Password = "//input[@id='Password']";
	public static String ConfirmPassword = "//input[@id='ConfirmPassword']";
	public static String Register = "//input[@id='register-button']";
	public static String Logout = "//a[normalize-space()='Log out']";
	public static String Login = "//input[@value='Log in']";
	public static String Username = "//input[@id='Email']";
	public static String Forgotpassword = "//a[normalize-space()='Forgot password?']";
	
	String RegistrationSuccess = "result";
	String EmailalreadyPresent ="validation-summary-errors";

}
