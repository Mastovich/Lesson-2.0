package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double s1;
		double s2;
		
		double res;
		
		a = 3.2;
		b = 4.6;
		c = 1.8;
		s1 = 2;
		s2 = 3;
		
		res = b + Math.sqrt(Math.pow(b, s1) + 4 * a * c)/(2* a) - Math.pow(a, s2) * c + b;
		
		System.out.println("res =" + res);
	}

}
