import java.util.*;
public class Average {
   public static void main(String[] args)
    {
    Scanner Input= new Scanner(System.in);
      System.out.println("Enter first number");
      int f= Input.nextInt(); //f stands for first number
      System.out.println("Enter second number");
      int s= Input.nextInt(); //s stands for second number
        
    int r= (f+s)/2; //r stands for result
    System.out.println("Average of "+ f + " and "+ s +" is: "+ r);
  }
}

