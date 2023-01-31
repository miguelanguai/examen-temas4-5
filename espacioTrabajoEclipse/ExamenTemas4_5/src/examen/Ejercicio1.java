package examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
//	     1. (1.5 points) Create a method that receives a number of day of the week and returns the name of that day of the week.
//	     To do that you have to create an array of Strings and initialize it with the name of the months in English (Monday,
//	    		 Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday). If the number that you receive is not a valid day
//	     of the week, the method will return the empty String (“”). The main method has to input a number of the day of the
//	    		 week and display the name of that day of the week by using the function that you have just created.
//	    		 Validation would be great, but not required in this exam
		
		Scanner read = new Scanner (System.in);
		System.out.println("Write the number of the day of the week");
		int dayWeek = read.nextInt();read.nextLine();
		
		System.out.println(day(dayWeek));
		
	}
	
	public static String day (int dayWeek) {
		String []week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		if (dayWeek >0&&dayWeek <8) {
			return week[dayWeek-1]; 
			/*As the user may not be programmer, he would start assigning Monday with number one. 
			 * That's why I need to write dayWeek-1 in the return and changing the limits of if condition
			 */
		} else return "";
		
	}

}
