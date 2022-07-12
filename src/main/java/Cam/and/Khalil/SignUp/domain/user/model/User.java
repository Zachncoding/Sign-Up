package Cam.and.Khalil.SignUp.domain.user.model;

public class User {
    private String email;
    private String firstName;
    private String lasttName;
    private String password;

    public User(String email, String firstName, String lasttName, String password) {
        this.email = email;
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.password = password;
    }

    public User(){
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
