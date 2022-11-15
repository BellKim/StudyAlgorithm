package org.example.programmers_lv1;
/*
    이상한 문자 만들기

    https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */

public class example004_fail {

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
                "  tRy hello  WORLD    ";

        System.out.println("input : [" + input+"]");


        String res = "";

        res = solution(input);

        System.out.println("["+res+"]");

    }

    static String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        String [] strarr = s.split(" ");

        for (int in = 0; in < strarr.length; in++) {

            if (strarr[in].equals("")){

                continue;
            }

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

            System.out.println(answer);


        return answer;
    }

}








