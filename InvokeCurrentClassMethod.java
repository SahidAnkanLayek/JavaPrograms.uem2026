class MyClass {
    public void displayMessage() {
        System.out.println("Hello, this is a message!");
    }

    public void callMethod() {
        // Using 'this' to call the current class method
        this.displayMessage();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.callMethod();
    }
}
