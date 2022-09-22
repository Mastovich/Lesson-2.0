package lt.lhu.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double h;
		double Fx;
		
		a = 3;
		b = 6;
		h = 0.2;
		
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "Fx");
		System.out.println("---------------------------------");
		for(double x = a; x <b; x = x + h) {
		Fx = 2 * Math.tan(x / 2) + 1;
		System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, Fx);
		}
	}

}
