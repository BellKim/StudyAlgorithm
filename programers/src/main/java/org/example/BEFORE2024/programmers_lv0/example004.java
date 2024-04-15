package org.example.BEFORE2024.programmers_lv0;

public class example004 {

// programmers.co.kr/learn/courses/30/lessons/120806 두 수의 나눗셈
//    https://school.programmers.co.kr/learn/courses/30/lessons/120806

    public static void main(String[] args) {

        int res = solution(3, 2);
//        int res = solution(7, 3);
//        int res = solution(1, 16);

        System.out.println("res = " + res);

    }

    static int solution(int num1, int num2) {
        int answer = 0;
        answer = (int) (((double) num1 / (double) num2) * 1000);

        return answer;
    }

}
