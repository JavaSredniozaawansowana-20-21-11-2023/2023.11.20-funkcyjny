package com.comarch.szkolenia.strumienie;

import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("BMW", "5"),
                new Car("Audi", "A5"),
                new Car("BMW", "3"),
                new Car("Audi", "A3"),
                new Car("Toyota", "Corolla")
        );

        /*List<Car> bmw = cars.stream()
                .filter(car -> car.getBrand().equals("BMW"))
                .toList();
        System.out.println(bmw);*/

        System.out.println(cars);

        cars.stream()
                .filter(car -> car.getBrand().equals("Audi"))
                .peek(car -> {
                    car.setBrand("BMW");
                    car.setModel("5");
                }).count();

        System.out.println(cars);

        cars.stream()
                .filter(car -> car.getBrand().equals("Audi"))
                .peek(car -> {
                    car.setBrand("BMW");
                    car.setModel("5");
                })
                .forEach(System.out::println);
                //.forEach(c -> System.out.println(c)); to samo !!
    }
}
