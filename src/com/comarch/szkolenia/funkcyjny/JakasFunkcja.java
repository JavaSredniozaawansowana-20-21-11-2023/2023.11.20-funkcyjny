package com.comarch.szkolenia.funkcyjny;

@FunctionalInterface
public interface JakasFunkcja {
    int policz(int x1, int x2, int x3, int x4);
    default int policz2(int x1, int x2, int x3, int x4) {
        return 7;
    }

    default int policz3(int x1, int x2, int x3, int x4) {
        return 10;
    }
}
