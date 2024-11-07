package io.mobile.algorithm;

public class BinarySearch {

    public static void main(String[] args) {
        Integer[] list = new Integer[] { 10, 12, 13, 14, 17, 20, 25, 27, 30, 35, 40, 45, 47 };

        int index = binarySearch(list, 0, list.length - 1, 17);
        if (index == -1) {
            System.out.println("값이 없습니다.");
        } else {
            System.out.println("값은 " + index + " 위치에 있습니다.");
        }

        index = binarySearch(list, 0, list.length - 1, 21);
        if (index == -1) {
            System.out.println("값이 없습니다.");
        } else {
            System.out.println("값은 " + index + " 위치에 있습니다.");
        }

    }

    private static int binarySearch(Integer[] list, int low, int high, int x) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        System.out.println("binarySearch 호출 >> mid 값 : " + list[mid]);

        if (x == list[mid]) {
            return mid;
        } else if (x < list[mid]) {
            return binarySearch(list, low, mid - 1, x);
        } else {
            return binarySearch(list, mid + 1, high, x);
        }
    }
}
