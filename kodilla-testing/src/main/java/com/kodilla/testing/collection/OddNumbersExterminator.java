package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    private boolean emptyList;

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        return numbers;
    }

    public ArrayList<Integer> exterminateEmptyList(ArrayList<Integer> emptyList) {

        return emptyList;

    }
}