package org.example.BEFORE2024.programmers_lv1;
/*
    직사각형 별찍기
    https://school.programmers.co.kr/learn/courses/30/lessons/12969
 */

import java.util.Scanner;

public class example003 {

    /*
        이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
        별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

            5 3 입력시
            5줄씩 3개의 별이 찍혀야 한다.

     */


    public static void main(String[] args) {
        String input = "";

        String res = "";

        res = solution(input);



    }
    static String solution(String phone_number) {
        String answer = "";

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        return answer;
    }

}








