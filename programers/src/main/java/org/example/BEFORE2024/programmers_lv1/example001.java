package org.example.BEFORE2024.programmers_lv1;
/*
    평균구하기
    https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */

public class example001 {

    /*
        정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

     */


    public static void main(String[] args) {
        int [] input = {1,2,3,4};
        double res = 0;



        res = solution(input);

        System.out.println("res = " + res);

    }
    static double solution(int[] arr) {
        double answer = 0;

        for(int n : arr){
            answer +=n;
        }
        answer = answer/arr.length;

        return answer;
    }

}








