package READY;

import java.util.Scanner;
import static java.lang.System.*;


public class MaxAndMin {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Введите желаемое количество чисел ");
        int n = keyboard.nextInt();

        String max, min;
        int scans[] = new int[n];
        {
            for (int i = 0; i < n; i++) {
                scans[i] = keyboard.nextInt();
            }

            max = Integer.toString(scans[0]);
            min = Integer.toString(scans[0]);

            for(int i = 0; i < n; i++){
                String tmp = Integer.toString(scans[i]);
                if(tmp.length() > max.length()) { max = tmp; }
                if(tmp.length() < min.length()) { min = tmp; }

            }
            System.out.println("The biggest: " + max);
            System.out.println("The smallest: " + min);
        }
    }
}