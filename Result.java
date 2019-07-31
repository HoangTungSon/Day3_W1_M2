import java.util.Scanner;

public class Result {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		QuadraticEquation qe = new QuadraticEquation();
		
		System.out.println("Enter the number of equation a*x^2 + b*x + c = 0");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		qe.method(a,b,c);
		
		if(a == 0) {
			System.out.println("the result = " + -c/b);
		} else {
			if(qe.getDiscriminant() >= 0) {
				System.out.println("the result = " + qe.getRoot1());
				System.out.println("the result = " + qe.getRoot2());
			} else {
				System.out.println("no result");
			}
		}
		
	}

}
