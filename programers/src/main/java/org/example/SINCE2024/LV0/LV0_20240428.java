package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LV0_20240428 {
    public static void main(String[] args) {
        int[] emergency1 = {3, 76, 24};
        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency3 = {30, 10, 23, 6, 100};

        for (int val:solution1(emergency3)) {
            System.out.println(val);
        }



    }

/*
    https://school.programmers.co.kr/learn/courses/30/lessons/120835
    진료순서 정하기
    > 문제
    외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
    정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
    > 개요
    emergency 배열속 각 숫자가 응급도를 나타내는데 숫자가 클수록 응급도가 높다.
    응급도가 높을수록 순위가 높으며, emergency 순서대로 응급숫자를 산출해주면 된다.
    >예시
    [3, 76, 24]             => [3, 1, 2]
    [1, 2, 3, 4, 5, 6, 7]   => [7, 6, 5, 4, 3, 2, 1]
    [30, 10, 23, 6, 100]    => [2, 4, 3, 5, 1]
    >solution
    받은 emergency 배열을 리스트로 옮긴뒤 sort 진행한뒤 reverse() 까지 실행하면 큰 수가 맨 앞으로 올것.
    emergency 배열과 똑같은 배열길이를 선언하고
    emergency 0번부터 순서대로 sort,reverse 한 배열과 비교하여 신규 생성한 배열에 순차적으로 list의 index 번호를 넣는다.

 */
    public static int[] solution1(int[] emergency) {
        int[] answer = {};

        List<Integer> emergencyList = new ArrayList<Integer>();

        for (int val: emergency) {
            emergencyList.add(val);
        }
        Collections.sort(emergencyList);
        Collections.reverse(emergencyList); //큰 수가 앞으로 옴.

        answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) { //원 배열
            for (int k = 0; k < emergencyList.size(); k++) { //소트한 리스트
                // emergency의 배열의 숫자가 소트한리스트(emergencyList) 의 값과 같으면 answer의 배열에 넣는다.
                if(emergency[i] == emergencyList.get(k)) {
                    answer[i] = k+1;
                }
            }
        }

        return answer;
    }

    @Test
    public void listTest(){
//        int[] emergency = {3, 76, 24};
//        int[] emergency = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency = {30, 10, 23, 6, 100};
        List<Integer> emergencyList = new ArrayList<Integer>();

        for (int val: emergency) {
            emergencyList.add(val);
        }
        Collections.sort(emergencyList);
        Collections.reverse(emergencyList); //큰 수가 앞으로 옴.

        System.out.println("================");
        for (int val: emergencyList) {
            System.out.println(val);
        }

        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) { //원 배열
            for (int k = 0; k < emergencyList.size(); k++) { //소트한 리스트
                // emergency의 배열의 숫자가 소트한리스트(emergencyList) 의 값과 같으면 answer의 배열에 넣는다.
                if(emergency[i] == emergencyList.get(k)) {
                    answer[i] = k+1;
                }
            }
        }
        System.out.println("========res========");
        for (int val: answer) {
            System.out.println(val);
        }
    }


}
