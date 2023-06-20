package University;

public class Student extends Person{
    public Student(String name,String adress,long phoneNumber,String email,String status){
        super(name,adress,phoneNumber,email);
        this.status=status;
    }
    private String status;
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    @Override
    public String toString(){
        return super.toString() +" Status : "+this.status;
    }
}
