package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return list
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * Check if list has a city
     * Add that city to the list
     * Check if the city now exists
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        boolean hasCity = list.hasCity(city);
        assertTrue(hasCity);
    }

    /**
     * get the size of the list
     * decrease the list by deleting a city
     * check if our current size matches the initial size minus
     one
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        int listSize = list.getCount();
        list.deleteCity(city);
        assertEquals(list.getCount(),listSize - 1);
    }

}
