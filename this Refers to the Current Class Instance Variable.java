class Person {
    String name;

    // Constructor with parameter and instance variable with same name
    Person(String name) {
        this.name = name;  // 'this' is used to refer to the instance variable
    }

    public void display() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        Person p = new Person("Alice");
        p.display();
    }
}
