package softwareEngineering.sagesWimpAcademy;

public class Learner {
    private String firstName;
    private String lastName;
    private int email;
    private int numberOfCoursesOffered;
    private String paymentStatus;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public int getNumberOfCoursesOffered() {
        return numberOfCoursesOffered;
    }

    public void setNumberOfCoursesOffered(int numberOfCoursesOffered) {
        this.numberOfCoursesOffered = numberOfCoursesOffered;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
