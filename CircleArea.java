package com.codegnan.fundamentals;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of circle is:");
    double rad=sc.nextDouble();
    double area =3.14*rad*rad;
    System.out.printf("The area of the circle is: %.2f",area);
    sc.close();
	}

}
