package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int a;
		System.out.println("enter a number of a");
		
		a = sc1.nextInt();
				
		Scanner sc2 = new Scanner(System.in);
		int b;
		System.out.println("enter a number of b");
		
		b = sc2.nextInt();
				
		Scanner sc3 = new Scanner(System.in);
		int c;
		System.out.println("enter a number of c");
		
		c = sc3.nextInt();
				
		int s;
		
		s = 2;
		
		double fun;
		
		fun = Math.pow(a, s) - Math.pow(b-c, s) + Math.log(Math.pow(b, s) + 1);
		
		System.out.println("fun" + fun);
	
	}

}
