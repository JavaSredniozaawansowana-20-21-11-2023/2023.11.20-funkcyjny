package com.comarch.szkolenia.strumienie;

import java.util.List;
import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {

        Optional<String> nameBox = findName("dfghdfghdfgh");
        if(nameBox.isPresent()) {
            String name = nameBox.get();
            System.out.println(name);
        } else {
            System.out.println("Puste pudelko !!");
        }
    }

    public static Optional<String> findName(String pattern) {
        List<String> names = List.of("Janusz", "Wiesiek", "Janina", "Zbyszek");

        for(String s : names) {
            if(s.contains(pattern)) {
                return Optional.of(s);
            }
        }

        //System.out.println("Nie znaleziono !!");
        return Optional.empty();
    }
}
