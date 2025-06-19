public class SecuritySystem {

    public void login(User user) {
        System.out.println("Logging in " + user.name + "...");
        user.accessSystem();
        System.out.println("------------------------------------------------");
    }
}
