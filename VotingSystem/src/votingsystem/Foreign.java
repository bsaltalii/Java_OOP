/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

import java.util.Scanner;

/**
 *
 * @author ÖMER
 */

public class Foreign extends Person {
    public Foreign(){}
    public Foreign(String name,int age){
        super(name,age);
    }
    public boolean isValidPassport(String IDpassport){
        //CHAR CONTROL
        boolean hasOneChar=false;
        int charCounter=0;
        for (int i=0;i<IDpassport.length();i++){
            if (Character.isLetter(IDpassport.charAt(i))){
                charCounter++;
            }
        }
        if (charCounter==1)
            hasOneChar=true;
        //CONTROL END

        //DİGİTS CONTROL
        boolean hasSixDigit=false;
        int digitCounter=0;
        for (int i=0;i<IDpassport.length();i++){
            if (Character.isDigit(IDpassport.charAt(i))){
                digitCounter++;
            }
        }
        if (digitCounter==6)
            hasSixDigit=true;
        //CONTROL END

        //RETURN STATEMENT
        if (hasOneChar && hasSixDigit && IDpassport.length()==7){
            return true;
        }
        return false;
        //END
    }
    @Override
    public boolean Vote(int partyID, Party[] parties)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your ID : ");
        String id = scan.next();
        System.out.print("Enter Your Passport Number : ");
        String passport = scan.next();

        if (checkIDValid(id) && age>=18 && !votedBefore &&isValidPassport(passport)){
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
    @Override
    public String toString(){
        String all = ("Name : " +this.name+ " Age : "+ this.age+" Voting State : "+this.votedBefore);
        all +=(" Citizenship Status : Foreign");
        return all;
    }
}