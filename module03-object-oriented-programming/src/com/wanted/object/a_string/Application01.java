package com.wanted.object.a_string;

public class Application01 {
    public static void main(String[] args) {

        /**
         * comment.
         * 자료형은 크게 2가지 종류가 있다.
         * 1. 기본 자료형 (ex : int, double, boolean etc..)
         * 2. 참조 자료형
         * 3. 사용자 정의의 자료형 :
         */

        /* comment, String에서 사용되는 다양한 메소드 */
        String str1 = "apple";

        // length() : 길이
        // charAt(index) : 문자열을 분자로 반환

        System.out.println(str1.length());


        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            System.out.println("charAt(" + i + ") : " + c);
        }
        String trimStr = "   java   "; // 앞 뒤 공백 3번씩
        System.out.println("공백 자르기 전 확인 : #" + trimStr + "#");
        System.out.println("공백 자르기 후 확인 : #" + trimStr.trim() + "#");
    }
}
