package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.*;
public class FirstName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(firstName(name));
		
	}

	private static boolean firstName(String firstName) {
		
		return firstName.matches("^([A-Z]{1}+[a-z]{3,})*$");
	}

}
