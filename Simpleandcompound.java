package com.codegnan.fundamentals;

import java.util.Scanner;

public class Simpleandcompound {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("The principle amount is:");
		double p=sc.nextDouble();
		System.out.println("The rate id interest in % is: ");
		double r=sc.nextDouble();
		System.out.println("time taken in months:");
		double t=sc.nextDouble();
		double t1=t/12;
		double simpleInterest = (p * r * t1 )/100;
		double simpleamount=simpleInterest+p;
		double Amount= p*Math.pow(1+ r/100,t1);
		double compoundinterest = Amount-p;
		System.out.println("Time in Years:"+t1);
		System.out.println("simple Imterest is " +simpleInterest);
		System.out.println("Total amount with simpleInterest is:" +simpleamount);
		System.out.println("compound Interest is " +compoundinterest);
		System.out.println("Total amount with compound interest is:"+Amount);
		sc.close();
		     // TODO Auto-generated method stub
		

	}

}
