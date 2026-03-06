package com.wanted.b_collection.a_list.run;

import com.wanted.b_collection.a_list.compare.AscendingPrice;
import com.wanted.b_collection.a_list.compare.AscendingTitle;
import com.wanted.b_collection.a_list.compare.DescendingPrice;
import com.wanted.b_collection.a_list.compare.DescendingTitle;
import com.wanted.b_collection.a_list.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        /**
         * comment, ArrayList 활용하기
         * 여러 권의 책을 하나의 변수로 관리하고 싶다.
         */

        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 15000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 18000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 45000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 40000));

        System.out.println("bookList = " + bookList);

        System.out.println("===============================================");

        // for-each
        for (BookDTO book : bookList) {
            System.out.println("book = " + book);
        }

        // 가격순으로 오름차순 정렬
        // compare 패키지 만들고, 그 안에 정렬 기능한 클래스 상속 구현 예정
        // 가격 오름차순 클래스 작성 완료
        bookList.sort(new AscendingPrice());
        System.out.println("=================== 가격순 오름차순 정렬 후 ===================");
        for (BookDTO book : bookList) {
            System.out.println("book = " + book);
        }

        // 가격 오름차순 정렬은 같이 해보았다.
        // 그러면 이제 코드가 어떤식으로 상호작용하는지 했으니
        // 가격 네림차순, 제목 정렬을 시도해보자. String 클래스의 compareTo() 메소드를 활용
        System.out.println("====================== 가격순 내림차순 정렬 후 =============================");
        bookList.sort(new DescendingPrice());
        for (BookDTO book1 : bookList) {
            System.out.println("book = " + book1);
        }

        // 제목 오름차순 정렬
        System.out.println("====================== 제목 오름차순 정렬 후 =============================");
        bookList.sort(new AscendingTitle());
        for (BookDTO book2 : bookList) {
            System.out.println("book = " + book2);
        }

        // 제목 내림차순 정렬
        System.out.println("====================== 제목 내림차순 정렬 후 =============================");
        bookList.sort(new DescendingTitle());
        for (BookDTO book3 : bookList) {
            System.out.println("book = " + book3);
        }
    }
}
