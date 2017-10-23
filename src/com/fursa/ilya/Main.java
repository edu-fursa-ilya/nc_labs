package com.fursa.ilya;

import com.fursa.ilya.buildings.Dwelling;
import com.fursa.ilya.buildings.DwellingFloor;
import com.fursa.ilya.buildings.Flat;

public class Main {

    public static void main(String[] args) {
        Flat[] flats = new Flat[10]; //массив квартир
        for (int i = 0; i < flats.length; i++) {
            flats[i] = new Flat(1 + i, 5 * i + 1);
        }

        for (int i = 0; i < flats.length; i++) {
            System.out.println("Квартира № " + i);
            System.out.println("Кол-во комнат в квартире: " + flats[i].getRooms());
            System.out.println("Общая площадь квартиры: " + flats[i].getSquare() + " кв.м");
            System.out.println();
        }

        DwellingFloor floor = new DwellingFloor(flats); //этаж
        System.out.println("Самая большая площадь: " + floor.getBestSpace().getSquare() + " кв.м");
        System.out.println("Квартира по индексу 5 имеет площадь: " + floor.getFlatByNumber(5).getSquare() + " кв.м");

        //удаление квартиры
        floor.delete(1);

        for (int i = 0; i < floor.getSize(); i++) {
            System.out.println("Квартира " + i);
        }

        DwellingFloor[] dwellingFloors = new DwellingFloor[2];
        dwellingFloors[0] = floor;
        dwellingFloors[1] = floor;
        Dwelling dwelling = new Dwelling(dwellingFloors);
        Flat[] sortedFlats = dwelling.getSortedFlatArray(1);

        System.out.println("Сортировка по площади: ");
        for (Flat flat: sortedFlats) {
            System.out.println(flat.getSquare());
        }


    }
}
