package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LV0_20240506 {

    public static void main(String[] args) {
        String my_string1= "hello"; int num1_1 = 1; int num2_1 = 2;
        String my_string2= "I love you"; int num1_2 = 3; int num2_2 = 6;
//        String my_string3= ""; int num1_3 = 1; int num2_3 = 2;
//        String my_string4= ""; int num1_4 = 1; int num2_4 = 2;

        System.out.println(solution1(my_string1, num1_1, num2_1));
        System.out.println(solution1(my_string2, num1_2, num2_2));
//        System.out.println(solution1(my_string1, num1_1, num2_1));
//        System.out.println(solution1(my_string1, num1_1, num2_1));



    }

    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120895
    인텍스 바꾸기
    num1번째의 문자열과 num2번째의 문자열을 바꾸는 프로그램을 만들어라.
     */

    public static String solution1(String my_string, int num1, int num2) {
        String answer = "";
        String[] getData = my_string.split("");
        List<String> stringList = new ArrayList<String>(Arrays.asList(getData));
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < stringList.size(); k++) {
            if(k==num1) {
                sb.append(stringList.get(num2));
            }else if (k == num2) {
                sb.append(stringList.get(num1));
            }else {
                sb.append(stringList.get(k));
            }
        }
        answer = sb.toString();
        return answer;
    }
}
