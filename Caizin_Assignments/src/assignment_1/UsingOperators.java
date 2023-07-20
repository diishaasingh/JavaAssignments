package assignment_1;

public class UsingOperators {

	public static void main(String[] args) {
		/*unary operator-The Java unary operators require only one operand.
		 * Unary operators are used to perform various operations i.e.:
		 * incrementing/decrementing a value by one, negating an expression,
		 * inverting the value of a boolean */
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		int u=10;  
		int v=-10;  
		boolean c=true;  
		System.out.println(~u);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~v);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value) 
		System.out.println(Integer.toBinaryString(v));
		System.out.println(Integer.toBinaryString(~v));
		//Java Arithmetic Operators-Java arithmetic operators are used to perform addition, subtraction, 
		//multiplication, and division. They act as basic mathematical operations.
		int a=10;  
		int b=5;  
		System.out.println(a+b);
		System.out.println(a-b); 
		System.out.println(a*b); 
		System.out.println(a/b);
		System.out.println(a%b);

		//left shift operators
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(15<<4);//15*2^4=15*16=240  
        
		//right shift operators
		System.out.println(10>>2);//10/2^2=10/4=2   
		System.out.println(20>>3);//20/2^3=20/8=2 
		
		//AND operator logical and bitwise
		int a2=10;  
		int b2=5;  
		int c2=20;  
		System.out.println(a2<b2&&a2<c2);//false && true = false  
		System.out.println(a2<b2&a2<c2);//false & true = false
		
		//AND operator logical and bitwise
		System.out.println(a2>b2||a2<c2); 
		System.out.println(a2>b2|a2<c2);
		
		//Java Ternary Operator:is used as one line replacement for if-then-else statement 
		//and used a lot in Java programming. It is the only conditional operator which takes three operands
		int a3=2;  
		int b3=5;  
		int min=(a3<b3)?a3:b3;  
		System.out.println(min); 
		
		
	}

}
