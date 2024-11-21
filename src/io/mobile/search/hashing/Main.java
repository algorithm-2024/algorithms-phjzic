package io.mobile.search.hashing;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(13);
        hashTable.put(new Record("20221111", "홍길동", "모바일융합공학과", "010-1234-1234"));
        hashTable.put(new Record("20221112", "홍길순", "모바일융합공학과", "010-3212-5678"));

        Record search = hashTable.search("20221111");
        System.out.println(search);

        hashTable.delete("20221111");
        search = hashTable.search("20221111");
        System.out.println(search);
    }
}
