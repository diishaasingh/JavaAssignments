
public class Rectangle {
    private double width;
    private double height;
	Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	public double getWidth() {
		return width;
	}
	public  double getHeight() {
		return height;
	}
	public double area() {
		return width*height;
	}
	public double perimeter() {
		return 2*(width+height);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(10.0,15.0);
		System.out.println("width= "+r1.getWidth());
		System.out.println("height= "+r1.getHeight());
		System.out.println("area= "+r1.area());
		System.out.println("Perimeter= "+r1.perimeter());

	}

}
