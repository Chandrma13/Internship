import java.util.*;
public class PerimeterRect {
    public static float perimeter(float p){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        float l=input.nextFloat();

        System.out.println("Enter breadth of rectangle: ");
        float b=input.nextFloat();

        return p = 2*(l + b);
 }
 public static void main(String[] args) {
    System.out.println("Perimeter of rectangle is " + perimeter(0));
 }
    }
