package Scope;

class ScopeExample {

    // Instance variable (Instance Scope)
    int instanceVar = 20;

    // Static variable (Static Scope)
    static int staticVar = 30;

    void localScopeExample() {
        // Local variable (Local Scope)
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);
    }

    void blockScopeExample() {
        if (true) {
            // Block variable (Block Scope)
            int blockVar = 50;
            System.out.println("Block Variable: " + blockVar);
        }
        // blockVar is not accessible here (out of scope)
    }

    public static void main(String[] args) {
        ScopeExample obj = new ScopeExample();

        // Accessing Local Scope
        obj.localScopeExample();

        // Accessing Instance Variable
        System.out.println("Instance Variable: " + obj.instanceVar);

        // Accessing Static Variable
        System.out.println("Static Variable: " + ScopeExample.staticVar);

        // Accessing Block Scope
        obj.blockScopeExample();
    }
}

