package org.example.SINCE2024.LV0;

public class LV0_20240416 {
/*
    배열 두 배 만들기
    https://school.programmers.co.kr/learn/courses/30/lessons/120809
    정수 배열 numbers가 매개변수로 주어집니다.
    numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 */


    public static void main(String[] args) {


        System.out.println();
        int[] test1 = {1,2,3,4,5};
        int[] test2 = {1,2,100,-99,1,2,3};
        int[] res;

        res = solution(test2);

        for (int k: res) {
            System.out.println(k);
        }


    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int k = 0; k < numbers.length; k++) {
            answer[k] = numbers[k]*2;
        }
        return answer;
    }

}
