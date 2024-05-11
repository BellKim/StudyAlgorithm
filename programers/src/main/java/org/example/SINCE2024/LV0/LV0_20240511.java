package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240511 {

    public static void main(String[] args) {
        String my_string1 = "1 2 Z 3";//	4
        String my_string2 = "10 20 30 40";//	100
        String my_string3 = "10 Z 20 Z 1";//	1
        String my_string4 = "10 Z 20 Z"	 ;//   0
        String my_string5 = "-1 -2 -3 Z";//	-3
        System.out.println(solution1(my_string1));
        System.out.println(solution1(my_string2));
        System.out.println(solution1(my_string3));
        System.out.println(solution1(my_string4));
        System.out.println(solution1(my_string5));


    }

    /*

    https://school.programmers.co.kr/learn/courses/30/lessons/120853
    컨트롤제트
    숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
    문자열에 있는 숫자를 차례대로 더하려고 합니다.
    이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
    숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.


     */


    public static int solution1(String s) {
        int answer = 0;
        String[] stringArr= s.split(" ");

        int chkBefore = 0;
        int result = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if(stringArr[i].equals("Z")){
                result -= Integer.parseInt(stringArr[i-1]);
            }else{
                result += Integer.parseInt(stringArr[i]);
            }
        }
        answer = result;
        return answer;
    }

    @Test
    public void test1() {
        int i = -6;
        i -= -3;
        System.out.println(i);
    }



}







