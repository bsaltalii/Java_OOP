import java.lang.reflect.Array;
import java.util.Scanner;
public class DasKino {
    public static void main(String[] args) {
        Movie movie1 = new Movie ("Burning", "Lee Chang-dong", 2010, 148);
        Movie movie2 = new Movie ("Spirited Away", "Hayao Miyazaki", 2001, 125);
        Movie movie3 = new Movie ("Once upon a time in Anatolia", "uzi Bilge Ceylan", 2011, 157);
        Movie movies = new Movie ("In the mood for love", "Wong Kar-ual", 2000, 98);

        Hall hallOne = new Hall (1, 50);
        Hall hallTwo = new Hall (2, 20);
        Hall hallThree = new Hall (3, 100);

        Session session1 = new Session (movie1, hallOne, "Monday","12:00");
        Session session2 = new Session (movie1, hallTwo, "Monday","15.00");
        Session session3 = new Session (movie1, hallOne, "Friday","15:00");

        Client client1 = new Client (111253614, "Dilara Nihadioğlu",25);
        Client client2 = new Client (117253614,"Nisa Nur Hurç",18);
        Client client3 = new Client (119253614, "Kayra Kaan Kabakçıoğlu",17);

        Reservation reservation1 = new Reservation(client1,session2,2);
        allDisplay(reservation1);
        Reservation reservation2 = new Reservation(client2,session2,2);
        allDisplay(reservation2);
        Reservation reservation3 = new Reservation(client3,session2,2);
        allDisplay(reservation3);

        char[] hallOneArray = new char[hallOne.capacity];
        hallOne.fillHallUnbooked(hallOneArray);
        char[] hallTwoArray = new char[hallTwo.capacity];
        hallTwo.fillHallUnbooked(hallTwoArray);
        char[] hallThreeArray = new char[hallThree.capacity];
        hallThree.fillHallUnbooked(hallThreeArray);

    }
    public static void allDisplay(Reservation reservation){
        System.out.println("Hello Dear "+reservation.client.name+" your membership status is "+reservation.client.checkMemberShip(reservation.client.member_id));
        Reservation.takeNumOfTicket(reservation);
        if(reservation.client.checkMemberShip(reservation.client.member_id))
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter seat numbers : ");
            int[] seatNums = new int[reservation.numOfTickets];
            for(int i=0 ; i<seatNums.length ; i++)
            {
                seatNums[i] = s.nextInt();
            }
            reservation.seatsBooked = seatNums ;
            reservation.createReservation(reservation);
        }
        else{
            reservation.createReservation(reservation);
        }
        System.out.println("Your reservation to "+reservation.session.movie.name+" on "+reservation.session.day+" at "+reservation.session.time +" for "+reservation.numOfTickets+" people is successfully made");
        System.out.print("Your seat numbers are:");
        for(int i=0 ; i<reservation.numOfTickets ; i++)
        {
            System.out.print(reservation.seatsBooked[i] + " ");
        }
        System.out.println("Your ticket cost is "+reservation.calculateCost(reservation));
    }
}
