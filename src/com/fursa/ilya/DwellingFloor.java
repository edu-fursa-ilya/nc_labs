package com.fursa.ilya;

import java.util.List;

//lab 2 task 2
public class DwellingFloor {
    //массив квартир
    private List<Flat> flatList;
    private int flatCount;
    //конструктор принимает количество квартир
    public DwellingFloor(int flatCount) {
        this.flatCount = flatCount;
    }
    //конструктор принимает массив квартир
    public DwellingFloor(List<Flat> flatList) {
        this.flatList = flatList;
    }
    //метод получения кол-ва квартир
    public int getFlatCount() {
        return flatCount;
    }
    //получение массива квартир
    public List<Flat> getFlatList() {
        return flatList;
    }
    //общая площадь квартир этажа
    public double getCommonSquare(List<Flat> flats) {
        double square = 0;
        for (Flat flat: flats) {
            square += flat.getFlatSquare();
        }
        return square;
    }
    //получение объекта квартиры по ее номеру
    public Flat getFlatByNum(int num) {
        return flatList.get(num);
    }
    //квартира с самой большой площадью
    public Flat getBiggestFlat() {
        double max = flatList.get(0).getFlatSquare();
        int index = 0;

        for (int i = 0; i < flatList.size(); i++) {
            if(flatList.get(i).getFlatSquare() > max) {
                index = i;
            }
        }
        return flatList.get(index);
    }
    //удаление квартиры по номеру на этаже
    public void remove(int index) {
        flatList.remove(index);
    }
    //добавление квартиры по номеру
    public void add(int num) {
        flatList.add(num, new Flat());
    }
}
