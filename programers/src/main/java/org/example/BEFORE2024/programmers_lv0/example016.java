package org.example.BEFORE2024.programmers_lv0;

import java.util.Arrays;

public class example016 {

//    삼각형의 완성조건 (1)
//    https://school.programmers.co.kr/learn/courses/30/lessons/120889

    /*
     *  선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
     *  가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
     *  삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
     *  세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
     *
     *  => 셋중 가장 큰 숫자가 나머지 2개의 숫자의 합보다 작아야한다.
     *      작으면 1 (삼각형가능)
     *      크  면 2 (삼각형생성 불가능)
     *
     */

    public static void main(String[] args) {

        int [] sides =
//                {1, 2, 3};
//                {3, 6, 2};
                {199, 72, 222};

        int res = solution(sides);

        System.out.println("[ "+ res + " ] ");


    }

    static int solution(int [] sides) {
        int  answer = 0;

        int [] sides1 = sides;

        Arrays.sort(sides1);

//        System.out.println("  -  " + Arrays.toString(sides));

        int big = sides1[sides1.length-1];
        int other1 = sides1[sides1.length-2];
        int other2 = sides1[sides1.length-3];

        if(big >= other1 + other2){
            answer = 2;
        }else{
            answer = 1;
        }


        return answer;
    }

}
















