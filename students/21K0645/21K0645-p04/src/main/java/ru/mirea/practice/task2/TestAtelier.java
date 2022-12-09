package ru.mirea.practice.task2;

/* 1) Создать интерфейсы MenClothing (мужская одежда) с методом
dressMan() (одеть мужчину) и WomenClothing (женская одежда) с
методом dressWomen() (одеть женщину).
2) Создать абстрактный класс Clothes (одежда), содержащий в качестве
переменных класса - размер одежды, стоимость, цвет.
3) Создать классы наследники класса Clothes – класс TShirt (футболка)
(реализует интерфейсы MenClothing и WomenClothing), класс Pants
(штаны) (реализует интерфейсы MenClothing и WomenClothing ), класс
Skirt (реализует интерфейсы WomenClothing), класс Tie (галстук )
(реализует интерфейсы MenClothing).
4) Создать массив, содержащий все типы одежды. Создать класс Atelier
(Ателье), содержащий методы dressWomen, dressMan, на вход которых
будет поступать массив, содержащий все типы одежды ( подумайте
какой тип будет у массива). Переопределите метод dressWomen() для
вывода на консоль всей информации о женской одежде. То же самое
сделайте для метода dressMan(). */

public final class TestAtelier {

    private TestAtelier() {
    }

    public static void main(String[] args) {
        Clothes[] clothes = { new Tshirt(Sizes.M, "white", 1500), new Pants(Sizes.L, "blue", 5000),
            new Skirt(Sizes.XXS, "yellow", 10000), new Tie(Sizes.S, "red", 3500)};
        Atelier atelier = new Atelier(clothes);
        atelier.dressWomen();
        atelier.dressMan();
    }
}

