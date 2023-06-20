package University;

public class Person {
    private String name;
    private String adress;
    private long phoneNumber;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(String name,String adress,long phoneNumber,String email){
        this.name=name;
        this.adress=adress;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    @Override
    public String toString(){
        return "Name : "+this.name+" Adress : "+this.adress+ " Phone number : "+this.phoneNumber+ " email : "+this.email;
    }
}
