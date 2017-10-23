package com.fursa.ilya.buildings;

/**
 * Задание 3
 Создайте публичный класс Dwelling жилого здания, основанный на массиве этажей здания.
 Номер квартиры явно не хранится.
 Нумерация квартир в доме сквозная и начинается с нуля.
 Конструктор может принимать количество этажей и массив количества квартир по этажам.
 Конструктор может принимать массив этажей дома.
 Создайте метод получения общего количества этажей дома.
 Создайте метод получения общего количества квартир дома.
 Создайте метод получения общей площади квартир дома.
 Создайте метод получения общего количества комнат дома.
 Создайте метод получения массива этажей жилого дома.
 Создайте метод получения объекта этажа, по его номеру в доме.
 Создайте метод изменения этажа по его номеру в доме и ссылке на обновленный этаж.
 Создайте метод получения объекта квартиры по ее номеру в доме.
 Создайте метод изменения объекта квартиры по ее номеру в доме и ссылке типа квартиры.
 Создайте метод добавления квартиры в дом по будущему номеру квартиры в доме (т.е. в параметрах указывается номер, который должны иметь квартира после вставки) и ссылке на квартиру (количество этажей в доме при этом не увеличивается).
 Создайте метод удаления квартиры по ее номеру в доме.
 Создайте метод getBestSpace() получения самой большой по площади квартиры дома.
 Создайте метод получения отсортированного по убыванию площадей массива квартир.
 */
public class Dwelling {
    private DwellingFloor[] dwellingFloors;
    private int floorCount;

    public Dwelling(int floorCount, DwellingFloor[] dwellingFloors) {
        this.floorCount = floorCount;
        this.dwellingFloors = dwellingFloors;
    }

    public Dwelling(DwellingFloor[] dwellingFloors) {
        this.dwellingFloors = dwellingFloors;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public int getFlatCount() {
        int flatCount = 0;
        for (int i = 0; i < dwellingFloors.length; i++) {
            flatCount += dwellingFloors[i].getSize();
        }
        return flatCount;
    }

    public double getCommonSquare() {
        double square = 0;
        for (DwellingFloor floor: dwellingFloors) {
            square += floor.getCommonSquare();
        }
        return square;
    }

    public void delete(int flatNum, int floorNum) {
        getDwellingFloor(floorNum).delete(flatNum);
    }

    public int getRoomCount() {
        int roomCount = 0;
        for (DwellingFloor floor: dwellingFloors) {
            roomCount += floor.getCommonRoomCount();
        }
        return roomCount;
    }

    public DwellingFloor[] getDwellingFloors() {
        return dwellingFloors;
    }

    public DwellingFloor getDwellingFloor(int number) {
        return dwellingFloors[number];
    }

    public Flat[] getSortedFlatArray(int floorNumber) {
        return dwellingFloors[floorNumber].sortBySquareDesc();
    }
}
