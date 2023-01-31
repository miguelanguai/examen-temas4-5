package examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
//		(1.5 points) Create a method that receives the radius and calculates and returns the area of a circle (both values
//		have to be decimal). Write a main method with a correct call to this method.
		
		Scanner read = new Scanner (System.in);
		System.out.println("Write the radius of your circle (in cm)");
		double radius = read.nextDouble();read.nextLine();
		
		System.out.println("Area of your circle= "+area(radius)+" cm².");
		
	}
	
	public static double area (double radius) {
		
		double res = Math.PI*Math.pow(radius, 2);
		
		return res;
	}

}
