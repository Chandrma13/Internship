import java.util.*;
public class Swap
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
        int f= input.nextInt(); 
        System.out.println("Enter second number");
        int s= input.nextInt(); 

       System.out.println("Before Swap");
       System.out.println("First number: "+ f);  
       System.out.println("Second number: "+ s);
       
       int temp= f;
        f=s;
        s=temp;

       System.out.println("After Swap");
       System.out.println("First number: "+ f);  
       System.out.println("Second number: "+ s);
  }
}