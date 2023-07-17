package unset_Bit;

import java.util.Scanner;

/*
  	You are given two integers A and B.
	If B-th bit in A is set, make it unset.
	If B-th bit in A is unset, leave as it is.
	Return the updated A value.
 */

public class Unset_Bit {
	
	private static void unset_bit(int a, int b) {
		
		int temp=1<<b;		
		temp=~temp;
		System.out.println(a&temp);
	}

	public static void main(String[] args) {
		
		

		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		unset_bit(a,b);
	}
}
/*
		Input
		A = 4		// 100
		B = 1		// temp=1<<1	=> 2 (10)	=> ~2(01)	=> 100&01 => 4(100)
		
		Output
		4
		
		Input
		A = 5		// 101
		B = 2		// temp=1<<2	=>4(100)	=> ~4 (011)	=> 101&011 => 1(01)
		
		Output
		1
*/
