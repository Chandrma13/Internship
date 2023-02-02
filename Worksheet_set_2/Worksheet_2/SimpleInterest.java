import java.util.*;
public class SimpleInterest {
    
public static float  simpleinterest( float si) {
     float p,r,t;
     Scanner input= new Scanner(System.in);

    System.out.println("Enter principal amount: ");
     p=input.nextFloat();

    System.out.println("Enter rate of interest: ");
     r=input.nextFloat();

    System.out.println("Enter time period: ");
     t=input.nextFloat();
     
    return si=(p*r*t)/100;
     }
 public static void main(String[] args) {
    System.out.println("Interest on principle amount for given time is "+ simpleinterest(0));
    
 }
}