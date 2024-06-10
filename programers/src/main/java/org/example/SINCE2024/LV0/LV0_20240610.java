package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LV0_20240610 {

    public static void main(String[] args) {

        String solutioin1 = "abcabcadc";	//"d"
        String solutioin2 = "abdc";	        //"abcd"
        String solutioin3 = "hello";	    //"eho"

        int num1 = 3;	int totla1 = 12;    //[3, 4, 5]
        int num2 = 5;	int totla2 = 15;    //[1, 2, 3, 4, 5]
        int num3 = 4;	int totla3 = 14;    //[2, 3, 4, 5]
        int num4 = 5;	int totla4 = 5;     //[-1, 0, 1, 2, 3]
        int num5 = 0;	int totla5 = 0;     //[0]
        int num6 = 6;	int totla6 = 3;     //
        int num7 = 5;	int totla7 = 0;     //[-2,-1,0,1,2]



        printarr(solution1(num1, totla1));
        printarr(solution1(num2, totla2));
        printarr(solution1(num3, totla3));
        printarr(solution1(num4, totla4));
        printarr(solution1(num5, totla5));
        printarr(solution1(num6, totla6));
        printarr(solution1(num7, totla7));


    }

    public static void printarr(int[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*    https://school.programmers.co.kr/learn/courses/30/lessons/120923

        연속된 수의 합

        연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
        두 정수 num과 total이 주어집니다.
        연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.

        총합과 연속된 n개의 수의 합을 구하는 문제이다.
        다양한 케이스로 구하면 된다.
        1개 연속수, 총합 0
        5개 연속수, 총합 0
        의 테스트 케이스까지 수행해보자.

     */


    public static int[] solution1(int num, int total) {
//        int[] answer = new int[num];
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        int temp = 0;
        int status = 0;
        int endRange = 0;


        for (int i = 501; i > (-total-num); i--) {
            for(int k = i; k > i-num; k--){
                list.add(k);
                temp += k;
            }
            if(temp == total){
                status = i;
                break;
            }else{
                list = new ArrayList<>();
                temp = 0;
                status = 0;
            }
        }

        Collections.reverse(list);
        if(list.isEmpty()){
            list.add(0);
        }
        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

}
