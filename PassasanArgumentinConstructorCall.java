class Box {
    int length, width, height;

    Box(int length, int width) {
        this(length, width, 10);  // Calling the other constructor with default height
    }

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height);
    }

    public static void main(String[] args) {
        Box b = new Box(10, 5);
        b.display();
    }
}
