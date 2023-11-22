package com.comarch.szkolenia.strumienie;

import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);

        int wynik = list.stream()
                .reduce(1, (elemet, acc) -> elemet * acc);
        System.out.println(wynik);
    }
}
