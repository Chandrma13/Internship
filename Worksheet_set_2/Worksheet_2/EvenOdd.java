import java.util.*;
public class EvenOdd
{
   public static void main(String[] args)
    {
    Scanner Input= new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n= Input.nextInt();

    if (n%2==0) {
       System.out.println(n + " is even.");
        }
    else {
        System.out.println(n + " is odd.");
         }
    }

}
