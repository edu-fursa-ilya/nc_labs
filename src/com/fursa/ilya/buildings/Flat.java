package com.fursa.ilya.buildings;

/**
 * Задание 1 lb2
 1.Создайте публичный класс Flat квартиры жилого дома.
 2.Квартира не хранит свой номер.
 3.Разные квартиры могут иметь разную площадь.
 4.Разные квартиры могут иметь разное количество комнат.
 5.Конструктор по умолчанию создает квартиру из 2 комнат площадью 50 кв.м. (эти числа должны быть константами в классе)
 6.Конструктор может принимать площадь квартиры (создается квартира с 2 комнатами).
 7.Конструктор может принимать площадь квартиры и количество комнат.
 8.Создайте метод получения количества комнат в квартире.
 9.Создайте метод изменения количества комнат в квартире.
 10.Создайте метод получения площади квартиры.
 11.Создайте метод изменения площади квартиры.
 */
public class Flat {
    private static final int DEFAULT_ROOM_COUNT = 2;
    private static final double DEFAULT_SQUARE = 50.0;

    private int rooms;
    private double square;

    public Flat() {
        this.rooms = DEFAULT_ROOM_COUNT;
        this.square = DEFAULT_SQUARE;
    }

    public Flat(double square) {
        this.square = square;
        this.rooms = DEFAULT_ROOM_COUNT;
    }

    public Flat(int rooms) {
        this.rooms = rooms;
        this.square = DEFAULT_SQUARE;
    }

    public Flat(int rooms, double square) {
        this.rooms = rooms;
        this.square = square;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
