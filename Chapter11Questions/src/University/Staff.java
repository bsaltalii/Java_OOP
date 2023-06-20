package University;

import java.util.Date;

public class Staff extends Employee{
    private String title;
    public Staff(String name, String adress, long phoneNumber, String email, String office, int salary, Date hired,String title){
        super(name,adress,phoneNumber,email,office,salary,hired);
        this.title=title;
    }

    @Override
    public String toString(){
        return super.toString()+" Title : "+this.title;
    }
}
