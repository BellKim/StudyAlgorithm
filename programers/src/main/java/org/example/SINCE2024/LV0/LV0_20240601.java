package org.example.SINCE2024.LV0;

import org.junit.Test;

public class LV0_20240601 {

    public static void main(String[] args) {

        int n1 = 2;	int t1 = 10; 	//2048
        int n2 = 7;	int t2 = 15;	//229,376
        System.out.println(solution1(n1, t1));
        System.out.println(solution1(n2, t2));

    }

/* https://school.programmers.co.kr/learn/courses/30/lessons/120910
    세균증식
    어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
    처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

    처음 세균 숫자에서 제곱이 되는것이 아니라 두배가 되는것이다.
    t2의 횟수 만큼 2를 곱해주면 된다.


*/

    public static int solution1(int n, int t) {
        int answer = n;

        for (int i = 0; i < t; i++) {
            answer = answer *2;
        }
        return answer;
    }

}
