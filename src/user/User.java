package User;

public class User {
    //member variables
    private String user_id;
    private String user_name;
    private String password;

    //constructors
    public User() {
    }

    public User(String user_id, String user_name, String password) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
    }

    //setters

    public void setUserID(String user_id) {
        this.user_id = user_id;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public void setUserPassword(String password) {
        this.password = password;
    }
    //getters

    public String getUserID() {
        return user_id;
    }

    public String getUserName() {
        return user_name;
    }

    public String getUserPassword() {
        return password;
    }
}
