package com.comarch.szkolenia.enumy;

public enum Console {
    PS4("Sony", "PlayStation 4", "Intel", "Nvidia"),
    PS5("Sony", "PlayStation 5", "Intel", "AMD"),
    XBOX_ONE("Microsoft", "Xbox One", "Intel", "AMD"),
    SWITCH("Nintendo", "Switch", "Intel", "AMD");

    String brand;
    String model;
    String cpu;
    String gpu;

    Console(String brand, String model, String cpu, String gpu) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;
    }
}
