package assignment_1;
import java.util.*;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int number;
		System.out.println("Enter numbers(Enter 0 to stop)");
		while(true) {
			number=sc.nextInt();
			sum+=number;
			
			if(number==0) {
				break;
			}
		}
		System.out.println(sum);

	}

}
