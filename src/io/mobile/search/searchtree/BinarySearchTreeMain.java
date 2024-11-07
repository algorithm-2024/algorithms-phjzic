package io.mobile.search.searchtree;

import java.util.Scanner;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // 30, 20, 25, 40, 10, 35
        while (true) {
            String input = scanner.next();
            if (input.equals("exit")) {
                break;
            }

            int value = Integer.parseInt(input);
            bst.insert(value);
        }

        bst.print();

        System.out.print("검색해서 삭제할 값은? ");
        int foundValue = scanner.nextInt();
        TreeNode<Integer> search = bst.search(foundValue);
        
        if (search == null) {
            System.out.println("없음");
        } else {
            System.out.println(search.item);
            bst.delete(foundValue);
            bst.print();
        }
        scanner.close();
    }
}
