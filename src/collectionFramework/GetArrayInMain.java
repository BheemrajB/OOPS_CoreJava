package collectionFramework;

import java.util.Arrays;

class GetArrayInMain {


        public static int[] getArray() {
            return new int[]{12, 56, 78, 4, 51};
        }

        public static void main(String[] args) {

            int[] numbers = getArray();

                System.out.print( "Elements in the array are = " + Arrays.toString(numbers));

        }
    }

