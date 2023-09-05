package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Rectangle total = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		total.height = sc.nextDouble();
		total.width = sc.nextDouble();

		System.out.printf("Area = %.2f%n", total.Area());
		System.out.printf("Perimeter = %.2f%n", total.Perimeter());
		System.out.printf("Diagonal = %.2f%n", total.Diagonal());

		sc.close();
	}

}
