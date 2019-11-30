package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("green");
        color.add("brown");
        color.add("black");
        color.remove("green");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
    }
}
