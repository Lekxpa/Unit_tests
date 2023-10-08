public class User {

    String name;
    String password;
    Boolean admin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean admin) {
        this.name = name;
        this.password = password;
        this.admin = admin;
    }

    public boolean authenticate(String name, String password) {
        if(name.equals(name) && password.equals(password)) {
            return isAuthenticate = true;
        } else {
            return isAuthenticate = false;
        }
    }
    public void logout(){
        isAuthenticate = false;
    }
}