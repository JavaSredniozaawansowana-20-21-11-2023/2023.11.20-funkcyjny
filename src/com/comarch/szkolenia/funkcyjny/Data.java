package com.comarch.szkolenia.funkcyjny;

public class Data {
    public static void main(String[] args) {
        readProcessAndCheck();
        readProcessAndCheck2();
        readProcessAndCheck3();
    }

    public static boolean readProcessAndCheck() {
        System.out.println("wczytuje dane z bazy");
        int x = 5;

        System.out.println("Przeliczam dane");
        int wynik = x * 7;

        System.out.println("Sprawdzam wyniki");
        return wynik > 33;
    }

    public static boolean readProcessAndCheck2() {
        System.out.println("wczytuje dane z z pliku");
        int x = 5;

        System.out.println("Przeliczam dane");
        int wynik = x * 7;

        System.out.println("Sprawdzam wyniki");
        return wynik > 33;
    }

    public static boolean readProcessAndCheck3() {
        System.out.println("wczytuje dane z z pliku");
        int x = 5;

        System.out.println("Przeliczam dane");
        int wynik = x * 7;

        System.out.println("Sprawdzam wyniki inaczej");
        return wynik > 40;
    }
}
