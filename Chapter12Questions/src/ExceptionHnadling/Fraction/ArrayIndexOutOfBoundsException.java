package ExceptionHnadling.Fraction;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args){

        String[] months = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number between 1-12 : ");

        try{
            int choice =scanner.nextInt();
            System.out.println(months[choice]+" has "+dom[choice]+" days.");
        }catch(java.lang.ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }catch(InputMismatchException ex){
            System.out.println("Please enter only int type");
        }
    }
}
