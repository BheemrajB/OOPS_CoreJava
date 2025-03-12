package collectionFramework;

class MaxElement{
    void sortingElement (){
        int[] numbers = {12, 56, 78, 4, 51};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
    }
}
public class MaximumElement {
    public static void main(String[] args) {


   MaxElement temp = new MaxElement();
   temp.sortingElement();

}
}


//    public static int getLargest(int[] array) {
//        int largest = array[0];
//        for (int index = 1; index < array.length; index++) {
//            if (array[index] > largest) {
//                largest = array[index];
//            }
//        }
//        return largest;
//    }
//
//    public static void main(String[] args) {
//        int[] values = {23, 89, 15, 67, 92};
//        int maxValue = getLargest(values);
//        System.out.println("The largest number is: " + maxValue);
//    }
//}
//
