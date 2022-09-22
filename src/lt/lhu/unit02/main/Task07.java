package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double fx;
		
		a = -7.12;
		b = 4.64;
		c = 1.34;
		
		if(a >= 0) {
			fx = Math.pow(a, 2);
			System.out.println("fx(a) =" + fx);
		}else {
			fx = Math.pow(a, 4);
			System.out.println("fx(a) =" + fx);
		}
		
		if(b >= 0) {
			fx = Math.pow(b, 2);
			System.out.println("fx(b) =" + fx);
		}else {
			fx = Math.pow(b, 4);
			System.out.println("fx(b) =" + fx);
		}
		
		if(c >= 0) {
			fx = Math.pow(c, 2);
			System.out.println("fx(c) =" + fx);
		}else {
			fx = Math.pow(c, 4);
			System.out.println("fx(c) =" + fx);
		}
	}

}
