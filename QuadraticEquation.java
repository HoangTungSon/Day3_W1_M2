
public class QuadraticEquation {

	private double a;
	private double b;
	private double c;
	private double delta;
	private double root1;
	private double root2;

	public void method(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	public double getDiscriminant() {
		return delta = Math.pow(this.b,2) - 4*this.a*this.c;
	}
	
	public double getRoot1() {
		return root1 = (-this.b + Math.sqrt(delta))/(2*this.a);
	}
	
	public double getRoot2() {
		return root2 = (-this.b - Math.sqrt(delta))/(2*this.a);
	}
}
