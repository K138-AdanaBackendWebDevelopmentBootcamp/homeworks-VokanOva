package Hw.Classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Instructor extends Course {



    private String Name;
    private int phoneNumber;
    private String address;
    private Long id;

    public Instructor(String Name, int phoneNumber,String address){
        super();
        this.Name=Name;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}