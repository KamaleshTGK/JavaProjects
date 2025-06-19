//Interface for authentication

interface Auth {
    void login(String username, String password);
    void logout();
}

//Abstract class for user

abstract class User {
    String name;

    User(String name) {
        this.name = name;
    }

    void showProfile() {
        System.out.println("User: " + name);
    }

    abstract void roleInfo();
}

//Concrete class for Admin

class Admin extends User implements Auth {
    Admin(String name) {
        super(name);
    }

    public void login(String username, String password) {
        System.out.println("Admin " + username + "logged in.");
    }

    public void logout() {
        System.out.println("Admin logged out.");
    }

    void roleInfo() {
        System.out.println("Admin role: Full access to system.");
    }
}

//Concrete class for Guest

class Guest extends User implements Auth {
    Guest(String name) {
        super(name);
    }

    public void login(String username, String password) {
        System.out.println("Guest " + username + " logged in.");
    }

    public void logout() {
        System.out.println("Guest logged out.");
    }

    void roleInfo() {
        System.out.println("Guest role: Limited access to the system.");
    }
}

//Main driver class

public class MainAuth {
    public static void main(String[] args) {
        //Admin logun & Profile
        Admin admin = new Admin("Alice");
        admin.login("Alice", "pass1234");
        admin.showProfile();
        admin.roleInfo();
        admin.logout();

        System.out.println();

        //Guets login and profile
        Guest guest = new Guest("John");
        guest.login("John", "JohnTheDon123");
        guest.showProfile();
        guest.roleInfo();
        guest.logout();
    }
}
