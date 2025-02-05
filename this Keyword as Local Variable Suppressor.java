class Employee {
    String name;

    Employee(String name) {
        this.name = name;  // Resolves the conflict between parameter and instance variable
    }

    public void display() {
        System.out.println("Employee Name: " + this.name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Bob");
        emp.display();
    }
}
