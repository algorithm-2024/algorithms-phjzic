package io.mobile.sorting;

import io.mobile.sorting.advanced.MergeSort;
import io.mobile.sorting.advanced.QuickSort;
import io.mobile.sorting.basic.BubbleSort;
import io.mobile.sorting.basic.InsertionSort;
import io.mobile.sorting.basic.SelectionSort;
import io.mobile.sorting.common.SortList;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] list = { 8, 31, 48, 73, 3, 65, 20, 29, 11, 5 };
//        SortList<Integer> sort = new SelectionSort<>(list);
//        SortList<Integer> sort = new BubbleSort<>(list);
//        SortList<Integer> sort = new InsertionSort<>(list);
//        SortList<Integer> sort = new MergeSort<>(list);
        SortList<Integer> sort = new QuickSort<>(list);
        sort.sort();
        sort.print();

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        String[] stringList = { "8", "31", "48", "73", "3", "65", "20", "29", "11", "5" };
//        SortList<String> stringSort = new SelectionSort<>(stringList);
//        SortList<String> stringSort = new BubbleSort<>(stringList);
//        SortList<String> stringSort = new InsertionSort<>(stringList);
//        SortList<String> stringSort = new MergeSort<>(stringList);
        SortList<String> stringSort = new QuickSort<>(stringList);
        stringSort.sort();
        stringSort.print();

        Double[] doubleList = { 0.8, 0.31, 0.48, 0.73, 0.3, 0.65, 0.20, 0.29, 0.11, 0.5 };
//        SortList<Double> doubleSort = new SelectionSort<>(doubleList);
//        SortList<Double> doubleSort = new BubbleSort<>(doubleList);
//        SortList<Double> doubleSort = new InsertionSort<>(doubleList);
//        SortList<Double> doubleSort = new MergeSort<>(doubleList);
        SortList<Double> doubleSort = new QuickSort<>(doubleList);
        doubleSort.sort();
        doubleSort.print();
    }
}
