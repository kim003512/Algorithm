package InOutput;

import java.util.Scanner;

public class algo_2588 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int first = s.nextInt();
		int second = s.nextInt();
		
		int a = first * (second%10);
		int b = first * ((second%100)/10);
		int c = first * (second/100);
		int d = a + b*10 + c*100;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
