package com.comarch.szkolenia.funkcyjny;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Data2 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 5;
            }
        };
        UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 7;
            }
        };
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 40;
            }
        };

        boolean wynik = readProcessAndCheck(supplier, unaryOperator, predicate);
        System.out.println(wynik);


        boolean wynik2 = readProcessAndCheck(new Supplier<Integer>() {
                                                 @Override
                                                 public Integer get() {
                                                     return 10;
                                                 }
                                             },
                new UnaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer) {
                        return integer / 2;
                    }
                },
                new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer > 5;
                    }
                });

        System.out.println(wynik2);
    }

    public static boolean readProcessAndCheck(Supplier<Integer> supplier,
                                              UnaryOperator<Integer> processFunction,
                                              Predicate<Integer> testFunction) {
        return testFunction.test(processFunction.apply(supplier.get()));
    }
}
