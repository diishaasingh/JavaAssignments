//Write program to output 10 random numbers between 100 and 200 inclusive, using Java Random class.
package assignment_1;

import java.util.Random;
public class JavaRandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		
		for(int i=0;i<10;i++) {
			int number=r.nextInt(101)+100;
			System.out.println(number);
		}
//nextInt(101) finds random numbers btw 0 to 100 so we add 100 so that the number 
//comes in the range of 100 to 200
	}

}
