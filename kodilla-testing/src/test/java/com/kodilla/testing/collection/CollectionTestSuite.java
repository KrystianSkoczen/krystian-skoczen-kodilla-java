package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CollectionTestSuite {
    OddNumbersExterminator exterminator;

    @Before
    public void setup (){
        exterminator = new OddNumbersExterminator();
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> result = exterminator.exterminateEmptyList(emptyList);
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
     /**    normalList.add(5);
            normalList.add(3);
            normalList.add(7);
            normalList.add(2);
            normalList.add(4);
            normalList.add(6);
            normalList.add(8); **/
        //When
        ArrayList<Integer> resulted = exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(4, resulted.size());
    }
}