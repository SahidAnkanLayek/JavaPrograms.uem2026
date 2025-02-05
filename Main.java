import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double volume() {
        return length * width * height;
    }
}

class Cube extends Box {
    Cube(double side) {
        super(side, side, side);
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create objects
        System.out.print("Enter the length, width, and height of the box: ");
        Box box = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Enter the side of the cube: ");
        Cube cube = new Cube(scanner.nextDouble());

        System.out.print("Enter the radius and height of the cylinder: ");
        Cylinder cylinder = new Cylinder(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Enter the radius and height of the cone: ");
        Cone cone = new Cone(scanner.nextDouble(), scanner.nextDouble());

        // Display results
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea() + ", Volume: " + box.volume());
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea() + ", Volume: " + cube.volume());
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea() + ", Volume: " + cylinder.volume());
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea() + ", Volume: " + cone.volume());
    }
}

