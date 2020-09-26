package READY;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortedFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("C:\\1\\tasks\\filetosort.txt"));
        ArrayList<String> list = new ArrayList<>();

        while (scan.hasNext()) {
            list.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(list);

        list.sort(Comparator.comparing(String::length).reversed());
        list.forEach( line -> {
            System.out.println(line.toString()); });
    }
}

