package io.mobile.sorting.special;

import io.mobile.sorting.common.SortList;

public class RadixSort extends SortList<Integer> {
    public RadixSort(Integer[] list) {
        super(list);
    }

    private void sortRadix(int exp) {
        int[] count = new int[10];   // 해당 자리의 0 ~ 9의 값이 각각 몇개 있는지 카운트 합니다.
        int[] result = new int[list.length];

        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        for (int j = 0; j < list.length; j++) {
            int index = (list[j] / exp) % 10;  // 해당 자리수의 값을 추출
            count[index]++;
        }

        // 0 -> 3, 1 -> 5, 2 -> 2
        for (int i = 1; i < 10; i++) {   // 누적 카운트
            count[i] = count[i] + count[i - 1];
        }

        for (int j = list.length - 1; j >= 0; j--) {
            int index = (list[j] / exp) % 10;  // 해당 자리수의 값을 추출, 1234
            result[count[index]-1] = list[j];
            count[index]--;
        }

        for (int j = 0; j < list.length; j++) {
            list[j] = result[j];
        }
    }

    @Override
    public void sort() {
        int maxIndex = getLargest(list.length - 1);
        int max = list[maxIndex];

        for (int exp = 1; max / exp > 0; exp *= 10) {
            sortRadix(exp);
        }
    }
}
