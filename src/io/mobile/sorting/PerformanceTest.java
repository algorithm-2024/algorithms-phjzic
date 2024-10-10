package io.mobile.sorting;

import io.mobile.sorting.advanced.HeapSort;
import io.mobile.sorting.advanced.MergeSort;
import io.mobile.sorting.advanced.QuickSort;
import io.mobile.sorting.advanced.ShellSort;
import io.mobile.sorting.basic.BubbleSort;
import io.mobile.sorting.basic.InsertionSort;
import io.mobile.sorting.basic.SelectionSort;
import io.mobile.sorting.common.SortList;
import io.mobile.sorting.special.RadixSort;

import java.util.Random;

public class PerformanceTest { // 성능 측정
    public static final int SIZE = 50_000;
    public static void main(String[] args) {
        Integer[] selectionList = new Integer[SIZE];
        Integer[] bubbleList = new Integer[SIZE];
        Integer[] insertionList = new Integer[SIZE];
        Integer[] mergeList = new Integer[SIZE];
        Integer[] quickList = new Integer[SIZE];
        Integer[] heapList = new Integer[SIZE];
        Integer[] shellList = new Integer[SIZE];
        Integer[] radixList = new Integer[SIZE];
        Random random = new Random();
        for (int i = 0; i <  SIZE; i++) {
            int value = random.nextInt(10_000);
            selectionList[i] = value;
            bubbleList[i] = value;
            insertionList[i] = value;
            mergeList[i] = value;
            quickList[i] = value;
            heapList[i] = value;
            shellList[i] = value;
            radixList[i] = value;
        }

        SortList<Integer> selectionSort = new SelectionSort<>(selectionList);
        long startTime = System.nanoTime();
        selectionSort.sort();
        long endTime = System.nanoTime();
        System.out.println("선택정렬 시간: " + ((endTime - startTime) / 1000_000.0) + " ms");

//        SortList<Integer> bubbleSort = new BubbleSort<>(bubbleList);
//        startTime = System.nanoTime();
//        bubbleSort.sort();
//        endTime = System.nanoTime();
//        System.out.println("버블정렬 시간: " + ((endTime - startTime) / 1000_000.0) + " ms");

        SortList<Integer> insertionSort = new InsertionSort<>(insertionList);
        startTime = System.nanoTime();
        insertionSort.sort();
        endTime = System.nanoTime();
        System.out.println("삽입정렬 시간: " + ((endTime - startTime) / 1000_000.0) + " ms");

        SortList<Integer> mergeSort = new MergeSort<>(mergeList);
        startTime = System.nanoTime();
        mergeSort.sort();
        endTime = System.nanoTime();
        System.out.println("병합정렬 시간: " + ((endTime - startTime) / 1000_000.0) + " ms");

        SortList<Integer> quickSort = new QuickSort<>(quickList);
        startTime = System.nanoTime();
        quickSort.sort();
        endTime = System.nanoTime();
        System.out.println("퀵정렬 시간: " + ((endTime - startTime) / 1000_000.0) + " ms");

        SortList<Integer> heapSort = new HeapSort<>(heapList);
        startTime = System.nanoTime();
        heapSort.sort();
        endTime = System.nanoTime();
        System.out.println("힙정렬 시간: " + ((endTime - startTime) / 1000_000.0) + " ms");

        SortList<Integer> shellSort = new ShellSort<>(shellList);
        startTime = System.nanoTime();
        shellSort.sort();
        endTime = System.nanoTime();
        System.out.println("셸정렬 시간: " + ((endTime - startTime) / 1000_000.0) + " ms");

        SortList<Integer> radixSort = new RadixSort(radixList);
        startTime = System.nanoTime();
        radixSort.sort();
        endTime = System.nanoTime();
        System.out.println("기수정렬 시간: " + ((endTime - startTime) / 1000_000.0) + " ms");
        // sort.print();
    }
}
