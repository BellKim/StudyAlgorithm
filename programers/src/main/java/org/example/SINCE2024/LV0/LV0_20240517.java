package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240517 {
    public static void main(String[] args) {
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        solution(3,numlist);

    }

    /* https://school.programmers.co.kr/learn/courses/30/lessons/120887
        k의 개수
        k의 갯수를 리턴하도록 하자.

     */

    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> integerList = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0){
                integerList.add(numlist[i]);
            }
        }
        answer = new int[integerList.size()];
        for(int i = 0; i < integerList.size(); i++) {
            answer[i] = integerList.get(i);
        }

        return answer;
    }


}
