package code;

public class Perfect_Number {
	
	public static void main(String args[])
	{  
	 int n1=7,n2=0,n3,i,count=10;  
	 
	  
	 for(i=1;i<n1;++i)  
	 {  
	  n3=n1%i;
	if(n3==0)
	{
	  System.out.print(" "+i);  


	}
	}
	n2=n2+i;
	
	System.out.println(n2);
	if(n1==n2)
	{
	System.out.println("number is perfect number");
	
	}
	else{
	System.out.println("number is not perfect number");
	}
	   }
	}
