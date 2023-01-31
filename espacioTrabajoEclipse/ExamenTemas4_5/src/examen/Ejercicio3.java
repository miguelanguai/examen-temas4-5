package examen;

public class Ejercicio3 {

	public static void main(String[] args) {
		//		(2 points) Write a method in Java that receives and fills an array with the squares of the 10 first natural numbers. 
		//		(del 1 al 10 al cuadrado)

		int []empty = new int [10]; //creation of an empty array that I send to fillArray method

		fillArray(empty);
	}
	
	public static void fillArray (int []empty) {
		
		for (int i=0,j=1; i<empty.length;i++,j++) {
			empty[i]=(int) Math.pow(j,2); //filling of the Array
		}
		System.out.println("The array of squares of the 10 first natural numbers is this one: ");
		for (int i=0;i<empty.length;i++) {
			System.out.print(empty[i]+"\t"); //printing of the array
		}
		
	}

}
