package READY;

import java.util.Scanner;
import static java.lang.System.*;

public class Greetings {
    public static void main(String args[]) {
        out.print("Введите ваше имя");

        Scanner keyboard = new Scanner(in);
        String name = keyboard.next();

        out.println("Здравствуйте, " + name);

    }

}
