import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
        int first= input.nextInt();
        System.out.println("Enter second number");
        int second= input.nextInt();
        System.out.println("Enter third number");
        int third= input.nextInt();

        int temp=first>second?first:second;
        if (temp>third) {
            System.out.println(temp + " is the largest among "+first+","+second+","+third+".");
            
        } else {
            System.out.println(third + " is the largest among "+first+","+second+","+third+".");
               }
}
}
