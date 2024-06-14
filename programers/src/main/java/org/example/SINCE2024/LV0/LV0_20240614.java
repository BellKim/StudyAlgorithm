package org.example.SINCE2024.LV0;

public class LV0_20240614 {

    public static void main(String[] args) {
        String bin11 = "10"; 	String bin21 = "11"; //	"101"
        String bin12 = "1001";	String bin22 = "1111"; //	"11000"

        System.out.println(solution(bin11, bin21));
        System.out.println(solution(bin12, bin22));
    }





    /*https://school.programmers.co.kr/learn/courses/30/lessons/120885
        이진수 더하기

        이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

     */


    public static String solution(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int result = num1 + num2;
        String answer = Integer.toBinaryString(result);

        return answer;

    }


}
