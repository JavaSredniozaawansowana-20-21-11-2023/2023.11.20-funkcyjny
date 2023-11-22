package com.comarch.szkolenia.anonimowe;

public class Car /*implements Comparable<Car>*/ {
    public String brand;
    public String model;
    public int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    private void prywantaMetoda() {
        System.out.println("cos");
    }

    /*@Override
    public int compareTo(Car o) {
        return -(this.price - o.price);
    }*/
}
