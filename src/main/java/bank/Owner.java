package bank;

public class Owner {

    private String fistName;
    private String lastName;
    private Address address;
    private String PESEL;

    public Owner(String fistName, String lastName, Address address, String PESEL) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.address = address;
        this.PESEL = PESEL;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAdress() {
        return address;
    }

    public String getPESEL() {
        return PESEL;
    }
}
