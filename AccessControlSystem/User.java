public class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public void accessSystem() {
        System.out.println(name + " has basic access.");
    }
}
