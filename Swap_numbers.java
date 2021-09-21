package code;

import java.util.*;
public class Swap_numbers {
	public static void main(String args[]) {
	System.out.println("Exchange value of x & y");
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	int y=scan.nextInt();
	int temp;
temp=x;
x=y;
y=temp;
System.out.println("X is"+x  + "y is"+y);

	}

}
