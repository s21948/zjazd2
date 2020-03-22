package zadanie_1;

public class User {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Boolean guest;

    public User(String firstname, String lastname, String email, String password) {
        if (firstname == null || lastname == null || email == null || password == null) {
            throw new IllegalArgumentException("Imię, Nazwisko, Email oraz hasło muszą zostać podane");
        }

        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.guest = false;
    }

    public User(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email musi zostać podany");
        }
        this.email = email;
        this.guest = true;
    }

    public void changeFromGuestToUser(String firstname, String lastname, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.guest = false;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String displayUserType() {
        String msg = "";
        if (guest) {
            msg = "Zakupy jako Guest";
        } else {
            msg = "Zakupy jako User";
        }

        return msg;
    }

    @Override
    public String toString() {
        return  "Firstname: " + firstname + '\n' +
                "Lastname: " + lastname + '\n' +
                "Email: " + email + '\n' +
                "Password: " + password + '\n' +
                "Status: " + displayUserType();

    }
}
