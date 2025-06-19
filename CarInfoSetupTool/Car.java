class Car2{
    String color;
    int speed;

    Car2(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void drive() {
        System.out.println("🚗 Driving a " + color + " car at " + speed + " km/h!");
    }
}
