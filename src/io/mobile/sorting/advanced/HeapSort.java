package io.mobile.sorting.advanced;

import io.mobile.sorting.common.SortList;

public class HeapSort<E extends Comparable<E>> extends SortList<E> {
    public HeapSort(E[] list) {
        super(list);
    }

    @Override
    public void sort() {
        buildHeap();
        for (int i = list.length - 1; i >= 1; i--) {
            list[i] = deleteMax(i + 1);
        }

    }

    private E deleteMax(int n) {
        E max = list[0];
        list[0] = list[n - 1];
        percolateDown(n - 1, 0);
        return max;
    }

    private void buildHeap() {
        for (int i = (list.length - 2) / 2; i >= 0; i--) {
            percolateDown(list.length, i);
        }
    }

    private void percolateDown(int n, int k) {
        int child = 2 * k + 1;
        int right = 2 * k + 2;

        if (child <= n - 1) {
            // 왼쪽, 오른쪽 자식 중 큰 것으로 child로
            if (right <= n - 1 &&
                list[child].compareTo(list[right]) < 0) {
                child = right;
            }

            // 가장 큰 값이 서브 트리의 루트가 되도록 ....
            if (list[k].compareTo(list[child]) < 0) {
                swap(k, child);
                percolateDown(n, child);
            }
        }
    }
}
