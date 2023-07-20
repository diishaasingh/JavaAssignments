package assignment_1;
import java.util.*;
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey,what's your name");
		String name=sc.nextLine();
		System.out.println("hey "+name+", how old are you?:");
		int age=sc.nextInt();

		if(age<16) {
			System.out.println("You cant drive, "+name);
		}
		if(age<18) {
			System.out.println("You cant vote, "+name);
		}
		if(age<25) {
			System.out.println("You cant rent a car "+name);
		}
		if(age>=25) {
			System.out.println("You can do anything "+name);
		}
	}

}
