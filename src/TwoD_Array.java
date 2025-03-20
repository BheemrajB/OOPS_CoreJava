public class TwoD_Array {

/*
 00 01  02
 1   2   3

 10  11 12
 4    5  6

 20   21  22
 7    8   9
 */


        public static void main(String[] args) {

            int a[][]= {{1,2,3},{4,5,6},{7,8,9}};

            for(int r=0;r< a.length;r++)
            {
                for(int c=0;c<a[r].length;c++)
                {
                    System.out.print(a[r][c]+" ");  //1(00)   2(01)   3(02)

                }
                System.out.println(" ");

            }



        }

    }

