package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LV0_20240425 {

    public static void main(String[] args) {
//        Solution1();
        //solution2
        String value1 = "aAb1B2cC34oOp";    //10
        String value2 = "1a2b3c4d123";      //16

        System.out.println(solution2(value1));

    }


    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120823
    직각삼각형 만들기
    숫자를 입력하면 가로 세로 높이 3의 직각삼각형을 그려주세요
    (* 한개가 1 인것으로 합니다.)
    답 :     *
            **
            ***
     */
    public static void Solution1() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/120851
        숨어있는 숫자의 덧샘(1)
        my_string안의 모든 자연수들의 합을 return 하도록 하는 코드를 작성하자.
        (단, 연속된 숫자의 경우 한자리 숫자로 취급한다.)
        예시>     "aAb1B2cC34oOp" => 1 2 3 4 의 합 => 10
                "1a2b3c4d123"   => 1 2 3 4 1 2 3 => 16
     */
    public static int solution2(String my_string) {
        int answer = 0;
        String[] numString = my_string.replaceAll("[a-z,A-Z]","").split("");
        for (String numStr: numString) {
            answer += Integer.parseInt(numStr);
        }
        return answer;
    }



}
