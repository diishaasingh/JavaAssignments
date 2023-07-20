package assignment_1;
import java.util.*;

public class BMI_Calculator {
    public static double calculateBMI(double height,double weight) {
    	return weight/(height*height);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(calculateBMI(1.61,65.0));
	}

}
