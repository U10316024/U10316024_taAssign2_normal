public class RegularTriangle{

	//data field
	private double TDistance;

	//constructor
	public RegularTriangle(double TDistance) {
		this.TDistance = TDistance;
	}

	//getmethod
	public double getTDistance() {
		return TDistance;
	}

	//setmethod
	public void setTDistance() {
		this.TDistance = TDistance;
	}

	//getmethod
	public double getTArea() {
		return (Math.pow(3,0.5)*TDistance*TDistance)/4;
	}

	//getmethod
	public double getTPerimeter() {
		return 3*TDistance;
	}
}
