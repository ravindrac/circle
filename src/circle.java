public class circle {
	private double radius;
	public circle (){
		this.radius = 0.0;
	}
	public circle (double rad){
		this.radius = rad;
	}
	public double getArea (){
		double area = 3.14 * this.radius * this.radius;
		return area;
	}
	public double getCircumference (){
		double circumference = 2 * 3.14 * radius;
		return circumference;
	}
	
	public static void main (String [] args) {
			circle objCircle = new circle ();
			
			System.out.println ("Area of the circle is : " + objCircle.getArea ());
			System.out.println ("Circumference of the circle is : " + objCircle.getCircumference ());
	}
}