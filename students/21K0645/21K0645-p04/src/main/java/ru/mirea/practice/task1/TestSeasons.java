package ru.mirea.practice.task1;

/* Создать перечисление, содержащее названия времен года.
1) Создать переменную, содержащую ваше любимое время года и
распечатать всю информацию о нем.
2) Создать метод, который принимает на вход переменную созданного
вами enum типа. Если значение равно Лето, выводим на консоль “Я
люблю лето” и так далее. Используем оператор switch.
3) Перечисление должно содержать переменную, содержащую среднюю
температуру в каждом времени года.
4) Добавить конструктор, принимающий на вход среднюю температуру.
5) Создать метод getDescription, возвращающий строку “Холодное время
года”. Переопределить метод getDescription - для константы Лето
метод должен возвращать “Теплое время года”.
6) В цикле распечатать все времена года, среднюю температуру и
описание времени года */

public final class TestSeasons {

    private TestSeasons() {
    }

    private static void ilike(Seasons seasons) {

        System.out.print("I like ");

        switch (seasons) {
            case Winter :
                System.out.println("winter");
                break;
            case Spring :
                System.out.println("spring");
                break;
            case Summer :
                System.out.println("summer");
                break;
            case Autumn :
                System.out.println("autumn");
                break;
            default :
                break;
        }
    }

    public static void main(String[] args) {

        Seasons summer = Seasons.Summer;
        System.out.println(summer.getInfo());

        TestSeasons.ilike(summer);

        for (Seasons season : Seasons.values()) {
            System.out.println(season.getInfo());
        }
    }


}
