package examen;

public class Ejercicio4 {

	public static void main(String[] args) {
//		(2.5 points) Write three methods that do the same action that is, calculate the maximum of all the elements of an
//		array. You have to overload the method, so that it has the same name (calculateMaximum) but different parameters:
//			(en uno el parametro será de []int, el otro de []double y el otro de [][]int
		
		int ArrayInt [] = {23, 4, 59, 32, 105, 14, 104}; //array int creation
		double ArrayDouble [] = {32.4, 3.14, 55.007, 34.43, 104.999,  14, 104.998}; //array double creation
		int ArrayInt2D [][] = {{3 ,4 ,6 ,1},{6, 1, 2, 2},{5, 11, 2, 9}}; //array 2D int creation
		MaxNum(ArrayInt); //array int call
		MaxNum(ArrayDouble); //array double call. All of 3 methods have the same name but different parameters to send
		MaxNum(ArrayInt2D); //array int 2D call. That's why it works!
	}
	public static void MaxNum (int ArrayInt[]) {
		int maximum=0;
		for (int i=0;i<ArrayInt.length;i++) {
			if (ArrayInt[i]>maximum) {
				maximum=ArrayInt[i];
			}
		}
		System.out.println("Maximum number of ArrayInt []: "+maximum);
	}
	public static void MaxNum (double ArrayDouble[]) {
		double maximum=0;
		for (int i=0;i<ArrayDouble.length;i++) {
			if (ArrayDouble[i]>maximum) {
				maximum=ArrayDouble[i];
			}
		}
		System.out.println("Maximum number of ArrayDouble []: "+maximum);
	}
	public static void MaxNum (int ArrayInt2D[][]) {
		int maximum=0;
		for (int i=0;i<ArrayInt2D.length;i++) {
			for (int j=0;j<ArrayInt2D[i].length;j++) {
				if (ArrayInt2D[i][j]>maximum) {
					maximum=ArrayInt2D[i][j];
				}
			}
		}
		System.out.println("Maximum number of ArrayInt2D []: "+maximum);
	}

}
