package TextIO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountCharsWordsLines {
    public static void main(String[] args) {
        File file=new File("text.txt");

        try{
            PrintWriter writer = new PrintWriter(file);
            writer.write("Burak buğra ''! eren  +% dilara\n ahmet kalem ");
            writer.close();

            Scanner scanner = new Scanner(file);
            StringBuilder builder = new StringBuilder();
            int lineCounter=0;
            int wordCounter=0;
            int charCounter=0;
            String line="";

            while (scanner.hasNextLine()){
            lineCounter++;
            line= scanner.nextLine();
            builder.append(line);
            }

            String[] words=builder.toString().split(" ");
            for (int i=0;i< words.length;i++){
                if (isWord(words[i])){
                    wordCounter++;
                }
            }
            for (int i=0;i<words.length;i++){
                for (int j=0;j<words[i].length();j++){
                    charCounter++;
                }
            }

            System.out.println("File : "+file +" has ");
            System.out.println(lineCounter+" Lines");
            System.out.println(wordCounter+" Words");
            System.out.println(charCounter+" Characters");

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static boolean isWord(String word){
        for (int i=0;i<word.length();i++){
            if (Character.isLetter(word.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
