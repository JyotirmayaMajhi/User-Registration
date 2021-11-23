package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;
public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Password = sc.nextLine();
		System.out.println(isValidPassword(Password));

	}

	private static boolean isValidPassword(String password) {
		
		return password.matches("^[a-zA-Z]{8,}$");
	}

}
