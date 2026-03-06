package com.wanted.b_collection.b_set;

import java.util.Set;
import java.util.TreeSet;

public class Application02 {
    public static void main(String[] args) {

        /**
         * comment. Tree set
         * TreeSet 을 활용하여 로또 추첨기 만들기
         * TreeSet 자료구자노느 Set 처럼 중복을 허룡하지 않는다.
         * 일반적인 Set과 달리 데이터가 정렬된다. -> 순서 보장된 상태
         * 이진 검색 트리 구조로 저장을 한다.
         * 따라서 데이터를 추가하거나, 검색 혹은 제거하는 기본 동작이 매우 빠르다.
         */

        Set<String> stringSet = new TreeSet<>();
        stringSet.add("a");
        stringSet.add("c");
        stringSet.add("d");
        // set의 기본적인 특징인, 중복 허용 X
        // 단, 데이터 정렬이 추가 되었다.
        stringSet.add("d");
        stringSet.add("b");

        System.out.println("stringSet = " + stringSet);

        // 1, 17, 24, 30, 37, 40
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }
        System.out.println("lotto = " + lotto);
    }
}
