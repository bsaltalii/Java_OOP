package TextIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args){
        File file=new File("text.txt");

        try {
            //Creating And Printing To The New File
            PrintWriter writer = new PrintWriter(file);
            writer.write("java Exercise12_11 John filename");
            writer.close();
            Scanner scanner = new Scanner(file);
            String line ="";
            StringBuilder builder = new StringBuilder();
            //End

            //Reading Data
            while (scanner.hasNext()){
            line = scanner.nextLine();
            line = line.replaceAll("John","");
            builder.append(line);
            }
            //End

            //Creating And Printing To The New File
            File file2 = new File("text2.txt");
            PrintWriter writer1 = new PrintWriter(file2);
            writer1.write(builder.toString());
            writer1.close();
            //End

            //Deleting The Old File
            if (!file.delete()){
                System.out.println("File could not delete");
            }
            //End

            //Rename To New File
            if (!file2.renameTo(file)){
                System.out.println("File could not rename");
            }
            //End

        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
