package com.comarch.szkolenia.anonimowe;

import java.util.Comparator;

public class PorownywaczPoCenieRosnaco implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.price - o2.price;
    }
}
