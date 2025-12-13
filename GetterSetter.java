public class GetterSetter {

    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount();

        myAcc.setUsername("Ritesh");
        System.out.println("Username is: " + myAcc.getUsername());

        myAcc.setPassword("Ritesh@123");
        // System.out.println("Password is: " + myAcc.getPassword()); // This line would cause an error due to private access
    }
}

// separate class
class BankAccount {

    private String username;
    private String password;

    // Getter
    public String getUsername() {
        return this.username;
    }

    // Setter
    public void setUsername(String username) {
        this.username = username;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for password
    private String getPassword() {
        return password;
    }
}
