package librarymanagement;

public class Address {

    private String place;
    private String city;
    private String pincode;
    private String state;
    private String country;

     @Override
    public String toString() {
        return "{Address " +
               "place='" + place + '\'' +
               ", city='" + city + '\'' +
               ", state='" + state + '\'' +
               ", Country=" + country +
                ", pincode=" + pincode +
               '}';
    }

    
}
