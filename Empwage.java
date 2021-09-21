
package code;
import java.util.*;
public class Empwage {
	public static void main(String args[]) {
	System.out.println("Welcome to Employee Wage Computation");
		int emp_present=1,empwage=20,perdayhour=8,totalwageday;
		int ch=1;
	int empcheck=(int)(Math.random()*2);
	
	if(empcheck==emp_present)
	{
		System.out.println("employee is present");
		switch(ch) {
		case 1:
			totalwageday=empwage*perdayhour;
			System.out.println("Emp total wage per day"+totalwageday);
			
		}
	}
	else
	{
		System.out.println("Employee is absent");
		
	}
	
	}
 }
	 
