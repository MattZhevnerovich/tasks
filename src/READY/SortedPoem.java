package READY;

import READY.Flowerbed.Flower;

import java.util.ArrayList;
import java.util.Comparator;

public class SortedPoem {
    public static void main (String[] args){
        ArrayList<String > poem = new ArrayList<>();
        poem.add("Бремя любви тяжело, если даже несут его двое.");
        poem.add("Нашу с тобою любовь нынче несу я один.");
        poem.add("Долю мою и твою берегу я ревниво и свято,");
        poem.add("Но для кого и зачем - сам я сказать не могу.");

        sortByLength(poem);
    }

    public static void sortByLength(ArrayList<String> poem){
        poem.sort(Comparator.comparing(String::length).reversed());
        poem.forEach(line-> {
            System.out.println(line.toString());
        });
    }

}
