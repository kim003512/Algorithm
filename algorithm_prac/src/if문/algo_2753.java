package if¹®;

import java.util.Scanner;

public class algo_2753 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		
		if(year % 4 ==0) {
			if(year%400 == 0) System.out.println("1");
			else if (year%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
	}

}
