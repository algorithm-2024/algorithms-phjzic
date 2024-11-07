package io.mobile.selection2;

import java.util.Arrays;

public class Selection {

    private void swap(Integer[] list, int i, int j) {
        Integer tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }

    private int partition(Integer[] list, int p, int r) {
        return partition(list, p, r, list[r]);
    }

    private int partition(Integer[] list, int p, int r, Integer x) {
        int i = p - 1;

        for (int j = p; j <= r - 1; j++) {
            if (list[j] < x) {
                swap(list, ++i, j);
            }
        }
        swap(list, i + 1, r);

        System.out.println(Arrays.toString(list));
        return i + 1;
    }

    private Integer select(Integer[] list, int p, int r, int i) {
        if (p == r)
            return list[p];
        int q = partition(list, p, r);
        int k = q - p + 1;
        if (i < k)
            return select(list, p, q - 1, i);
        else if (i == k)
            return list[q];
        else
            return select(list, q + 1, r, i - k);
    }

    public Integer select(Integer[] list, int i) {
        return select(list, 0, list.length - 1, i);
    }

    private Integer linearSelect(Integer[] list, int p, int r, int i) {
        if (r - p + 1 <= 5) {
            return select(list, p, r, i);
        }

        Integer[] middles = new Integer[(r - p + 1) / 5 + 1];
        int l = 0;
        for (int j = p + 2; j <= r; j += 5) {
            middles[l++] = list[j];
        }

        Integer middle = linearSelect(middles, 0, l - 1, l / 2);
        int q = partition(list, p, r, middle);
        int k = q - p + 1;
        if (i < k)
            return linearSelect(list, p, q - 1, i);
        else if (i == k)
            return list[q];
        else
            return linearSelect(list, q + 1, r, i - k);
    }

    public Integer linearSelect(Integer[] list, int i) {
        return linearSelect(list, 0, list.length - 1, i);
    }

}
