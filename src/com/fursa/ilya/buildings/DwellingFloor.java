package com.fursa.ilya.buildings;

/**
 * Задание 2 lb2
 * Создайте публичный класс DwellingFloor этажа жилого здания, основанный на массиве квартир.
 * Номер квартиры явно не хранится.
 * Нумерация квартир на этаже сквозная и начинается с нуля.
 * Конструктор может принимать количество квартир на этаже.
 * Конструктор может принимать массив квартир этажа.
 * Создайте метод получения количества квартир на этаже.
 * Создайте метод получения общей площади квартир этажа.
 * Создайте метод получения общего количества комнат этажа.
 * Создайте метод получения массива квартир этажа.
 * Создайте метод получения объекта квартиры, по ее номеру на этаже.
 * Создайте метод изменения квартиры по ее номеру на этаже и ссылке на новую квартиру.
 * Создайте метод добавления новой квартиры на этаже по будущему номеру квартиры (т.е. в параметрах указывается номер,
 * который должны иметь квартира после вставки) и ссылке на квартиру.
 * Создайте метод удаления квартиры по ее номеру на этаже.
 * Создайте метод getBestSpace() получения самой большой по площади квартиры этажа.
 */
public class DwellingFloor {
    private Flat[] flats;
    private int flatsCount;

    public DwellingFloor(int flatsCount) {
        this.flatsCount = flatsCount;
    }

    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public int getFlatsCount() {
        return flatsCount;
    }

    public double getCommonSquare() {
        double square = 0;
        for (Flat flat : flats) {
            square += flat.getSquare();
        }
        return square;
    }

    public int getCommonRoomCount() {
        int count = 0;
        for (Flat flat : flats) {
            count += flat.getRooms();
        }
        return count;
    }

    public Flat getFlatByNumber(int number) {
        return flats[number];
    }

    public int getSize() {
        return flats.length;
    }

    public Flat getBestSpace() {
        double max = flats[0].getSquare();
        int index = 0;

        for (int i = 1; i < flats.length; i++) {
            if (flats[i].getSquare() > max) {
                index = i;
            }
        }
        return flats[index];
    }

    public void change(int number, Flat flat) {
        flats[number] = flat;
    }

    public void delete(int number) {
        Flat[] tmp = flats;
        flats = new Flat[tmp.length - 1];
        System.arraycopy(tmp, 0, flats, 0, number);
        int amountElemAfterIndex = tmp.length - number - 1;
        System.arraycopy(tmp, number + 1, flats, number, amountElemAfterIndex);
    }

    public Flat[] sortBySquareDesc() {
        Flat[] flatArr = getFlats();
        for (int i = 0; i < flatArr.length; i++) {
            for (int j = 0; j < flatArr.length; j++) {
                if (flatArr[i].getSquare() > flatArr[j].getSquare()) {
                    Flat tmp = flatArr[i];
                    flatArr[i] = flatArr[j];
                    flatArr[j] = tmp;
                }
            }
        }
        return flatArr;

    }


}
