package READY;

import static java.lang.System.*;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String args[]) {
        out.print("Сколько рандомных чисел?");
        Scanner keyboard = new Scanner(System.in);
        int howManyNumbers = keyboard.nextInt();

        int numsNums = 0;
        do {
        int randomNumber = new Random().nextInt(100)+1;
         out.println(randomNumber);
                numsNums++;}
        while (numsNums != howManyNumbers);
        keyboard.close();
    }
}