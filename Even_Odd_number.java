package code;
import java.util.*;
public class Even_Odd_number {
	
	 public static void main(String args[]){
		 System.out.println("enter the number");
		 Scanner scan=new Scanner(System.in);
		  int num=scan.nextInt();
		if(num%2==0)
		{
		System.out.println(num+"is even number");
		 
		}else{
		System.out.println(num+"is odd number");
		}  
		}

}
