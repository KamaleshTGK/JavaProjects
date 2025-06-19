import java.util.*;
import java.util.List;

class ParkingVehicle {
    String numberPlate;
    int hours;

    ParkingVehicle(String numberPlate, int hours) {
        this.numberPlate = numberPlate;
        this.hours = hours;
    }

    double calculateFee() {
        return hours * 10; //base rate
    }

    void displayInfo() {
        System.out.println("Vehicle: " + numberPlate);
    }
}

class ParkingCar extends ParkingVehicle {
    ParkingCar(String numberPlate, int hours) {
        super(numberPlate, hours);
    }

    @Override
    double calculateFee() {
        return hours * 20;
    }
}

class ParkingBike extends ParkingVehicle {
    ParkingBike(String numberPlate, int hours) {
        super(numberPlate, hours);
    }

    @Override
    double calculateFee() {
        return hours * 5;
    }
}

class ParkingTruck extends ParkingVehicle{
    ParkingTruck(String numberPlate, int hours) {
        super(numberPlate, hours);
    }

    @Override
    double calculateFee() {
        return hours * 30;
    }
}

class Firewall {
    static List<String> blockedList = Arrays.asList("TN99X0001", "KA07AZ1234");

    static boolean isBlocked(String plate) {
        return blockedList.contains(plate);
    }
}
public class SmartParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vehicle type (Car/Bike/Truck): ");
        String type = sc.nextLine();

        System.out.print("Enter number plate: ");
        String plate = sc.nextLine();

        if(Firewall.isBlocked(plate)) {
            System.out.println("⚠\uFE0F Access Denied! Vehicle is blacklisted.");
            return;
        }

        System.out.print("Enter parked hours: ");
        int hours = sc.nextInt();

        ParkingVehicle v;

        switch(type.toLowerCase()) {
            case "car":
                v = new ParkingCar(plate, hours);
                break;

            case "bike":
                v = new ParkingBike(plate, hours);
                break;

            case"truck":
                v = new ParkingTruck(plate, hours);
                break;
            default:
                System.out.println("Invalid type");
                return;
        }

        v.displayInfo();
        System.out.println("Parking fee: ₹" + v.calculateFee());
    }
}
