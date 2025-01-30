package com.candiolli.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortedArraysTest {

    MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

    @BeforeEach
    void setUp() {
    }

    @Test
    public void test() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        mergeSortedArrays.merge(nums1, m, nums2, n);

        int[] arrayTest = new int[]{1,2,2,3,5,6};
        Assertions.assertArrayEquals(nums1, arrayTest);
    }
}