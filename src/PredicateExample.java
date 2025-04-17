

//        LinkedList ll= new LinkedList();
//        ll.add("ashokit");
//        ll.add(40);
//        ll.add(null);
//        ll.add("ashokit");
//        System.out.println(ll);
//        ll.add(0,"java");
//        System.out.println("ll = " + ll);
//        ll.set(0,"oracle");
//        System.out.println("ll = " + ll);
//        ll.removeLast();
//        System.out.println("ll = " + ll);
//        ll.addFirst("ashok");
//        System.out.println("ll = " + ll);


//        //VECTOR DEMO
//        Vector<String> v = new Vector<String>();
//        v.add("sachin");
//        v.add(new String("sehwag"));
//        v.add("kohli");
//        v.add("dhoni");
//        v.add("suresh");
//        System.out.println(v);
////        System.out.println(v.size());
//        Enumeration e = v.elements();
//        while (e.hasMoreElements()) {
//            System.out.print(e.nextElement() + " ");
//        }
//
//    }

        //Iterator using Arraylist(iterator can be implemented on lists and sets)
//        ArrayList<String> al = new ArrayList<String>();
//        al.add("ashok");
//        al.add("it");
//        al.add("java");
//        al.add("training");
//

import java.util.function.BiFunction;

////        Iterator<String> iterator=al.iterator();
////        while (iterator.hasNext())
////        {
////            String next = iterator.next();
////            System.out.println(next);
////        }
//        ListIterator<String> listIterator=al.listIterator();
//        while (listIterator.hasNext())
//        {
//            String next = listIterator.next();
//            System.out.println(next);
//        }
//
//    }



//interface Show {
//            void display();
//        }
//
//
//        public class Test implements Show {
//
//            public void display() {
//                System.out.println("Hello, this is the display method from the Show interface!");
//            }
//
//            public static void main(String[] args) {
//                Test obj = new Test();
//                obj.display();
//            }
//        }
//@FunctionalInterface
//interface Mul {
    // 1. Without parameter and without return type
//    void mul1();
//
    // 2. Without parameter but with return type
//    int mul2();
//
    // 3. With parameters but without return type
//    void mul3(int a, int b);

    // 4. With parameters and with return type
//    int mul4(int p, int q);
//}

//public class Test {
//    public static void main(String[] args) {
        // 1. Without parameters and without return type
//        Mul c1 = () -> {
//            int a = 10, b = 10;
//            int result = a * b;
//            System.out.println("Multiplication value is " + result);
//        };
//        c1.mul1();

        // 2. Without parameters but with return type
//        Mul c2 = () -> {
//            int a = 20, b = 20;
//            return a * b;
//        };
//        System.out.println("Returned multiplication value: " + c2.mul2());
//
        // 3. With parameters but without return type
//        Mul c3 = (a, b) -> System.out.println("Product of " + a + " and " + b + " is: " + (a * b));
//        c3.mul3(13, 12);

        // 4. With parameters and with return type



////        Mul c4 = (p, q) -> p * q;
////        System.out.println("Multiplication result: " + c4.mul4(10, 23));
//    }
//}

//public class PredicateExample
//{
//    public static void main(String[] args) {
//
//        BiFunction<Integer, Integer, String> biFunction = (a, b) -> {
//            if (a > b) {
//                return "a is greater than b";
//            };
//            System.out.println(biFunction.apply(10, 20));
//        };
//    }}
//
//import java.util.function.BiFunction;
//
//public class BiFunctionExample {
//    public static void main(String[] args) {
//
//
//        BiFunction<String, String, String> biFunction = (firstName, lastName) -> {
//            return firstName + lastName;
//        };
//        System.out.println(biFunction.apply("Anuj", "Sharma"));
//    }
//}
//import java.util.function.Consumer;
//
//public class ConsumerExample {
//    public static void main(String[] args) {
//
//
//        Consumer<String> printName = name -> System.out.println(name);
//
//
//        printName.accept("BheemRajBenne");


    }
}
