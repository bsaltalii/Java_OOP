package votingsystem;

import java.util.Scanner;

public class Person {

    public String name;
    public int age;

    public boolean votedBefore=false;

    public Person(){}

    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public boolean Vote(int partyID, Party[] parties){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID : ");
        String newId= scanner.next();

        if (checkIDValid(newId) && age>=18 && !votedBefore){
            for(int i=0;i<parties.length;i++){
                if (parties[i].partyID == partyID){
                    parties[i].totalNumberOfVotes++;
                    votedBefore=true;
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkIDValid(String ID)
    {
        boolean validID=true;
        if (ID.length()==11){
            for (int i = 0; i < ID.length(); i++) {
                if (!Character.isDigit(ID.charAt(i))) {
                    validID =false;
                }
            }
        }
        if (validID){
            return true;
        }
        return false;
    }
}