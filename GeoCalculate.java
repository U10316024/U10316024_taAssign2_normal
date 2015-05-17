import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class GeoCalculate extends JFrame {

	//Create JTextField
	private JTextField jtfRadius = new JTextField(8);
	private JTextField jtfCArea = new JTextField(8);
	private JTextField jtfCPerimeter = new JTextField(8);
	private JTextField jtfDistance = new JTextField(8);
	private JTextField jtfSArea = new JTextField(8);
	private JTextField jtfSPerimeter = new JTextField(8);
	private JTextField jtfTDistance = new JTextField(8);
	private JTextField jtfTArea = new JTextField(8);
	private JTextField jtfTPerimeter = new JTextField(8);

	//Create JButton
	private JButton jbt1;
	private JButton jbt2;
	private JButton jbt3;
	private JButton jbt4;
	private JButton jbt5;
	private JButton jbt6;
	
	public GeoCalculate() {
		
		JPanel p0 = new JPanel();
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2,1,5,5));

		jbt1 = new JButton("Compute");
		jbt2 = new JButton("Clear");

		p0.add(new JLabel("Circle"));
		p1.add(new JLabel("Radius:"));
		p1.add(jtfRadius);
		p1.add(jbt1);
		p1.add(jbt2);
		p1.add(new JLabel("The area is:"));
		p1.add(jtfCArea);
		p1.add(new JLabel("The perimeter is:"));
		p1.add(jtfCPerimeter);

		JPanel p4 = new JPanel();
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2,1,5,5));

		jbt3 = new JButton("Compute");
		jbt4 = new JButton("Clear");

		p4.add(new JLabel("Square"));
		p2.add(new JLabel("Distance:"));
		p2.add(jtfDistance);
		p2.add(jbt3);
		p2.add(jbt4);
		p2.add(new JLabel("The area is:"));
		p2.add(jtfSArea);
		p2.add(new JLabel("The perimeter is:"));
		p2.add(jtfSPerimeter);		

		JPanel p5 = new JPanel();
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(2,1,5,5));

		setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

		jbt5 = new JButton("Compute");
		jbt6 = new JButton("Clear");

		p5.add(new JLabel("RegularTriangle"));
		p3.add(new JLabel("Distance:"));
		p3.add(jtfTDistance);
		p3.add(jbt5);
		p3.add(jbt6);
		p3.add(new JLabel("The area is:"));
		p3.add(jtfTArea);
		p3.add(new JLabel("The perimeter is:"));
		p3.add(jtfTPerimeter);

		add(p0);
		add(p1);
		add(p4);
		add(p2);
		add(p5);
		add(p3);

		jbt1.addActionListener(new Listener1());
		jbt2.addActionListener(new Listener2());
		jbt3.addActionListener(new Listener3());
		jbt4.addActionListener(new Listener4());
		jbt5.addActionListener(new Listener5());
		jbt6.addActionListener(new Listener6());

	}

	//ActionListener with JButton1
	class Listener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			double radius = Double.parseDouble(jtfRadius.getText());

			Circle circle = new Circle(radius);

			//Set value to textfield
			jtfCArea.setText(String.format("%.2f",circle.getArea()));
			jtfCPerimeter.setText(String.format("%.2f",circle.getPerimeter()));

		}
	}

	//ActionListener with JButton2
	class Listener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			//Clear textfield
			jtfRadius.setText("");
			jtfCArea.setText("");
			jtfCPerimeter.setText("");
		}
	}

	//ActionListener with JButton3
	class Listener3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			double distance = Double.parseDouble(jtfDistance.getText());

			Square square = new Square(distance);

			//Set value to textfield
			jtfSArea.setText(String.format("%.2f",square.getArea()));
			jtfSPerimeter.setText(String.format("%.2f",square.getPerimeter()));

		}
	}

	//ActionListener with JButton4
	class Listener4 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			//Clear textfield
			jtfDistance.setText("");
			jtfSArea.setText("");
			jtfSPerimeter.setText("");
		}
	}

	//ActionListener with JButton5
	class Listener5 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			double TDistance = Double.parseDouble(jtfTDistance.getText());

			RegularTriangle rt = new RegularTriangle(TDistance);

			//Set value to textfield
			jtfTArea.setText(String.format("%.2f",rt.getTArea()));
			jtfTPerimeter.setText(String.format("%.2f",rt.getTPerimeter()));

		}
	}

	//ActionListener with JButton6
	class Listener6 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			//Clear textfield
			jtfTDistance.setText("");
			jtfTArea.setText("");
			jtfTPerimeter.setText("");
		}
	}

	//**Main method*/
	public static void main(String[] args) {
		
		JFrame frame = new GeoCalculate();
		frame.setTitle("U10316024_GeoCalculate");
		frame.setSize(450,500);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
