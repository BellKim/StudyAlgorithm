package org.example.SINCE2024.LV0;

import org.junit.Test;



public class LV0_20240728 {
    public static void main(String[] args) {
        int q1 = 3;	int r1 = 1;	String code1 = "qjnwezgrpirldywt";  //	"jerry"
        int q2 = 1;	int r2 = 0;	String code2 = "programmers";	    //"programmers"

        System.out.println(solution1(q1, r1, code1));
        System.out.println(solution1(q2, r2, code2));






    }

    public static void printarr(String[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*      https://school.programmers.co.kr/learn/courses/30/lessons/181903
        QR code

        두 정수 q, r과 문자열 code가 주어질 때,
        code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

        각 인덱스 / q => 나머지가 r 인 위치의 문자열을 앞에서부터 이어붙인 문자열을 리턴.


     */

    public static String solution1(int q, int r, String code) {
        String answer = "";
        String[] splitStr = code.split("");
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < splitStr.length; i++) {
            if(i%q == r){
                sb.append(splitStr[i]);
            }
        }
        answer = sb.toString();

        return answer;
    }

    @Test
    public void test1() {
        System.out.println(0%3);
        System.out.println(1%3);
        System.out.println(2%3);
        System.out.println(3%3);
    }




}

