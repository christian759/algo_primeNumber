package org.ceo1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static boolean primeNumber = true;
    public static List<Integer> primeList = new ArrayList<>();

    public static void main(String[] args) {
        primeList.add(2);
        Integer startVar = 2;
        Integer enderVar = 100000;
         looper(startVar, enderVar);
    }

    public static void looper(Integer start, Integer end){
        for(int i = start; i < end; i++) {
            for (int element : Main.primeList) {
                int rem = i % element;
                if (rem == 0) {
                    primeNumber = false;
                    break;
                } else {
                    primeNumber = true;
                }
            }

            if (primeNumber) {
                primeList.add(i);
                primeNumber = true;
            }
        }
        System.out.println(primeList);
    }
}

