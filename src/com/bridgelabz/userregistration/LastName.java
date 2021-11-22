package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.*;
public class LastName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(firstName(name));
		System.out.println(lastName(name));

	}

	private static boolean firstName(String firstName) {
		
		return firstName.matches("^([A-Z]{1}+[a-z]{3,})*$");
	}

	private static boolean lastName(String lastName) {
		
		return lastName.matches("^([A-Z]{1}+[a-z]{3,})*$");
	}

}
