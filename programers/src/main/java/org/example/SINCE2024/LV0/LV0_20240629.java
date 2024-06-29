package org.example.SINCE2024.LV0;

import org.junit.Test;

public class LV0_20240629 {

    public static void main(String[] args) {

        int chicken1 = 100;	    //11
        int chicken2 = 1081;	//120

        System.out.println(solution1(chicken1));
        System.out.println(solution1(chicken2));


    }

    /*   https://school.programmers.co.kr/learn/courses/30/lessons/120884
        치킨쿠폰
        주문한 치킨수가 주어졌을때
        치킨 1마리당 쿠폰1개가 주어진다.
        쿠폰10개당 1마리가 추가구매 된다.

        치킨 주문시 서비스를 받는 치킨의 수를 리턴하여라.





     */

    public static int solution1(int chicken) {
        int answer = 0;

        int order = chicken;

        while (order >= 10) {
            int newChick = order / 10;
            int restChick = order % 10;

            order = newChick + restChick;

            answer += newChick;
        }

        return answer;

    }


    @Test
    public void test1() {


    }





}
