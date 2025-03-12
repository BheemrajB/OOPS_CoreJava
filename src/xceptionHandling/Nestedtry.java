package xceptionHandling;


class Calculator {
    void area(int l, int b) throws Exception {
        if (l < 0 || b < 0) {
            throw new Exception("Default message");
        }
        int result = l * b;
        System.out.println(result);
    }
        void meth1 ()
        {
            try {
                area(-10, 5);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public class Nestedtry {
        public static void main(String[] args) {
            Calculator obj = new Calculator();
            obj.meth1();
        }


}

