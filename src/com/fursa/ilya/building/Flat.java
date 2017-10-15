package com.fursa.ilya.building;
//lab 2 task 1
public class Flat {
    //площадь и количество комнат по умолчанию
    private static final double DEFAULT_SQUARE = 50.0;
    private static final int DEFAULT_ROOMS_COUNT = 2;

    private double square; //площадь meters
    private int room; //количество комнат
    //конструктор по умолчанию
    public Flat() {
        this.room = DEFAULT_ROOMS_COUNT;
        this.square = DEFAULT_SQUARE;
    }
    //конструктор может принимать площадь
    public Flat(double square) {
        this.room = 2;
        this.square = square;
    }
    //может принимать площадь и количество комнат
    public Flat(double square, int room) {
        this.square = square;
        this.room = room;
    }
    //получение количества комнат в квартире
    public int getRoomCount() {
        return room;
    }
    //изменение количества комнат в квартире
    public void setRoomCount(int count) {
        this.room = count;
    }
    //получение площади квартиры
    public double getFlatSquare() {
        return square;
    }
    //изменение площади
    public void setSquare(double square) {
        this.square = square;
    }
}
