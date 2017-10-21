package Mamn11Q1;

import java.util.Scanner;
//First Q
public class UseRationalClass {

	public static void main(String[] args) {
		double b;
		double d;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the first Numerator");
		int a = (int) scan.nextInt();

		do {
			System.out.println("Please Enter the first Denominator(Positive Only)");
			// scan.next();
			b = scan.nextDouble();
		} while (b <= 0);

		System.out.println("Please Enter the Second Numerator");
		int c = scan.nextInt();

		do {
			System.out.println("Please Enter the Second Denominator(Positive Only)");
			// scan.next();
			d = scan.nextDouble();
		} while (d <= 0);

		Rational First = new Rational(a, b);
		Rational Second = new Rational(c, d);
		Rational Third = First.multiply(Second);
		System.out.println(First + "*" + Second + " = " + Third.reduce(Third));

	}

}
