package org.example.SINCE2024.LV0;

import java.util.*;

public class LV0_20240509 {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 17;
        int n3 = 420;

        print11(solution1(n1));
        System.out.println();
        print11(solution1(n2));
        System.out.println();
        print11(solution1(n3));



    }

    public static void print11( int[] arr) {

        for (int data: arr) {
            System.out.print(data + ", ");
        }

    }

    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120852
    소인수분해
    소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
    예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
    따라서 12의 소인수는 2와 3입니다.
    자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

    12	[2, 3]
    17	[17]
    420	[2, 3, 5, 7]
     */


    public static int[] solution1(int n) {
        int[] answer = {};
        List<Integer> integerList = new ArrayList<>();

        int val = n;
        for (int i = 2; i <= n; i++) {
            while(n%i == 0){
                n = n/i;
                integerList.add(i);
            }
        }

        return integerList.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .toArray();
    }



    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/120848#
        팩토리얼

     */

    public static int solution2(int n) {
        int answer = 1;

        int resPacto = 1;
        for(int i=1; i<=10; i++){
            resPacto = pacto(i);
            if(resPacto == n){
                return i;
            }else if(resPacto > n){
                return i-1;
            }
        }
        return answer;
    }
    public static int pacto(int n){
        if(n == 1)
            return 1;
        return n * pacto(n-1);
    }





}
