import java.io.Serializable;

public class Contact implements Serializable{
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
               "\nAddress: " + address +
               "\nPhone: " + phoneNumber;
    }
}