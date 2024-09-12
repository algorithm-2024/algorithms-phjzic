package io.mobile.sorting.basic;

import io.mobile.sorting.common.SortList;

public class SelectionSort<E extends Comparable<E>> extends SortList<E> {

    public SelectionSort(E[] list) {
        super(list);
    }

    @Override
    public void sort() {
        for (int last = list.length - 1; last > 0; last --) {
            int k = getLargest(last);
            swap(k, last);
        }
    }

    // list[0...last] 중 가장 큰 수 list[k]를 찾는다.
    private int getLargest(int last) {
        int largest = 0;

        for (int i = 1; i <= last; i++) {
            if (list[i].compareTo(list[largest]) > 0) {
                largest = i;
            }
        }
        return largest;
    }
}
