package io.mobile.sorting.advanced;

import io.mobile.sorting.common.SortList;

public class ShellMain {
    public static void main(String[] args) {
        Integer[] list = { 8, 31, 48, 73, 3, 65, 20, 29, 11, 5 };
        SortList<Integer> sort = new ShellSort<>(list);
        sort.sort();
        sort.print();
    }
}
