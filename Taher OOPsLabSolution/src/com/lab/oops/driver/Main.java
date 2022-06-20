package com.lab.oops.driver;

import java.util.Scanner;

import com.lab.oops.service.*;

public class Main {
	
	public static void main(String[] args) {
		
		String firstName, lastName, department;
		int deptCode;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first name of employee");
		firstName = sc.next();
		System.out.println("Please enter the last name of employee");
		lastName = sc.next();
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		deptCode = sc.nextInt();
		
		CredentialService.getCredentials(firstName, lastName, deptCode);
	
	}
	
}
