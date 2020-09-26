package READY.StudentMainTask;

public class MainStudent {
    public static void main (String args[]) {
        Student st1 = new Student("1", "Ivanov", "Vasya", "Grigorievich",12, 5, 2000, "Minks", "123123", "FMO", 1, 12);
        Student st2 = new Student("2", "Ivanova", "Elena", "Vasilyevna",12, 11, 2001, "Minsk", "123456", "HimFac", 1, 4);
        Student st3 = new Student("3", "Pupkin", "Kirill", "Petrovich",8, 1, 1999, "Vitebsk", "090909", "FMO", 3, 7);
        Student st4 = new Student("4", "Shlyupkin", "Sergey", "Alexeevich",14, 5, 1998, "Grodno", "222222", "FilFac", 3, 17);
        Student st5 = new Student("5", "Gavrilova", "Yulia", "Gavrilovna", 26, 2, 2001, "Minsk", "987654", "EconomFac", 2, 4);
        Student st6 = new Student("6", "Lapenko", "Antonina", "Fantomasovna",1, 12, 2000, "Zhodino", "777777", "BioFac", 1, 10);
        Student[] list = new Student[6];
        list[0] = st1;
        list[1] = st2;
        list[2] = st3;
        list[3] = st4;
        list[4] = st5;
        list[5] = st6;

        System.out.println("Filtered By Faculty");
        filterByFaculty(list, "FMO");

        System.out.println("Filtered By Faculty And Year");
        filterByFacultyAndYear(list, "FMO", 3);

        System.out.println("Filtered By Birth Year");
        filterByBirthYear(list, 2000);

        System.out.println("Filtered By Group Number");
        filterByGroup(list, 4);
    }

    public static void filterByFaculty(Student spisok[], String faculty) {
        for(int i = 0; i < spisok.length; i++) {
            if (spisok[i].getFaculty() == faculty) {
                System.out.println(spisok[i].toString());
            }
        }
    }

    public static void filterByFacultyAndYear(Student spisok[], String faculty, int year) {
        for(int i = 0; i < spisok.length; i++) {
            if (spisok[i].getFaculty() == faculty && spisok[i].getYear() == year) {
                System.out.println(spisok[i].toString());
            }
        }
    }

    public static void filterByBirthYear(Student spisok[], int BirthYear) {
        for(int i = 0; i < spisok.length; i++) {
            if (spisok[i].getBirthYear() >= BirthYear) {
                System.out.println(spisok[i].toString());
            }
        }
    }

    public static void filterByGroup (Student spisok[], int group) {
        for(int i = 0; i < spisok.length; i++) {
            if (spisok[i].getGroupNumber() == group) {
                System.out.println(spisok[i].toString());
            }
        }
    }
}