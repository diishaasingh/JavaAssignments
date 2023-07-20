//User Input vs Program arguments
//Write program to take user’s name as input, print “hello <user name>”
//Now write same program but input should be as an argument to the program.
package assignment_1;

import java.util.Scanner;
public class TakingInputs {

	public static void main(String[] args) {
		//user input
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter name: ");
//		String name=sc.nextLine();
//		System.out.println("Hello "+name);

		//input as argument
		String username;
		if(args.length==0) {
			System.out.println("Enter name: ");
			return;
		}
		else {
		username=args[0];
		}
		System.out.println("Hello "+username);
		
	}

}
