package org.example.SINCE2024.LV0;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV0_20240806 {
    public static void main(String[] args) {
//                date1	date2	result
        int[] date11 = {2021, 12, 28}; 	int[] date21 = {2021, 12, 29};   //	1
        int[] date12 = {1024, 10, 24};	int[] date22 = {1024, 10, 24};  //	0
        int[] date13 = {2022, 1, 1};	int[] date23 = {2021, 12, 31};  //	0


        System.out.println(solution1(date11, date21));
        System.out.println(solution1(date12, date22));
        System.out.println(solution1(date13, date23));

    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181838
        날짜 비교하기

            date1과 date2는 서로 년, 월, 일 의 데이터를 가지고 있다.

            서로의 날짜를 비교하여 만약 date1이 date2보다 앞서는 날짜라면 1을,
            아니면 0을 return 하는 solution 함수를 완성해 주세요.

            date1 이 date2보다 더 앞서는날짜면 1, 아니면 0



     */

    public static int solution1(int[] date1, int[] date2) {
        if (date1[0] < date2[0]) {
            return 1;
        } else if (date1[0] > date2[0]) {
            return 0;
        } else if (date1[1] < date2[1]) {
            return 1;
        } else if (date1[1] > date2[1]) {
            return 0;
        } else if (date1[2] < date2[2]) {
            return 1;
        } else {
            return 0;
        }
    }
}

