package com.fursa.ilya.building;

import java.util.List;

public class Dwelling {
    //массив этажей
    private DwellingFloor[] floorArr;
    //количество этажей
    private int floorCount;
    //конструктор принимающий количество этажей и массив квартир
    public Dwelling(int floorCount, DwellingFloor[] floorArr) {
        this.floorCount = floorCount;
        this.floorArr = floorArr;
    }
    //конструктор принимающий массив этажей дома
    public Dwelling(DwellingFloor[] floorArr) {
        this.floorArr = floorArr;
    }
    //общее количество этажей дома
    public int getFloorCount() {
        return floorCount;
    }
    //общее количество квартир дома
    public int getFlatCount() {
        int flatCount = 0;
        for (DwellingFloor floor: floorArr) {
            flatCount += floor.getFlatCount();
        }
        return flatCount;
    }
    //метод получения общей площади квартир дома
    public double getSquare() {
        double square = 0;
        for (int i = 0; i < floorArr.length; i++) {
            square += floorArr[i].getFlatArr()[i].getFlatSquare();
        }
        return square;
    }
    //метод получения общего количества комнат дома
    public int getRooms() {
        int rooms = 0;
        for (int i = 0; i < floorArr.length; i++) {
            rooms += floorArr[i].getFlatArr()[i].getRoomCount();
        }
        return rooms;
    }
    //получение массива этажей жилого дома
    public DwellingFloor[] getFloorArr() {
        return floorArr;
    }
    //получение объекта этажа по его номеру
    public DwellingFloor getDwellingFloor(int num) {
        return floorArr[num];
    }
    //получение самой большой квартиры дома
    public Flat getBiggestFlat() {
        double max = floorArr[0].getBiggestFlat().getFlatSquare();
        int index = 0;

        for (int i = 0; i < floorArr.length; i++) {
            if(floorArr[i].getBiggestFlat().getFlatSquare() > max) {
                index = i;
            }
        }
        return floorArr[index].getBiggestFlat();
    }
    //отсортированный по убыванию площадей, массив  квартир
    public Flat[] getSortedFlatList() {
        Flat[] newArr = DwellingFloor.getDescSortedArray();
        return newArr;
    }
}
