package com.fursa.ilya;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Flat> flatList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            flatList.add(new Flat(i * 20, i + 1));
        }

        for (Flat flat: flatList) {
            System.out.println("Rooms = " + flat.getRoomCount());
            System.out.println("Square = " + flat.getFlatSquare());
        }

        DwellingFloor dwellingFloor = new DwellingFloor(flatList);
        System.out.println("Biggest flat has " + dwellingFloor.getBiggestFlat().getFlatSquare());
    }
}
