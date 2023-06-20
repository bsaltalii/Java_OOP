package ExceptionHnadling.Fraction;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex number : ");
        String hex = scanner.nextLine();

        try {
            for (int i=0;i<hex.length();i++){
                if ((hex.charAt(i)<=48||hex.charAt(i)>=57)||(hex.charAt(i)<=66||hex.charAt(i)>=90)){
                    throw new NumberFormatException();
                }
            }
            System.out.println(hexToDecimal(hex));
        }catch (NumberFormatException ex){
            System.out.println("Please enter hex String");
        }
    }
    public static int hexToDecimal(String hex){
        int decimalValue=0;
        for (int i=0;i<hex.length();i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue*16+hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char c){
        if(c >='A' && c<='F')
            return 10+c-'A';
        else
            return c-'0';
    }
}
