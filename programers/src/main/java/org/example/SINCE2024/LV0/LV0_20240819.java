package org.example.SINCE2024.LV0;



public class LV0_20240819 {
    public static void main(String[] args) {
//        str1	str2	result
        String str1 = "aaaaa";	String str2 = "bbbbb";  //	"ababababab"
        System.out.println(solution1(str1, str2));
    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181942
        문자열 섞기
        str1과 str2를 순차적으로 산출한 문자열을 리턴하라.
        str1과 2의 길이는 동일한 길이로 주어지므로,
        split으로 자른 배열을 하나의 for문에서 순차적으로 합쳐주면 된다.


     */

    public static String solution1(String str1, String str2) {
        String answer = "";

        String[] st1 = str1.split("");
        String[] st2 = str2.split("");

        for (int i = 0; i < st1.length; i++) {
            answer = answer + st1[i] + st2[i];
        }

        return answer;
    }


}
