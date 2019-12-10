package bank;

public class Address {

    private String code, city, street;

     public Address(String code, String city, String street) {
        this.code = code;
        this.city = city;
        this.street = street;
    }

    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
