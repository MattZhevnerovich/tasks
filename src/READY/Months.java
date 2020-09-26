package READY;

import static java.lang.System.*;
import java.util.Random;
import java.util.Scanner;

public class Months {
    public static void main (String args[]) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Введите номер месяца: ");
        int month = keyboard.nextInt();

        switch (month)  {
            case 1:
                out.println("Январь");
                break;
            case 2:
                out.println("Февраль");
                break;
            case 3:
                out.println("Март");
                break;
            case 4:
                out.println("Апрель");
                break;
            case 5:
                out.println("Май");
                break;
            case 6:
                out.println("Июнь");
                break;
            case 7:
                out.println("Июль");
                break;
            case 8:
                out.println("Август");
                break;
            case 9:
                out.println("Сентябрь");
                break;
            case 10:
                out.println("Октябрь");
                break;
            case 11:
                out.println("Ноябрь");
                break;
            case 12:
                out.println("Декабрь");
                break;
            default:
                out.print("Такого месяца нет!");

        keyboard.close();
        }

    }
}