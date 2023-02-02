import java.util.*;
public class Prime {
 public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter a number");
    int n= input.nextInt();
    for (int i = 2; i <= n/2; ++i) {
           
        if (n % i == 0) { 
              System.out.println(n + " is not a prime number.");
              break;
            }
          
          else
            System.out.println(n + " is a prime number.");
            break;
        }
      }
    }
