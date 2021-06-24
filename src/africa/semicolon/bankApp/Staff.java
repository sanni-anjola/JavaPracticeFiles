package africa.semicolon.bankApp;

public class Staff {
    private final String firstName;
    private final String lastName;
    private final String role;
    private String password;

    public Staff(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.password = "default";
    }

    public Staff(String firstName, String lastName) {
        this(firstName, lastName, "admin");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return true;
        }
        return false;
    }
}
