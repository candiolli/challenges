package com.candiolli.challenges;

import java.util.Arrays;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int o = n - 1;
        int k = m + n - 1;

        while (o >= 0) {
            if (i >= 0 && nums1[i] > nums2[o]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[o--];
            }
        }
    }


    public void merge4(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        System.out.println("MergeSortedArrays.main");
    }

}
