package ru.mirea.practice.s21k0647.punkt78;

public class Magazine extends Printable {
    String data;

    Magazine() {
        //pust
    }

    Magazine(String name, String data) {
        super(name);
        this.data = data;
    }


    public void printMagazine(Printable [] printables) {
        System.out.println("Журналы: ");
        for (Printable x: printables) {
            if (x instanceof Magazine) {
                print(x);
            }
        }
    }

    @Override
    public void print(Printable m) {
        System.out.println("Название " + m.name + "\tДата выпуска " + ((Magazine) m).data);
    }
}
