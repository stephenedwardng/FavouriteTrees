package com.example.user.myfavouritetrees;

/**
 * Created by user on 05/07/2017.
 */

public class Tree {

    private int ranking;
    private String name;
    private int age;

    public Tree(Integer ranking, String name, Integer age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

}
