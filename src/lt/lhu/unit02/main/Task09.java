package lt.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double fx;
		
		x = -2.87;
		
		if(x <= -3) {
			fx = 9;
			System.out.println("fx =" + fx);
		}else {
			fx = 1 / (Math.pow(x, 2) + 1);
			System.out.println("fx =" + fx);
		}
	}

}
