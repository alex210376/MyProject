package academy.lesson11.HW;

import academy.lesson04.HW_L04.Abonent;

import java.util.Random;

public class AbonentExt extends Abonent {
    private String phoneNumber;
    private String phoneCarrier;

    public AbonentExt (){
    super();
    this.phoneNumber = "1234567";
    this.phoneCarrier = "Life";
    }

    public AbonentExt(long id, String firstName, String lastName, int age, String gender, String phoneNumber, String phoneCarrier) {
        super(id, firstName, lastName, age, gender);
        this.phoneNumber = phoneNumber;
        this.phoneCarrier = phoneCarrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneCarrier() {
        return phoneCarrier;
    }

    public void setPhoneCarrier(String phoneCarrier) {
        this.phoneCarrier = phoneCarrier;
    }

}
