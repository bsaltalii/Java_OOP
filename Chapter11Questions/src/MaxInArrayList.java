import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxInArrayList {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
        int input=-1;

        do {
            System.out.print("Enter number(input ends with 0) : ");
            input=scanner.nextInt();
            if (!list.contains(input)&input!=0)
                list.add(input);
        }while (input!=0);

        System.out.println("Max : "+max(list));
    }
    public static Integer max(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<list.size();i++){
            if (list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
    }
}
