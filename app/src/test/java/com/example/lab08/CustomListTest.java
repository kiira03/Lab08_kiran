package com.example.lab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

        private CustomList customList;
        private City edmonton;
        private City calgary;

        @BeforeEach
        void setUp() {
            customList = new CustomList();
            edmonton = new City("Edmonton", "Alberta");
            calgary = new City("Calgary", "Alberta");
        }

        @Test
        void testHasCity() {
            customList.addCity(edmonton);
            assertTrue(customList.hasCity(edmonton));
            assertFalse(customList.hasCity(calgary));
        }

        @Test
        void testDeleteCity() {
            customList.addCity(edmonton);
            customList.deleteCity(edmonton); // Not implemented yet - Failed Test
            assertFalse(customList.hasCity(edmonton));
        }

        @Test
        void testCountCities() {
            customList.addCity(edmonton);
            customList.addCity(calgary);
            assertEquals(2, customList.countCities());

        }

    }
