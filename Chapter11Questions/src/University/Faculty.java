package University;

import java.util.Date;

public class Faculty extends Employee{
    public Faculty(String name, String adress, long phoneNumber, String email, String office, int salary, Date hired,int officeHours,String rank){
        super(name,adress,phoneNumber,email,office,salary,hired);
        this.officeHours=officeHours;
        this.rank=rank;
    }
    private int officeHours;
    private String rank;
    @Override
    public String toString(){
        return super.toString()+" Office hours : "+this.officeHours+" Rank: "+this.rank;
    }
}
