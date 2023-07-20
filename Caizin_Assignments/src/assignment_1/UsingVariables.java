package assignment_1;
public class UsingVariables {
	//java program to find the factorial of a number
	static int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=113;
		double b=2.71828;
		String c="Computer Science";
		System.out.println("This is room # "+a);
		System.out.println("e is close to "+b);
		System.out.println("I am learning a bit about "+c);

		System.out.println(fact(5));
	}

}
