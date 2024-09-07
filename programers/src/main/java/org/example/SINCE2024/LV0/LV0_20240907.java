package org.example.SINCE2024.LV0;


import java.util.ArrayList;
import java.util.List;

public class LV0_20240907 {
    public static void main(String[] args) {
//        myString	result
        String myString1 = "ProgrammerS123";    //	"ProgrammerS"
        int n1 = 11;
        String myString2 = "He110W0r1d";  //	"He110"
        int n2 = 5;


        System.out.println(solution1(myString1, n1));
        System.out.println(solution1(myString2, n2));


    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181907
        문자열 앞의 숫자 n

        주어진 문자열에서 n번째 문자열까지 출력 하도록 하는 문자열을 리턴하라.

        1. substring을 이용하여 시작문자열과 마지막 문자열을 리턴하는방법
        2. split("") 으로 배열에 담은뒤 for문으로 문자를 가져와 리턴 하는 방법
        

     */
    public static String solution1(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(0,n);

        return answer;
    }





}

