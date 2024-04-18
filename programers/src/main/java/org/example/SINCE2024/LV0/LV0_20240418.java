package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LV0_20240418 {
/*
    https://school.programmers.co.kr/learn/courses/30/lessons/120821
    배열 되집기
    정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
    num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
*/
    public static void main(String[] args) {
        int[] numList = {1,3,5,6,7,9};

        int [] res = solution(numList);

        //결과출력
        for(int before: numList){
            System.out.print(before + " ");
        }
        System.out.println("\n=================================");
        for(int after: res){
            System.out.print(after + " ");
        }
    }

    public static int[] solution(int[] num_list) {
        int[] answer = {};

        List<Integer> answerList = new ArrayList<>();
        for (int num : num_list) {
            answerList.add(num);
        }
        Collections.reverse(answerList);

        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

}
