package com.example.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingUtilityTest {

    @Test
    void gnomeSort() {
        Integer[] expected = { 1, 5, 6, 15, 20, 24, 214, 512 };

        Integer[] actual = { 20, 15, 24, 5, 1, 512, 214, 6 };
        SortingUtility.gnomeSort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    void gnomierSort() {
        Integer[] expected = { 1, 5, 6, 15, 20, 24, 214, 512 };

        Integer[] actual = { 20, 15, 24, 5, 1, 512, 214, 6 };
        SortingUtility.gnomierSort(actual);

        assertArrayEquals(expected, actual);
    }
}