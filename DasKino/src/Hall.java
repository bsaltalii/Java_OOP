public class Hall {
    public int hall_id;
    public int capacity;
    public char[] seats;

    public Hall(){}
    public Hall(int hall_id,int capacity){
        this.hall_id=hall_id;
        this.capacity=capacity;
    }
    public void fillHallUnbooked(char[] seats){
        seats=new char[this.capacity];
        for (int i=0;i<seats.length;i++){
            seats[i]='U';
        }
        this.seats=seats;
    }
}
