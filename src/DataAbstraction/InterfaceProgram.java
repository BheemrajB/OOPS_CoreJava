package DataAbstraction;

interface Animal {   //its nothing but a functional interface
    void sound(); //public abstract is default keyword
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}