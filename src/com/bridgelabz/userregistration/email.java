package com.bridgelabz.userregistration;

import java.util.regex.*;
import java.util.Scanner;
public class email {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		System.out.println(isValidEmail(email));

	}

	private static boolean isValidEmail(String email) {
		
		return email.matches("^([A-Za-z]{3,})[0-9a-zA-Z]+(@)+[a-z0-9]+(.)+[a-z]{2,}$");
	}
	
	

}
