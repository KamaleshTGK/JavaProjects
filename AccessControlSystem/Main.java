public class Main {
    public static void main(String[] args) {
        SecuritySystem system = new SecuritySystem();

        User regularUser = new User("Alice");
        Admin adminUser = new Admin("Bob");
        Guest guestUser = new Guest("Charlie");

        system.login(regularUser);
        system.login(adminUser);
        system.login(guestUser);
    }
}
