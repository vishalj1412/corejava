package code;


import java.util.*;
public class Power_Of_Two{

     public static void main(String []args){
        System.out.println("Hello World");
        int pow=1;
        System.out.println("Enter the Power number");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            pow=pow*2;
        }
        System.out.println(pow);
     }
}


