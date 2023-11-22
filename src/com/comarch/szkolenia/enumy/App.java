package com.comarch.szkolenia.enumy;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.position = Position.HIGH;

        Console console = Console.PS5;

        System.out.println(console.brand);
        System.out.println(console.model);
        System.out.println(console.cpu);
        System.out.println(console.gpu);

        console.brand = "Cos innego";

        Console console2 = Console.PS5;

        System.out.println(console2.brand);
    }
}
