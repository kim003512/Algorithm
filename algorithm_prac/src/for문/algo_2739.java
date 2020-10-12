package for¹®;

import java.util.Scanner;

public class algo_2739 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num +" * "+i +" = "+ num*i);
		}
	}

}
