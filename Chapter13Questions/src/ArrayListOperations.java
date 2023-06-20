import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(7);
        ArrayListOperations.sort(list);
        ArrayListOperations.average(list);
    }
    public static void average(ArrayList<Integer> list){
        int total=0;
        for (int i=0;i<list.size();i++){
            total+=list.get(i);
        }
        System.out.println("Average of the list is : "+(total/list.size()));
    }
    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
        for (int elements : list){
            System.out.print(elements + "\t");
        }
    }
}
