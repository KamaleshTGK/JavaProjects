import java.util.Scanner;

class Car{
    String color;
    int speed;

    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void drive() {
        System.out.println("🚗 Driving a " + color + " car at " + speed + " km/h!");
    }
}

public class CarInfoSetupTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\uD83D\uDEE0\uFE0F Car Setup Tool \uD83D\uDEE0\uFE0F");
        System.out.print("Enter the color of the car; ");
        String color = sc.nextLine();

        System.out.print("Enter the speed of the car: ");
        int speed = sc.nextInt();

        Car userCar = new Car(color,speed);

        System.out.println("\\n✅ Your car has been set up!");
        userCar.drive();

        sc.close();

    }
}
