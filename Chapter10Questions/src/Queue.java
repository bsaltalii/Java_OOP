import java.util.Random;

public class Queue {
    private int size=8;
    public int[] elements=new int[this.size];
    private int numOfElements=0;
    public Queue(){}
    public void enqueue(int v){
        if (numOfElements>this.size){
            this.size*=2;
        }
        this.elements[this.numOfElements]=v;
        this.numOfElements++;
    }
    public void dequeue(){
        this.elements[0]=0;
        this.numOfElements--;
        for (int i=0;i<this.elements.length-1;i++){
            this.elements[i]=this.elements[i+1];
        }
        this.elements[this.elements.length - 1] = 0;
    }
    public int getSize(){
        return this.size;
    }
    public void printQueue(){
        for (int i=0;i<this.elements.length;i++){
            System.out.print((i+1)+".element : "+elements[i]+"\t");
        }
    }
    public void fillTheQueue(){
        Random random =new Random();
        for (int i=0;i<this.elements.length;i++){
            this.elements[i]=random.nextInt(20);
        }
    }
    public static void main(String[] args) {
        Queue queue =new Queue();
        queue.fillTheQueue();
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }
}
