public class Time {
     private long hour;
     private long minutes;
     private long second;
     private long milliseconds;

     public Time(){
          this.hour=((System.currentTimeMillis()/(1000*60*60)))%24;
          this.minutes=(System.currentTimeMillis()/(1000*60))%60;
          this.second=(System.currentTimeMillis()/(1000))%60;
     }
     public Time(long elapseTime){
          this.hour=((elapseTime/(1000*60*60)))%24;
          this.minutes=(elapseTime/(1000*60))%60;
          this.second=(elapseTime/(1000))%60;
     }
     public long getHour() {
          return hour;
     }

     public long getMinutes() {
          return minutes;
     }

     public long getSecond() {
          return second;
     }
     public void setTime(long elapsedTime){
          this.hour=((elapsedTime/(1000*60*60)))%24;
          this.minutes=(elapsedTime/(1000*60))%60;
          this.second=(elapsedTime/(1000))%60;

     }
     @Override
     public String toString(){
          return (this.hour +" : "+this.minutes+" : "+this.second);
     }

     public static void main(String[] args) {
          Time time1=new Time();
          System.out.println(time1.toString());
          Time time2 =new Time(555550000);
          System.out.println(time2.toString());
          Time time3 = new Time();
          time3.setTime((long)677322367);
          System.out.println(time3.toString());
     }
}
