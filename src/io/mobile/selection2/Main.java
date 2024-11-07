package io.mobile.selection2;

public class Main {

    public static void main(String[] args) {

        Integer[] intList = { 8, 31, 48, 73, 3, 65, 20, 29, 11, 15, 90, 17, 25, 38, 40, 55, 77, 99, 7, 64 };
        io.mobile.selection2.Selection selection = new io.mobile.selection2.Selection();
        System.out.println("10nd smallest value is " + selection.select(intList, 10));
        System.out.println("10nd smallest value is " + selection.linearSelect(intList, 10));

    }

}
