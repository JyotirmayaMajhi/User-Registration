package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;
public class phoneNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String phoneNumber = sc.nextLine();
		System.out.println(isValidPhoneNumber(phoneNumber));

	}

	private static boolean isValidPhoneNumber(String phoneNumber) {
		
		return phoneNumber.matches("^([0-9]{1,2})\\s([0-9]{10})$");
	}

}
