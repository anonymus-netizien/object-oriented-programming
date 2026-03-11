package com.java.oop.array;

public class Main {
    static void main(String[] args) {

        int[] ids = new int[5];
        ids[0] = 101;
        ids[1] = 102;
        ids[2] = 103;
        ids[3] = 104;
        ids[4] = 105;
        System.out.println(ids[4]);

        // for loop
        for(int i = 0; i < ids.length; i++){
            System.out.println(ids[i]);
        }

        for (int id: ids){
            System.out.println(id);
        }

        System.out.println();
        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f'};

        //for indexed loop
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        System.out.println();
        // for each loop
        for (char ch : chs) {
            System.out.println(ch);
        }
    }
}
