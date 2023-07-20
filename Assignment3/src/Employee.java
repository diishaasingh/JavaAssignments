import java.time.*;

public class Employee {

	private String name;
	private double salary;
	private LocalDate hireDate;

	public Employee(String name, double salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
    
	public int yearsOfService() {
		LocalDate currdate=LocalDate.now();
		Period p=Period.between(hireDate,currdate );
		return p.getYears();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Disha Singh", 150000,LocalDate.of(2001, 8, 14));
		Employee e2=new Employee("Sameer Singh",200000,LocalDate.of(2006, 12, 5));
		
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getHireDate());
		System.out.println(e1.yearsOfService());
		
		System.out.println();
		
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());
		System.out.println(e2.getHireDate());
		System.out.println(e2.yearsOfService());
		
		
		

	}



}