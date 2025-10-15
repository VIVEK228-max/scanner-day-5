package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentDetail {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Name: " );
		String name=sc.next();
		System.out.print("Enter RollNo: " );
		int n=sc.nextInt();
		System.out.println(" Enter Age:");
		int age=sc.nextInt();
		System.out.println("Enter Grade: ");
		String grade=sc.next();
		System.out.println("=====Student details===== ");
		System.out.println("Name  : " +name);
		System.out.println("RollNo: " +n);
		System.out.println("Age   : " +age);
		System.out.println("Grade : " +grade);
		sc.close();
	}

}
