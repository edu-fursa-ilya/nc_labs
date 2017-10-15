package com.fursa.ilya.building;

import java.util.List;

//lab 2 task 2
public class DwellingFloor {
    //массив квартир
    private static Flat[] flatArr;
    private int flatCount;
    //конструктор принимает количество квартир
    public DwellingFloor(int flatCount) {
        this.flatCount = flatCount;
    }
    //конструктор принимает массив квартир
    public DwellingFloor(Flat[] flatArr) {
        this.flatArr = flatArr;
    }
    //метод получения кол-ва квартир
    public int getFlatCount() {
        return flatCount;
    }
    //получение массива квартир
    public static Flat[] getFlatArr() {
        return flatArr;
    }
    //общая площадь квартир этажа
    public double getCommonSquare(Flat[] flats) {
        double square = 0;
        for (Flat flat: flats) {
            square += flat.getFlatSquare();
        }
        return square;
    }
    //получение объекта квартиры по ее номеру
    public Flat getFlatByNum(int num) {
        return flatArr[num];
    }
    //квартира с самой большой площадью
    public Flat getBiggestFlat() {
        double max = flatArr[0].getFlatSquare();
        int index = 0;

        for (int i = 0; i < flatArr.length; i++) {
            if(flatArr[i].getFlatSquare() > max) {
                index = i;
            }
        }
        return flatArr[index];
    }
    //удаление квартиры по номеру на этаже
    public void remove(int index) {
      flatArr[index] = null;
    }
    //добавление квартиры по номеру
    public void add(int num) {
        Flat[] newFlatArr = new Flat[flatArr.length + 1];

    }
    //сортировка по убыванию площади
    public static Flat[] getDescSortedArray() {
        Flat[] flatArr = getFlatArr();
        for (int i = 0; i < flatArr.length; i++) {
            for (int j = 0; j < flatArr.length; j++) {
                if (flatArr[i].getFlatSquare() > flatArr[j].getFlatSquare()) {
                    Flat tmp = flatArr[i];
                    flatArr[i] = flatArr[j];
                    flatArr[j] = tmp;
                }
            }
        }

        return flatArr;
    }
}
