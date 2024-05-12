package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240512 {
    public static void main(String[] args) {
        String[] strlist1 = {"We", "are", "the", "world!"}; // [2, 3, 3, 6]
        String[] strlist2 = {"I", "Love", "Programmers."};  // [1, 4, 12]

        printarr(solution1(strlist1));
        printarr(solution1(strlist2));
    }
    public static void printarr(int[] arr){
        for(int s : arr){
            System.out.print(s + ", ");
        }
    }

    /* https://school.programmers.co.kr/learn/courses/30/lessons/120854
    배열 원소의 길이
    배열에 문자열이 있다. 배열 칸 마다 문자열의 길이를 숫자로 리턴해주면 되겠다.


     */
    public static int[] solution1(String[] strlist) {
        int[] answer = {};

        List<Integer> stringlist = new ArrayList<>();

        for(String s : strlist) {
            stringlist.add(s.length());
        }

        answer = new int[strlist.length];

        for (int k = 0; k < answer.length; k++) {
            answer[k] = stringlist.get(k);
        }

        return answer;
    }




}
