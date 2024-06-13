package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LV0_20240613 {
    public static void main(String[] args) {

        int n1 = 24;	// [1, 2, 3, 4, 6, 8, 12, 24]
        int n2 = 29;	// [1, 29]
        int n3 = 4;	// [1, 2, 4]

//        printarr(solution1(n1));
//        printarr(solution1(n2));
        printarr(solution1(n3));

    }

    public static void printarr(int[] num){
        System.out.println("print 시작");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/120897
        약수 구하기

        정수 n이 매개변수로 주어질 때,
        n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

        추가로, 제곱인경우에 대한 예외를 추가해 줘야 한다는 것이다.

        예를들어 4일경우 약수가 1, 2, 4 가 되는데
                2는 4의 제곱이다.

     */

    public static int[] solution1(int n) {
        int[] answer = {};
        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(((n/i) > i )  && ((n%i) == 0)){
                integerList.add(i);
                integerList.add(n/i);
            }else if(((n/i) == i) && ((n%i) == 0)){
                integerList.add(i);
            }
        }

        Collections.sort(integerList);

        answer = new int[integerList.size()];
        for (int k = 0; k < integerList.size(); k++) {
            answer[k] = integerList.get(k);
        }

        return answer;
    }



}
