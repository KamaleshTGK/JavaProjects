public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    @Override
    public void accessSystem() {
        super.accessSystem(); // call basic access
        System.out.println(name + " has ADMIN access: can manage users, logs, and settings.");
    }
}

