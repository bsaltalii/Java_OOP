package University;

import java.util.Date;
public class University {
    public static void main(String[] args) {
        Date date=new Date();

        Person person = new Person("Burak","K.maraş",511927710,"bsaltali26@gmail.com");
        System.out.println(person.toString());

        Student student =new Student("Hakan","Adana",9218391,"hako@gmail.com","active");
        System.out.println(student.toString());

        Employee employee =new Employee("Ahmet","Adana",12653621,"ahmet@gmail.com","obs",13000, date);
        System.out.println(employee.toString());

        Faculty faculty =new Faculty("Yazılım","Atü",332332,"atu@edu.tr","Sarıçam",12000,date,8,"1");
        System.out.println(faculty.toString());

        Staff staff =new Staff("Dilara","Konteyner",323323,"dilara@atu.edu.tr","Yazılım müh",50000,date,"Ar.gör");
        System.out.println(staff.toString());

        Person eleman =new Student("OĞUZHAN","ABD",21312,"OGUZ@MICHIGAN.EDU","AR.GOR");
        System.out.println(eleman.toString());
    }
}
