class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
    }

    public void passToAnotherMethod() {
        anotherMethod(this);
    }

    public void anotherMethod(Person p) {
        p.displayPersonDetails();
    }

    public static void main(String[] args) {
        Person p = new Person("John");
        p.passToAnotherMethod();
    }
}

