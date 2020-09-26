package READY.Flowerbed;

import java.util.*;
import java.util.concurrent.Flow;

public class UseFlower {

    public static void main (String[] args){
        ArrayList<Flower> list = new ArrayList<>();
        list.add (new BlackRose(7.05, true, 15.00));
        list.add (new BlackRose(7.15, true,  15.20));
        list.add (new PinkRose(6.50, false, 14.00));
        list.add (new OrangeTulip(7.04, true, 15.80));
        list.add (new RedTulip(7.50, true, 16.00));
        list.add (new RedTulip(8.00, false, 19.50));
        list.add (new RedTulip(7.50, false, 18.00 ));
        list.add (new WhiteTulip(8.40, true, 17.80));
        list.add (new YellowTulip(6.80, false, 15.00));
        list.add (new YellowTulip(7.10, true, 15.90));

        sortByFreshnessAndPrint(list);
        printByStemLengthDiapason(list);

    }
    public static void sortByFreshnessAndPrint(ArrayList<Flower> list) {
        list.sort(Comparator.comparing(Flower::isFreshness).reversed());
        list.forEach(flower -> {
            System.out.println(flower.toString());
        });
    }

    public static void printByStemLengthDiapason(ArrayList<Flower> list) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter min value");
        double minValue = keyboard.nextDouble();
        System.out.println("Enter max value");
        double maxValue = keyboard.nextDouble();

        list.forEach(flower -> {
            if (minValue <= (flower).getStemLength() && maxValue >= (flower).getStemLength())
                System.out.println(flower.toString());
        });
        keyboard.close();
    }
}

