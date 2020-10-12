package if¹®;

import java.util.Scanner;

public class algo_2884 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int H = s.nextInt();
		int M = s.nextInt();
		
		if(M-45 < 0) {
			H--;
			M= 60-(45-M);
			if(H<0) H=23;
		} else {
			M = M-45;
		}
		
		System.out.print(H+" ");
		System.out.print(M);
	}
}
