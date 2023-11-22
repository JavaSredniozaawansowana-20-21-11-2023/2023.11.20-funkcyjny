package com.comarch.szkolenia.strumienie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,7,4,7,2,7,2,6,9,3,3,1,6,9,3,5);

        //chce miec nowa liste
        //bez duplikatow
        //tylko liczby > 3
        //tylko liczby < 7

        /*List<Integer> result = new ArrayList<>();
        for(int element : list) {
            if(element > 3 && element < 7) {
                if(!result.contains(element)) {
                    result.add(element);
                }
            }
        }

        System.out.println(result);*/

        List<Integer> result = list.stream()
                .distinct()
                .filter(x -> x > 3)
                .filter(x -> x < 7)
                .toList();

        System.out.println(result);
    }
}
