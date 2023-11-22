package com.comarch.szkolenia.funkcyjny;

import com.comarch.szkolenia.anonimowe.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> "Liczba: " + i;

        System.out.println(function.apply(7));
        System.out.println(function.apply(15));
        System.out.println(function.apply(30));

        BiFunction<Integer, String, Boolean> biFunction = (i, s) -> s.length() >= i;

        System.out.println(biFunction.apply(5, "Mateusz"));
        System.out.println(biFunction.apply(10, "Pie"));
        System.out.println(biFunction.apply(7, "Komputer"));

        UnaryOperator<Integer> unaryOperator = i -> i*10;

        System.out.println(unaryOperator.apply(7));
        System.out.println(unaryOperator.apply(10));
        System.out.println(unaryOperator.apply(16));

        Predicate<String> predicate = s -> s.length() > 8;

        System.out.println(predicate.test("Janusz"));
        System.out.println(predicate.test("Klawiatura"));
        System.out.println(predicate.test("Aga"));

        Supplier<Car> supplier = () -> new Car("defaul", "default", 0);

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Consumer<Car> consumer = car -> System.out.println(car.brand);

        consumer.accept(new Car("Fiat", "126p", 10000));
        consumer.accept(supplier.get());

        Function<Integer, String> repeater = input -> {
            String result = "";
            for(int i = 0; i < input; i++) {
                result = result + input;
            }
            return result;
        };

        System.out.println(repeater.apply(5));
        System.out.println(repeater.apply(3));
        System.out.println(repeater.apply(20));

        JakasFunkcja jakasFunkcja = (x1, x2, x3, x4) -> ( (x1 * x2) + (x3 * x4) );

        System.out.println(jakasFunkcja.policz(1,2,3,4));
        System.out.println(jakasFunkcja.policz(3,4,5,6));
        System.out.println(jakasFunkcja.policz(5,6,7,8));
        System.out.println(jakasFunkcja.policz(1,5,8,9));

        jakasFunkcja.policz2(3,3,3,3);
    }
}
