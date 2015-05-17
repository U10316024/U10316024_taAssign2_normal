public class Square {

  //data field
	private double distance;

  //constructor
	public Square(double distance) {
		this.distance = distance;
	}

  //getmethod
	public double getDistance() {
		return distance;
	}

  //setmethod
	public void setDistance() {
		this.distance = distance;
	}

  //getmethod
	public double getArea() {
		return distance*distance;
	}

  //getmethod
	public double getPerimeter() {
		return 4*distance;
	}
}
