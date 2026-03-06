package com.wanted.b_collection.a_list.compare;

import com.wanted.b_collection.a_list.dto.BookDTO;

import java.util.Comparator;

public class DescendingTitle implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        // o1 문자열의 아스킷 코드 - o2 문자열의 아스킷 코드
        // 1. o2 > o1 => 양수, 즉 스왑
        // 2. o2 < o1 => 음수, 즉 그대로
        // 3. o1 == o2면, 그대로
        return o2.getTitle().compareTo(o1.getTitle());

    }
}
