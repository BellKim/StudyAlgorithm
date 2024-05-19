package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LV0_20240519 {
    public static void main(String[] args) {
        int[] array1 = {3, 10, 28};
        int n1  = 20;
        int[] array2 = {10, 11, 12};
        int n2  = 13;
//        int[] array3 = {1, 4, 2, 1};
        int[] array3 = {1, 2, 4, 1};
        int n3  = 3;        //2

        System.out.println(solution1(array1,n1));
        System.out.println(solution1(array2,n2));
        System.out.println(solution1(array3,n3));


    }

    /* https://school.programmers.co.kr/learn/courses/30/lessons/120890#
        가까운 수
        주어진 배열과 주어진 수가 있다.
        주어진수 n 에서 제일 가까운수를 배열에서 찾으면 된다.
        단, 가까운수가 2개가 나온경우 배열에서 주어진수가 낮은수를 정답으로 산출해낸다.
        예시> 4와 2가 주어지고, 가까운수 n 이 3일경우 4와 2 모두 숫자와의 차이는 1이다.
        그러나 2가 더 낮으므로, 정답은 2가 된다.
     */

    public static int solution1(int[] array, int n) {
        int answer = 0;

        List<Integer> originList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            originList.add(array[i]);
        }
        Collections.sort(originList);
        Collections.reverse(originList);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < originList.size(); i++) {
            list.add(Math.abs(originList.get(i)-n));
        }
        int temp = 1000000;
        for (int k = 0; k < list.size(); k++) {
            if(list.get(k) <= temp){
                temp = list.get(k);
                answer = originList.get(k);
            }
        }
        return answer;
    }

}
