public class Guest extends User {

    public Guest(String name) {
        super(name);
    }

    @Override
    public void accessSystem() {
        System.out.println(name + " has GUEST access: view-only permissions.");
    }
}
