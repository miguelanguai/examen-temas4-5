package examen;

public class Ejercicio5 {

	public static void main(String[] args) {
//		(2.5 points) Write a method that receives two bidimensional arrays, one of int type and the other one of boolean
//		type. The first matrix represents all the numbers of a bingo card and the other one if the number of the same position
//		is already said or not. Both arrays have the same dimensions.
//		The method receives these two bidimensional arrays and displays on the screen the numbers that are not said yet and
//		how many they are
		int bingoCard [][] = 	{{4,23,41,62},
								{ 7,26,44,70},
								{ 9,32,48,73},
								{10,35,53,75}};
		
		boolean mask [][] =	{{true, false, false, true},
							{true, true, false, true},
							{false, true, false, true},
							{true, false, true, false}};
		NumberChecker(bingoCard, mask);
	}
	
	public static void NumberChecker (int bingoCard[][],boolean mask[][]) {
		int leftNumbers=0;
		for (int i=0; i<mask.length;i++) { //as both matrix are the same lengths, we only need one of them to put the limits
			for (int j=0; j<mask[i].length;j++) { //of the for-loop. 
				if (mask[i][j]==false) {
					System.out.print(bingoCard[i][j]+"\t");
					leftNumbers++; //if a number hasn't been said, this variable iterates in one
				}
			}
		}
		System.out.println("");
		System.out.println("You still have "+leftNumbers+" numbers to cross out");
	}

}
