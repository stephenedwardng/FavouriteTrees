package com.example.user.myfavouritetrees;

/**
 * Created by user on 05/07/2017.
 */


import java.util.ArrayList;

public class FavouriteTrees {

    private ArrayList<Tree> list;

    public FavouriteTrees() {
        list = new ArrayList<Tree>();
        list.add(new Tree(1, "Oak", 10));
        list.add(new Tree(2, "Sycamore", 6));
        list.add(new Tree(3, "Pine", 8));
        list.add(new Tree(4, "Leafy", 7));
        list.add(new Tree(5, "Woody", 6));
        list.add(new Tree(6, "Barky", 4));
        list.add(new Tree(7, "Green", 5));
        list.add(new Tree(8, "Big", 90));
        list.add(new Tree(9, "Little", 2));
        list.add(new Tree(10, "Really tall", 100));
        list.add(new Tree(11, "Douglas Fir", 9));
        list.add(new Tree(12, "Twiggy", 3));
    }

    public ArrayList<Tree> getList() {
        return new ArrayList<Tree>(list);
    }

}
