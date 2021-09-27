package code;

public class This {  
	int age;
	
	This(int age){
		this.age=age;
		
	}
	
	void display(This obj)
	{
		System.out.println("this age"+this.age);
		System.out.println("obj age"+obj.age);
		
	}
	public static void main(String args[])
	{
		This obj1=new This(10);
		This obj2=new This(20);
		obj1.display(obj2);
	}

 }
