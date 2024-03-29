package votingsystem;
import java.sql.SQLOutput;
public class VotingSystem {
    public static void main(String[] args) {

        Party[] parties = new Party[3];
        parties[0] = new Party("A",0);
        parties[1] = new Party("B",1);
        parties[2] = new Party("C",2);
        System.out.println("1. citizen:");
        Person[] allperson = new Person[5];
        allperson[0] = new Turkish("Omer",27);
        allperson[0].Vote(1, parties);
        System.out.println("2. citizen:");
        allperson[1] = new Turkish("İlker",15);
        allperson[1].Vote(0, parties);
        System.out.println("3. citizen:");
        allperson[2] = new Foreign("Bob",23);
        allperson[2].Vote(2, parties);
        System.out.println("4. citizen:");
        allperson[3] = new Foreign("Alice",23);
        System.out.println("5. citizen:");
        allperson[4] = new Turkish("Hazal",25);
        allperson[4].Vote(1, parties);
        displayPartiesVotes(parties);
        displayPersonAll(allperson);
    }
    public static void displayPartiesVotes(Party[] parties)
    {
        System.out.println("Party Votes: ");
        for(int i=0;i <parties.length;i++)
        {
            System.out.println((i+1)+". party:");
            System.out.println(parties[i].toString());
        }
    }
    public static void displayPersonAll(Person[] personAll)
    {
        System.out.println("Voting States : ");
        for (int i=0;i< personAll.length;i++){
            System.out.println(i+1+".citizen :");
            System.out.println(personAll[i].toString());
        }
    }
}

