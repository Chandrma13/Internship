/*Random Password Generator that takes input for the length of password from user and generates a random password 
according to user's input and prints how the strong the password is. */

import java.util.*;
public class RandomPasswordGen{
    public static void main(String[] args){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String specialChar="<>,.?/{)}[]!@#$%^&*(";
        String combination= upper + lower+num + specialChar;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your Password");
        int l = input.nextInt();

        if(l<8){System.out.println("Length of Password is too short. Length of Password should be between 8-16 characters");}
        else if(l>16){System.out.println("Length of Password is too long. Length of Password should be between 8-16 characters");}
        else{
        char[] password = new char[l];
        Random r=new Random();
        for (int i = 0; i < l; i++) {
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Your Generated Password is: "+ new String(password));}

        switch(l){
            case 8:
            System.out.println("Your Password's strength is Very Weak.");
            return;

            case 9,10:
            System.out.println("Your Password's strength is Weak.");
            return;

            case 11,12:
            System.out.println("Your Password's strength is Medium.");
            return;

            case 13,14:
            System.out.println("Your Password's strength is Strong");
            return;

            case 15,16:
            System.out.println("Your Password's strength is Very Strong");

        }
        System.out.println("Length of the Password entered is: " + l);
     }
}
//Code by Chandrma