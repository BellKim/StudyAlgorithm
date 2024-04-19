package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
중앙값 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/120811
중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
    ex>
    [1, 2, 7, 10, 11]   ans: 7
    [9, -1, 0]	        ans: 0

    홀수갯수로 들어오는 String배열을 순서대로 정렬후  (배열수/2) 해준 배열 번호를 넣어주면 중앙값이 나온다.
 */
public class LV0_20240420 {
    public static void main(String[] args) {
        //solution1
//        int[] arr1 = {1,2,7,10,11}; // 7
//        int[] arr2 = {9, -1, 0}; //0
//
//        System.out.println(solution(arr2));

        //solution2
//        String my_string1 = "jaron";
//        String my_string2 = "bread";
//
//        System.out.println(solution2(my_string2));


        //solution2
        String my_string3 = "hello";
        int n = 3;

        System.out.println(solution3(my_string3, n));


    }



    public static int solution(int[] array) {
        int answer = 0;
        List<Integer> intList = new ArrayList<Integer>();
        for (int val: array) {
            intList.add(val);
        }
        Collections.sort(intList);
        answer = intList.get((intList.size()/2));

        return answer;
    }



    /*
    문자열 뒤집기
    https://school.programmers.co.kr/learn/courses/30/lessons/120822
    문자열 my_string이 매개변수로 주어집니다.
    my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

     */

    public static String solution2(String my_string) {
        String answer = "";
        String[] value = my_string.split("");
        List<String> stringList = new ArrayList<String>();
        for (String val: value) {
            stringList.add(val);
        }
        StringBuilder sb = new StringBuilder();
        Collections.reverse(stringList);
        for (String sbs:stringList) {
            sb.append(sbs);
        }
        answer = sb.toString();
        return answer;
    }

    /*
    문자 반복 출력하기
    문자열 my_string과 정수 n이 매개변수로 주어질 때,
    my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

    myString3 : "hello"
    n : 3
    result : "hhheeellllllooo"

     */
    private static String solution3(String myString3, int n) {
        String answer = "";
        String[] value = myString3.split("");

        List<String> stringList = new ArrayList<String>(Arrays.asList(value));

        StringBuilder sb = new StringBuilder();
        for (String sbs:stringList) {
            for (int i = 0; i < n ; i++) {
                sb.append(sbs);
            }
        }
        answer = sb.toString();
        return answer;
    }
}
