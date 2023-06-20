package University;

import java.util.Date;

public class Employee extends Person{
    public Employee(String name,String adress,long phoneNumber,String email,String office,int salary,Date hired){
        super(name,adress,phoneNumber,email);
        this.office=office;
        this.salary=salary;
        this.hired=hired;
    }
    private String office;
    private int salary;
    private Date hired;
    @Override
    public String toString(){
        return super.toString()+" Office : "+this.office+" Salary : "+this.salary+" Date : "+this.hired;
    }
}
