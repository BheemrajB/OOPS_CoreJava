package collectionFramework;

public class ArraysExample {

        public static void main(String[] args) {

            int a[][]= {{4,56,7,9},{11,12,5,7}};

            for(int j=0;j<=a.length;j++)
            {
                for(int c=0;c<=a[j].length;c++)
                {
                    System.out.print(a[j][c]+" ");  //1(00)   2(01)   3(02)

                }
                System.out.println(" ");

            }
        }

    }


