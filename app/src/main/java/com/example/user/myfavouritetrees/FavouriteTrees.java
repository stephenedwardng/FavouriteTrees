package com.example.user.myfavouritetrees;

/**
 * Created by user on 05/07/2017.
 */


import java.util.ArrayList;

public class FavouriteTrees {

    private ArrayList<Tree> list;

    public FavouriteTrees() {
        list = new ArrayList<Tree>();
        list.add(new Tree(1, "Oak", 1994));
        list.add(new Tree(2, "Sycamore", 1972));
        list.add(new Tree(3, "Pine", 1974));
        list.add(new Tree(4, "Leafy", 2008));
        list.add(new Tree(5, "Woody", 1957));
        list.add(new Tree(6, "Barky", 1993));
        list.add(new Tree(7, "Green", 1994));
        list.add(new Tree(8, "Big", 2003));
        list.add(new Tree(9, "Little", 1966));
        list.add(new Tree(10, "Really tall", 1999));
        list.add(new Tree(11, "Douglas Fir", 2001));
        list.add(new Tree(12, "Twiggy", 1980));
    }

    public ArrayList<Tree> getList() {
        return new ArrayList<Tree>(list);
    }

}
