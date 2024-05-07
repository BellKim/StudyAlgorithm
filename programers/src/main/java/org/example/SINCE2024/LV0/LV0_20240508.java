package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV0_20240508 {
    public static void main(String[] args) {

        String my_string1 = "hi12392";	//[1, 2, 2, 3, 9]
        String my_string2 = "p2o4i8gj2";	//[2, 2, 4, 8]
        String my_string3 = "abcde0";	//[0]

        printAll(solution1(my_string1));
        printAll(solution1(my_string2));
        printAll(solution1(my_string3));

    }


    public static void printAll(int[] test) {
        for (int val:test) {
            System.out.print(val + ", ");
        }
        System.out.println();
    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/120850
            문자열 정렬하기(1)
            문자열 my_string이 매개변수로 주어질 때,
            my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
            예시 >
            "hi12392"	[1, 2, 2, 3, 9]
            "p2o4i8gj2"	[2, 2, 4, 8]
            "abcde0"	[0]

         */
    public static int[] solution1(String my_string) {
        int[] answer = {};

        String[] getData = my_string.split("");
        List<String> stringList = new ArrayList<String>(Arrays.asList(getData));
        List<String> stringList2 = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

        for (String data: stringList) {
            if((int)data.charAt(0) >= 48 && (int)data.charAt(0) <= 57){
                stringList2.add(data);
            }
        }
        Collections.sort(stringList2);

        answer = new int[stringList2.size()];
        for (int k = 0; k < stringList2.size(); k++) {
            answer[k] = Integer.parseInt(stringList2.get(k));
        }
        return answer;
    }


    @Test
    public void test1(){
        System.out.println((int)"0".charAt(0));
        System.out.println((int)"9".charAt(0));
    }


}



