package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		int x;
		System.out.println("x =");
		
		x = sc1.nextInt();
				
		Scanner sc2 = new Scanner(System.in);
		int y;
		System.out.println("y =");
		
		y = sc2.nextInt();
				
		Scanner sc3 = new Scanner(System.in);
		int z;
		System.out.println("z =");
		
		z = sc3.nextInt();
				
		int res;
		
		res = x + y + z;
		
		System.out.println("Summa = " + res);
	}

}
