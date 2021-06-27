package africa.semicolon.bankApp;

public class Address implements Cloneable{
    private int houseNumber;
    private String streetName;
    private String city;
    private String state;

    public Address(int houseNumber, String streetName, String city, String state) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    public Address(int houseNumber, String streetName, String city) {
        this(houseNumber, streetName, city, "Lagos");
    }

    public Address(int houseNumber, String streetName) {
        this(houseNumber, streetName, "Ikeja");
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString(){
        return String.format("%d %s, %s, %s.", houseNumber, streetName, city, state);
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        }catch (CloneNotSupportedException ex){
            return null;
        }
    }
}
