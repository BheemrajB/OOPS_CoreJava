package AssignmentTelusko;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random random = new Random();
        System.out.println("random number from the machine has been guessed from 0-100");
        int target_no = random.nextInt(99)+1;
        int max_attempts=7, attempts=0;

        while(attempts<max_attempts){
            System.out.println("Guess a number of your choice");
            int guess_no=sc.nextInt();
        if(target_no==guess_no){
            System.out.println("Congratulations! you made it");
            break;
        }
        else if(guess_no>target_no) {
            System.out.println("Guess for the lesser number");
        }
        else if (guess_no<target_no){
            System.out.println("Guess for the higher number");
            }
            attempts=attempts+1;
            System.out.println("you only left with "+(max_attempts-attempts)+" attempts");

        }
        if(attempts == max_attempts){
                System.out.println("you failed to guess the number. PLEASE TRY AGAIN");
                System.out.println("number was " + target_no);
        }
        sc.close();

        }
    }


