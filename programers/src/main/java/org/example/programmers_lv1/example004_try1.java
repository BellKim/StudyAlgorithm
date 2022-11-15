package org.example.programmers_lv1;
/*
    이상한 문자 만들기

    https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */

public class example004_try1 {

    /*
        전달되는 문자열 중에서
        짝수번째는 대문자,
        홀수번째는 소문자 로 텍스트를 변경출력 하시오.

        0번째는 대문자로 처리.
     */


    public static void main(String[] args) {
        String input =
//                " abc abc  abcd abcde ";
//                " AbC De    FgHi ";
//                "  abc de    fghi     ";
//                "  tRy      hello      WORLD    ";
        "  010  4196  0137  010  4196  0137  010  4196  0137  ";
//          "try    hello world";
//        "TrY HeLlO WoRlD";

        System.out.println("input : [" + input+"]");


        String res = "";

        res = solution(input);

        System.out.println("["+res+"]");

    }

    static String solution(String s) {
        String answer = "";
        String ss = s;
        StringBuilder sb = new StringBuilder();

        String [] strarr = ss.split(" ", -1);

        System.out.println("====================================");
        for(String arrr : strarr){
            System.out.println("{"+arrr+"}");
        }
        System.out.println("====================================");


        for (int in = 0; in < strarr.length; in++) {
            String chk = strarr[in];
            String [] chkarr = chk.split("");

            for (int i = 0; i < chkarr.length; i++) {
                if ((i%2) == 0) {
                    sb.append(chkarr[i].toUpperCase());
                }else{
                    sb.append(chkarr[i].toLowerCase());
                }
            }

            if (in == strarr.length - 1) continue;
            sb.append(" ");
        }

        answer = sb.toString();



        return answer;
    }

}








