package com.comarch.szkolenia.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,1,9,3,2,6,4,5,5,4,6,7,8,9);

        List<String> listaStringow = List.of("asdfassd", "asdfasd", "asdfasdf");

        OptionalDouble avgBox = listaStringow.stream()
                .mapToInt(s -> s.length())
                .average();

        if(avgBox.isPresent()) {
            System.out.println(avgBox.getAsDouble());
        }

    }
}
