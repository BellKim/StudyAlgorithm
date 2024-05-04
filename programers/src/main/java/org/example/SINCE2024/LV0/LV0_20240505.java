package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV0_20240505 {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5}; //	20
        int[] numbers2 = {0, 31, 24, 10, 1, 9};//	744

//        System.out.println(solution1(numbers1));
//        System.out.println(solution1(numbers2));


        System.out.println(solution2("3x + 7 + x"));
        System.out.println(solution2("x + x + x"));


    }


    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120847
    최댓값 만들기
    두 수를 곱했을때 제일 큰 숫자를 출력하세요
     */

    public static int solution1(int[] numbers) {
        int answer = 0;

        List<Integer> intArray = new ArrayList<Integer>();
        for (int val: numbers) {
            intArray.add(val);
        }
        Collections.sort(intArray);

        answer = intArray.get(intArray.size()-1) * intArray.get(intArray.size()-2);

        return answer;
    }

    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120863
    다항식 더하기
    한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
    다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
    덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
    같은 식이라면 가장 짧은 수식을 return 합니다.

    입출력 예 #1
    "3x + 7 + x"에서 동류항끼리 더하면 "4x + 7"입니다.
    입출력 예 #2
    "x + x + x"에서 동류항끼리 더하면 "3x"입니다.


     */

    public static String solution2(String polynomial) {
        String answer = "";
        String[] getData = polynomial.split(" ");
        List<String> stringList = new ArrayList<String>(Arrays.asList(getData));
        int containX = 0;
        int nonX = 0;
        for (int k = 0; k < stringList.size(); k++) {
            if(stringList.get(k).contains("x")){
                if(stringList.get(k).length() == 1){
                    containX+=1;
                }else {
                    containX += Integer.parseInt(stringList.get(k).substring(0, stringList.get(k).length() - 1));
                }
            }else if(!stringList.get(k).contains("+")){
                nonX +=  Integer.parseInt(stringList.get(k));
            }
        }

        if(containX > 1 ){
            answer = nonX==0?containX + "x" : containX+"x" + " + " + nonX ;
        }else if(containX == 1 ){
            answer = nonX==0 ? "x" : "x" + " + " + nonX ;
        }
        else{
            answer = String.valueOf(nonX);
        }


        return answer;
    }

    @Test
    public void testCode(){
        String test = "3x";
        System.out.println(test.length());

        System.out.println(
                test.substring(0, test.length() - 1)
        );
    }




}
