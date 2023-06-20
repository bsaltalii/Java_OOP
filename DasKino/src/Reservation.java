import java.util.Random;
import java.util.Scanner;

public class Reservation {
    public Session session;
    public Hall hall;
    public Client client;
    public int cost;
    public int ticketPrice=100;
    public int numOfTickets;
    public int[] seatsBooked;

    public Reservation(){}
    public Reservation(Client client,Session session, int numOfTickets){
        this.client=client;
        this.session=session;
        this.numOfTickets=numOfTickets;
    }
    public Reservation bookASeatRandom(Reservation reservation, int numOfTickets){

        Random rnd = new Random();
        for (int i=0; i<reservation.numOfTickets; i++){

            int seatNumber = rnd.nextInt(reservation.hall.seats.length);
            reservation.seatsBooked[i] = seatNumber;

            while(reservation.hall.seats[seatNumber] == 'B'){
                seatNumber = rnd.nextInt(reservation.hall.seats.length);
                reservation.seatsBooked[i] = seatNumber;
            }
        }
        return reservation;
    }
    public Reservation bookASeatbySeatNumber(Reservation reservation, int numOfBookedTickets, int[] wantedSeats){

        for (int i=0;i<wantedSeats.length;i++){
            reservation.seatsBooked[wantedSeats[i]]='B';
        }
        return reservation;
    }
    public void createReservation(Reservation reservation){

        if (client.checkMemberShip(reservation.client.member_id)){
           reservation = bookASeatbySeatNumber(reservation,reservation.seatsBooked.length,reservation.seatsBooked);
        }else {
           reservation = bookASeatRandom(reservation,reservation.numOfTickets);
        }
    }
    public int calculateCost(Reservation reservation){

        if (reservation.client.checkMemberShip(reservation.client.member_id)){
            this.cost=((this.numOfTickets*this.ticketPrice)*8)/10;
        } else if (reservation.client.age < 18) {
            this.cost=((this.numOfTickets*this.ticketPrice)*95)/100;
        }
        this.cost=this.numOfTickets*this.ticketPrice;
        return this.cost;
    }
    public static void takeNumOfTicket(Reservation reservation){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of ticket");
        int num = scan.nextInt();
        reservation.numOfTickets=num;
    }

}


