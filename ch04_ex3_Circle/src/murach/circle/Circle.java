/*dylaw
11:48:29 AM*/
package murach.circle;

import java.text.NumberFormat;

public class Circle {
	private double radius;
	
	public Circle() {
		super();
		this.radius = 0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public static void main (String[] args) {

	}
	
	double Diameter;
	public double getDiameter() {
		double Diameter = radius * 2;
		return Diameter;
	}
	
	public String getDiameterNumberFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        String numberFormatted = number.format(this.getDiameter());
        return numberFormatted;
	}
	
	double Circumference;
	public double getCircumference() {
		double Circumference = 2 * Math.PI * radius;
		return Circumference;
	}
	
	public String getCircumferenceNumberFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        String numberFormatted = number.format(this.getCircumference());
        return numberFormatted;
	}
	
	double Area;
	public double getArea() {
		double Area = Math.PI * radius * radius;
		return Area;
	}
	
	public String getAreaNumberFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        String numberFormatted = number.format(this.getArea());
        return numberFormatted;
	}
}