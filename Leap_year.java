package code;

import java.util.*;

public class Leap_year {
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the year");
	int year=scan.nextInt();
	if(year%4==0&&year%400==0)
		System.out.println(year+"is a leap year");
	else
		System.out.println(year+"is not leap year");
	}
}
