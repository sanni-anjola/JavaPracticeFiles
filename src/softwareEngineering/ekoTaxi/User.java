package softwareEngineering.ekoTaxi;

public class User {
    private String name;
    private String phoneNumber;
    private int userId;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String requestRide(){
        return null;
    }

    public boolean requestPayment(){
        return false;
    }

    public double makePayment(){
        return 0.0;
    }

    public boolean confirmPayment(){
        return false;
    }

    public int rateDriver(){
        return 0;
    }

    public boolean contactDriver(){
        return false;
    }
}
