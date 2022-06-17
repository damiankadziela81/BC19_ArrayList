package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();

        food.add("sausage");
        food.add("pizza");
        food.add("bigos");

        food.set(2,"eggs");
        food.remove(0);

        for (String element: food
             ) {
            System.out.println(element);
        }



    }






}