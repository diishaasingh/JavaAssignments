package assignment_1;

public class IncomeTaxCalculator {
    public static double calculateTax(double salary) {
    	if(salary==50000.0) {
    		return 0.00;
    	}
    	else if(salary>=60000.0) {
    		return 0.1*(salary-60000);
    	}
    	else if(salary<=150000) {
    		return 0.1*10000+0.2*(salary-60000);
    		
    	}
    	else {
    		return 0.1*10000+0.2*90000+0.3*(salary-150000);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(calculateTax(100000));
		
		
		

	}

}
