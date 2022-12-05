package ru.mirea.practice.s21k0709.p401.task9;

import java.util.ArrayList;
import java.util.List;

public abstract class FurnitureShop {
    public static void main(String[] args) {
        List<Furniture> furnitureList = new ArrayList<Furniture>();
        Furniture sofa1 = new Sofa("velvet",0,150,100);
        Furniture chair1 = new Chair("Velour",1,200,50);
        Furniture bed1 = new Bed("chenille",2,300,30);
        furnitureList.add(sofa1);
        furnitureList.add(chair1);
        furnitureList.add(bed1);
        for (Furniture i: furnitureList) {
            System.out.println(i);
        }
    }
}
