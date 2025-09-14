package org.example;

public class Main {

    public static void main(String[] args) {

        Array array = new Array();

        int[] st = {10, 2, 3, -1, -5};

        System.out.println("Max: " + array.getMaxValue(st));
        System.out.println("Min: " + array.getMinValue(st));
        System.out.println("Average: " + array.getAverageValue(st));

    }
}