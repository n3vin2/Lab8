package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList() {
        /**
         * Creates a mocklist for my citylist
         */
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * Gets the size of the list
     * Increase the list by adding a new city
     * Check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    /**
     * Gets an empty list
     * Check if our current count is 0
     * Adds a city to the list
     * Check if our current count is increased to 1
     */
    @Test
    public void countCityTest() {
        list = MockCityList();
        assertEquals(list.getCount(), 0);
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), 1);
    }

    /**
     * Make a new city but don't add anything to the list
     * Check if the city is not in the list
     * Add the city into the list
     * Check if the city is now in the list
     *//*
    @Test
    public void testHasCities() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        assertFalse(list.hasCity(city));
        list.add(city);
        assertTrue(list.hasCity(city));
    }*/

    /**
     * Make a city but don't add anything to the list
     * Check if the city is not in the list
     * Add the city into the list
     * Check if the city is now in the list
     * Delete the city from the list
     * Check if the city no longer in the list
     * Try deleting the same city again from the list
     * Check that an illegal argument exception was thrown
     *//*
    @Test
    public void testDeleteCities() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.add(city);
        assertTrue(list.hasCity(city));
        list.delete(city);
        assertFalse(list.hasCity(city));
        assertThrows(IllegalArgumentException.class, () ->{
            list.delete(city);
        });
    }*/
}
