package TextIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileFunctions {
    public static void main(String[] args) {

        File file = new File("text.txt");
        try{
            PrintWriter writer = new PrintWriter(file);
            writer.write("Ali\nAhmet\nBuğra\nCan\nDeniz");
            writer.close();
        }catch (FileNotFoundException ex){
            System.out.println("Dosya bulunamadı..");
        }
        System.out.println(writeInFile("Burak",file));
        System.out.println(readInFile("Burak",file));
    }
    public static int readInFile(String line, File file){
        try {
            int lineCounter=0;
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                lineCounter++;
                if (line.equals(scanner.nextLine())){
                    return lineCounter;
                }
            }
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
    public static int writeInFile(String name,File file){
        File tempFile = new File("text2.txt");

        try{
            PrintWriter writer = new PrintWriter(tempFile);
            Scanner scanner = new Scanner(file);
            String line;
            int lineCounter=0;
            int numOfLine=0;
            boolean isDone=true;

            while (scanner.hasNextLine()){
                line= scanner.nextLine();
                lineCounter++;

                if(line.compareTo(name)>0&&isDone){
                    writer.write(name+"\n");
                    numOfLine=lineCounter;
                    isDone=false;
                }
                writer.write(line+"\n");
            }
            writer.close();

            if (!file.delete()){
                System.out.println("File could not delete");

            }if (tempFile.renameTo(file)){
                System.out.println("File name has not been changed");
            }
            return numOfLine;

        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return -1;
    }
}
