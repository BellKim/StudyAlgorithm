package org.example.BEFORE2024.programmers_lv1;
/*
    이상한 문자 만들기

    https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */

public class example005_new {

    /*
        입력된 문자열을 숫자로 출력하는 코드를 작성해라.

        입력                  출력
        "one4seveneight"	1478
        "23four5six7"	    234567
        "2three45sixseven"	234567
        "123"	            123



     */


    public static void main(String[] args) {
        String input =
                "2147000000";
//                "11145678901234567890123456789012345678901234567890";
//                "onesevensevensevensevensevensevensevensevenseven";
//                "onesevensevensevensevensevensevensevensevenseven";
//                "one4seveneight";
//                "23four5six7";
//                "2three45sixseven";
//                "123";


        System.out.println(input);
        int res=0;

        res = solution(input);

        System.out.println("["+res+"]");

    }

    static int solution(String s) {
        int answer=0;

        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        //숫자가 0~9까지 10개로 정해져 있으므로 i<10
        for(int i=0; i<10; i++){
            s = s.replace(num[i], Integer.toString(i));
        }

        answer = Integer.parseInt(s);


        return answer;
    }

}








