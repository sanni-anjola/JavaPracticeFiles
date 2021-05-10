package africa.semicolon.chapterThreeExercises;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthlySalary > 0) {this.monthlySalary = monthlySalary;}
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getYearlySalary() {
        return this.monthlySalary * 12;
    }

    public void salaryRaise(double percentRaise) {
        if(percentRaise > 0){
            this.monthlySalary = this.monthlySalary * (1 + percentRaise / 100.0);
        }
    }
}
