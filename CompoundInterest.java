package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("The principal amount is:");
		double p= sc.nextDouble();
		System.out.print("The rate of interest in % is:");
		double r =sc.nextDouble();
		System.out.println("Time taken:");
		double t=sc.nextDouble();
		double Amount= p*Math.pow(1+ r/100, t);
		double compoundinterest =Amount-p;
		System.out.println("compound interest is :" + compoundinterest);
		System.out.println("Total amount is:" + Amount);
		sc.close();
		
	}

}
