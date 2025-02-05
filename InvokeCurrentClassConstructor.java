class MyClass {
    int x, y;

    // Default constructor
    MyClass() {
        this(10, 20);  // Calls the parameterized constructor
    }

    // Parameterized constructor
    MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
