package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BfReader {
    public static void main(String[] args) {//throws IOException {
        System.out.println("Enter a Number");
//        int num = System.in.read();
//        System.out.println(num); //Prints the ASCII value

          //USING BUFFERED STREAM

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//        int num = Integer.parseInt(bf.readLine());

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);
//        bf.close();

    }
}
