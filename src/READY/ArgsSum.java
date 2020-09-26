package READY;

import java.io.*;

public class ArgsSum {
    public static void main(String args[]) {

        int sum = 0;
        for( int i = 0; i < args.length;  i++)
        {
            int LLL =Integer.parseInt(args[i]);
            sum = sum + LLL;
        }
            System.out.println("Сумма равна "+ sum);
    }
}