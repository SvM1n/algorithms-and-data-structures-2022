package ru.mirea.practice.n1to3;

import java.util.ArrayList;

abstract class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            arr.add(i);
        }
        Listing listing = new Listing(arr);
        ListingIterator iterator = (ListingIterator) listing.iterator();
        iterator.invert();
    }
}
