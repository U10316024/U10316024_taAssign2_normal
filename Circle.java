public class Circle {

  //data field
	private double radius;

	//constructor
	public Circle(double radius) {
		this.radius = radius;
	}

  //getmethod
	public double getRadius() {
		return radius;
	}

  //setmethod
	public void setRadius() {
		this.radius = radius;
	}

  //getmethod
	public double getArea() {
		return 3.14*radius*radius;
	}

  //getmethod
	public double getPerimeter() {
		return 3.14*2*radius;
	}
}
