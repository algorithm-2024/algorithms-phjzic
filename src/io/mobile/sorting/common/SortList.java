package io.mobile.sorting.common;

public abstract class SortList<E extends Comparable<E>> {
    protected E[] list;

    public SortList(E[] list) {
        this.list = list;
    }

    public abstract void sort();

    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    protected void swap(int i, int j) {
        E tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }

    // list[0...last] 중 가장 큰 수 list[k]를 찾는다.
    protected int getLargest(int last) {
        int largest = 0;

        for (int i = 1; i <= last; i++) {
            if (list[i].compareTo(list[largest]) > 0) {
                largest = i;
            }
        }
        return largest;
    }
}
