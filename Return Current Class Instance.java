class MyClass {
    public MyClass getObject() {
        return this;  // Returns the current instance
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        MyClass returnedObj = obj.getObject();
        System.out.println("Object returned: " + returnedObj);
    }
}

