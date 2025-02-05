


class Vehicle {
    String brand;
    int year;

    // Default constructor
    Vehicle() {
        brand = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Toyota", 2020);

        v1.display();
        v2.display();
    }
}
