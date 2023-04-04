public class Vehicle {

        public void drive() {
            System.out.println("The vehicle is Driving");
        }
    }

    class Car extends Vehicle {
        public void drive() {
            System.out.println("The car is Driving");
        }
    }

    class UpcastingDemo {
        public static void main(String[] args) {
            Car car1 = new Car();
            Vehicle vehicle1 = car1;
            vehicle1.drive();
        }
    }


