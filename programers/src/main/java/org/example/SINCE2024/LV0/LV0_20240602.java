package org.example.SINCE2024.LV0;

public class LV0_20240602 {
    public static void main(String[] args) {
        int n1 = 1234;	//10
        int n2 = 930211;	//16

        System.out.println(solution(n1));
        System.out.println(solution(n2));


    }

    /* https://school.programmers.co.kr/learn/courses/30/lessons/120906
        자릿수 더하기
        주어진 숫자의 각자리수를 더하여 보아라.
        
     */
    public static int solution(int n) {
        int answer = 0;

        String[] intstr= Integer.toString(n).split("");

        for (int i = 0; i < intstr.length; i++) {
            answer += Integer.parseInt(intstr[i]);
        }


        return answer;
    }

}
