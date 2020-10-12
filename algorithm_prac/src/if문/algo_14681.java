package if¹®;

import java.util.Scanner;

public class algo_14681 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a > 0) {
			if(b>0) System.out.println("1");
			else if(b<0) System.out.println("4");
		} else {
			if(b>0) System.out.println("2");
			else if(b<0) System.out.println("3");
		}
	}
}
