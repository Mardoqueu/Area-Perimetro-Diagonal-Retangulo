package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		x = new Rectangle();

		
		System.out.println("Enter the measures of Rectangle: ");
		x.h = sc.nextDouble();
		x.b = sc.nextDouble();
		
		double areaX = x.area();
		double perimetroX = x.perimetro();
		
		System.out.printf("Rectangle area: %.4f%n", areaX);
		System.out.printf("Rectangle perimeter: %.4f%n", perimetroX);
		
		sc.close();
		

	}

}
