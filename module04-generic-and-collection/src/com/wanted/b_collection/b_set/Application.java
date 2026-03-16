package com.wanted.b_collection.b_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        /**
         * comment, Set 자료구조의 특징
         *  1. 요소의 저장 순서를 유지하지 않는다.
         *  2. 같은 요소의 중복저장을 허용하지 않는다. (null도 단 1개의 null만 들어간다.)
         */

        // Set을 구현한 HastSet 클래스를 가장 많이 사용한다.
        Set<String> hset = new HashSet<>();

        hset.add("java");
        hset.add("db");
        hset.add("servlet");
        hset.add("spring");
        // 중복 허용 금지
        hset.add("grafana");
        hset.add("grafana");

        System.out.println("hset = " + hset);

        // 값을 꺼내는 방법
        // Iterator 클래스의 iterator() 메소드 활용해서 연속 처리
        Iterator<String> iter = hset.iterator();

        // hasNext() : 순서가 없는 자료형에서 순회를 할 때 많이 쓰인다.
        // 다음 요소가 있는 지를 확인해주는 메소드로, 요소가 더 이상 없을 때까지 반복을 해준다.
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        // 반복은 가능하다.
//        for (String str : hset) {
//            System.out.println("str = " + str);
//        }
    }
}
