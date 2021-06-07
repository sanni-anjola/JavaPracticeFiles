package softwareEngineering.ekoTaxi;

public class Driver {
    private String name;
    private String email;
    private String phone;
    private String carType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public boolean acceptRide(){
        return false;
    }

    public int rateUser(){
        return 0;
    }


}
