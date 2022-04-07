package airline;

import java.util.Objects;

public class Employee extends Person{
    private int empId;
    private static int empIdGen;
    private String job;

    public Employee(String firstName, String lastName, String job) {
        super(firstName, lastName);
        this.job = job;
        empId = Integer.parseInt(5 + String.format("%08d", empIdGen));
        empIdGen++;
    }

    public boolean hasJob(String isThisJob){
        return Objects.equals(isThisJob, this.job);
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", EMP: %d, Job: %s", empId, job);
    }
}
