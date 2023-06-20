public class Client {
    public String name;
    public int member_id;
    public int age;

    public Client(){};
    public Client(int member_id,String name,int age){
        this.member_id=member_id;
        this.name=name;
        this.age=age;
    }
    public boolean checkMemberShip(int member_id){
        String newId = Integer.toString(member_id);
        int counter=0;

        for (int i=0;i<=2;i++){
            if (newId.charAt(i)=='1'){
                counter++;
            }
        }
        if (counter==3)
            return true;
        else
            return false;
    }
}

