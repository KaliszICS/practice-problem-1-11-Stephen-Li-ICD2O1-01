/*
File: Lesson 1.11 - Math
Author: Stephen Li
Date Created: Mar 3, 2026
Date Last Modified: Mar 3, 2026
*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		System.out.println(Math.abs(num1));
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		System.out.print("Input another number: ");
		double num2 = input.nextDouble();
		num1 = num1 / num2;
		System.out.println(Math.floor(num1));
		System.out.println(Math.ceil(num1));
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		System.out.println(Math.round(Math.sqrt(num1)));
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		System.out.print("Input another number: ");
		double num2 = input.nextDouble();
		System.out.println(Math.pow(num1, num2));
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		System.out.print("Input another number: ");
		double num2 = input.nextDouble();
		System.out.print("Input one more number: ");
		double num3 = input.nextDouble();
		System.out.println(Math.max(Math.max(num1, num2), num3));
		System.out.println(Math.min(Math.min(num1, num2), num3));
	}

}
