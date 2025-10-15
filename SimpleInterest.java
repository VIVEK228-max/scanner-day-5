package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The principal amount is:");
		double p =sc.nextDouble();
		System.out.println("The rate of interest in %is :");
		double r =sc.nextDouble();
		System.out.println("Timetaken");
		double t =sc.nextDouble();
		double simpleInterest =(p * r * t) / 100;
		double amount = simpleInterest + p;
		System.out.println("simple Interest:"+simpleInterest);
		System.out.println("Total amount is: +amount");
		sc.close();
	}

}
