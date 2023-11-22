package com.comarch.szkolenia.anonimowe;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Janusz");
        lista.add("Zbyszek");
        lista.add("Wiesiek");
        lista.add("Adam");
        lista.add("Weronika");

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 150000));
        cars.add(new Car("Kia", "Ceed", 130000));
        cars.add(new Car("Audi", "A5", 500000));
        cars.add(new Car("BMW", "5", 400000));

        System.out.println(cars);

        /*Collections.sort(cars, new Comparator<Car>(){
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price;
            }
        });*/

        Collections.sort(cars, (car1, car2) -> car1.price - car2.price);

        System.out.println(cars);

        /*Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return -o1.brand.compareTo(o2.brand);
            }
        });*/

        Collections.sort(cars, (car1, car2) -> -car1.brand.compareTo(car2.brand));

        System.out.println(cars);

        Interfejs obiektKlasyAnonimowej = new Interfejs() {
            @Override
            public void m1() {
                System.out.println("m1 !!!");
            }

            @Override
            public void m2() {
                System.out.println("m2 !!!");
            }

            @Override
            public void m3() {
                System.out.println("m3 !!!");
            }
        };

        obiektKlasyAnonimowej.m1();
        obiektKlasyAnonimowej.m2();
        obiektKlasyAnonimowej.m3();

        KlasaAbstrakcyjna obiektKlasyAbstrakcyjnej = new KlasaAbstrakcyjna() {
            @Override
            void metodaAbstrakcyjna() {
                System.out.println("Metoda abstrakcyjna !!!");
            }
        };

        obiektKlasyAbstrakcyjnej.metodaAbstrakcyjna();
        obiektKlasyAbstrakcyjnej.zwyklaMetoda();

        Car car = new Car("marka", "model", 100) {
            @Override
            public String toString() {
                return "$TempCar{" +
                        "brand='" + brand + '\'' +
                        '}';
            }
        };

        System.out.println(car);
    }
}
