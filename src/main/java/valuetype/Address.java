package valuetype;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String city;
    private String street;
    private String state;
    private Zipcode zipcode;

    public Address(String city, String street, String state) {
        this.city = city;
        this.street = street;
        this.state = state;
    }

    public Address() {
    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public Zipcode getZipcode() {
//        return zipcode;
//    }
//
//    public void setZipcode(Zipcode zipcode) {
//        this.zipcode = zipcode;
//    }

    //    public Address clone() {
//        Address newAddress = new Address();
//        newAddress.setCity(this.city);
//        newAddress.setStreet(this.street);
//        return newAddress;
//    }
}
