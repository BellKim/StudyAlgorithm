package org.example.BEFORE2024.programmers_lv0;

import java.util.Arrays;

public class example007 {

// programmers.co.kr/learn/courses/30/lessons/120821 배열 뒤집기
//    https://school.programmers.co.kr/learn/courses/30/lessons/120821

    /*
     *  Num _list 를 주어주고 역순의 배열을  Return 하도록 solution 함수를 완성.
     */

    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5};
//        int [] array = {1, 1, 1, 1, 1, 2};
//        int [] array = {1, 0, 1, 1, 1, 3, 5};

        int res [] = solution(array);
        System.out.println("res = " + res);
    }

    static int[] solution(int[] num_list) {
        int answer [] = null;

        answer = num_list;
        Arrays.sort(answer);

        for(int arr : answer){
            System.out.println(arr);
        }



//        Arrays.sort( Collections.reverseOrder());
//        for(int arr : answer){
//            System.out.println(arr);
//        }



        return answer;
    }

}
