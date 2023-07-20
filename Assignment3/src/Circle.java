
public class Circle {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double circumference() {
		return 2*Math.PI*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Circle c1=new Circle(5.0);
       System.out.println("radius= "+c1.getRadius());
       System.out.println("area= "+c1.area());
       System.out.println("circumference= "+c1.circumference());
       
       c1.setRadius(7.5);
       System.out.println("radius= "+c1.getRadius());
       System.out.println("area= "+c1.area());
       System.out.println("circumference= "+c1.circumference());
       
	}

}
