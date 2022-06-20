package com.lab.oops.service;

import java.util.Random;

import com.lab.oops.pojo.Employee;

public class CredentialService {
	
	private static String generateEmailAddress(Employee emp) {
		StringBuilder sb = new StringBuilder();
		sb.append(emp.getFirstName().toLowerCase());
		sb.append(emp.getLastName().toLowerCase());
		sb.append("@");
		sb.append(emp.getDepartment().toLowerCase());
		sb.append(".");
		sb.append("greatlearning.com");
		return sb.toString();
	}
	
	private static String generatePassword() {
	  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
      Random random = new Random();
      char[] password = new char[8];

      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      password[3] = numbers.charAt(random.nextInt(numbers.length()));
   
      for(int i = 4; i< 8; i++) {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }
      return password.toString();
	}
	
	public static void getCredentials(String firstName, String lastName, int deptCode) {
		Employee emp = new Employee(firstName, lastName, deptCode);
		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email ---> "+generateEmailAddress(emp));
		System.out.println("Password ---> "+generatePassword());
	}
}
