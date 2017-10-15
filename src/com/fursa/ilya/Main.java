package com.fursa.ilya;


import com.fursa.ilya.building.Dwelling;
import com.fursa.ilya.building.DwellingFloor;
import com.fursa.ilya.building.Flat;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Flat[] flatArr = new Flat[11];
        for (int i = 0; i < flatArr.length; i++) {
            flatArr[i] = new Flat(10 * 2 + i, i + 1);
        }

        DwellingFloor dwellingFloor = new DwellingFloor(flatArr);

        System.out.println("Вывод массива квартир: ");
        for (Flat flat: flatArr) {
            System.out.println("Площадь квартиры: " + flat.getFlatSquare() + " метров");
            System.out.println("Количество комнат: " + flat.getRoomCount());
        }

        DwellingFloor[] dwellingFloorArr = new DwellingFloor[11];
        for(int i = 0; i < dwellingFloorArr.length; i++) {
            dwellingFloorArr[i] = dwellingFloor;
        }

        Dwelling dwelling = new Dwelling(dwellingFloorArr);
        Flat[] sortedFlats = dwelling.getSortedFlatList();
        System.out.println("Вывод отсортированных квартир: ");
        for (int i = 0; i < sortedFlats.length; i++) {
            System.out.println("Площадь: " + sortedFlats[i].getFlatSquare());
        }

        System.out.println("Общая площадь квартир: " + dwellingFloor.getCommonSquare(flatArr));
    }
}
