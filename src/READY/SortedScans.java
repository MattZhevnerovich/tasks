package READY;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class SortedScans {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Введите желаемое количество чисел ");
        int n = keyboard.nextInt();


        int scans[] = new int[n];
        {
            for (int i = 0; i < n; i++) {
                scans[i] = keyboard.nextInt();

            }
        }
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < scans.length - 1; i++) {
                if (scans[i] > scans[i + 1]) {
                    isSorted = false;
                    temp = scans[i];
                    scans[i] = scans[i + 1];
                    scans[i + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(scans));
    }
}