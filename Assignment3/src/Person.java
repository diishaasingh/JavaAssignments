
public class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
	    this.age=age;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p1=new Person("Disha",21);
      Person p2=new Person("Sameer",16);
      System.out.println("Person1: "+p1.name+" "+p1.age);
      System.out.println("Person2: "+p2.name+" "+p2.age);

	}

}
