package algorithm;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your number: ");
		double number = input.nextInt();

		double squareRoot = getSquareRoot(number);
		System.out.println("Square Root is: " + squareRoot);

		input.close();
	}

	static double getSquareRoot(double number) {
		
		double squareRoot = number / 2;
		int count = 0;

		while (Math.round(squareRoot * squareRoot - number) > 0.01) {
			squareRoot = (number / squareRoot + squareRoot) / 2.00;
			count++;
		}
		
		System.out.println(count);
		return squareRoot;
	}
}
