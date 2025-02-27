package AccessModifier;

class Test {
    private int data = 40; // Private variable

    private void display() { // Private method
        System.out.println("Data: " + data);
    }

    // Public method to access private members
    public void showData() {
        display(); // Calling private method inside the class
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.showData(); // Indirectly accessing the private method
    }
}
