import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int value;

        do{
            System.out.print("Enter numbers (input ends with 0) : ");
            value = scanner.nextInt();
            if (!integerList.contains(value)&&value!=0)
                integerList.add(value);
        }while (value!=0);

        System.out.print("The array list : ");

        for(int a : integerList){
            System.out.print(a + "\t");
        }
    }
}