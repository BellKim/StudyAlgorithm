package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV0_20240718 {
    public static void main(String[] args) {
        String num_str1 = "123456789";  //	45
        String num_str2 = "1000000";    //	1

        System.out.println(solution1(num_str1));
        System.out.println(solution1(num_str2));
    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181849
        정수 문자열의 합
        문자열 정수의 합을 구하는 문제이다.
        String을 전부 1자씩 분리하여 문자열을 int형으로 변형한다.

     */
    public static int solution1(String num_str) {
        int answer = 0;

        String[] num = num_str.split("");
        for (int i = 0; i < num.length; i++) {
            answer += Integer.parseInt(num[i]);
        }

        return answer;
    }


}

