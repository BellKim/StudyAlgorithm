package org.example.SINCE2024.LV0;



import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LV0_20240423 {


    public static void main(String[] args) {

    }



    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120889
    삼각형의 완성조건
    선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
    가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
    세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution1(int[] sides) {
        int answer = 0;

        int [] sides1 = sides;

        Arrays.sort(sides);

        int big = sides[sides.length-1];
        int other1 = sides[sides.length-2];
        int other2 = sides[sides.length-3];

        if(big >= other1 + other2){
            answer = 2;
        }else{
            answer = 1;
        }
        return answer;
    }

}
