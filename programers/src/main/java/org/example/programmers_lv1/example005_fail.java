package org.example.programmers_lv1;
/*
    이상한 문자 만들기

    https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */

import java.util.HashMap;
import java.util.Set;

public class example005_fail {

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

        StringBuilder res11 = new StringBuilder();

        HashMap<String, String> numberMap = new HashMap<String, String>();
//        numberMap.put("0", "zero");numberMap.put("1", "one");numberMap.put("2", "two");numberMap.put("3", "three");numberMap.put("4", "four");numberMap.put("5", "five");numberMap.put("6", "six");numberMap.put("7", "seven");numberMap.put("8", "eight");numberMap.put("9", "nine");numberMap.put("zero", "0");
        numberMap.put("one", "1");numberMap.put("two", "2");numberMap.put("three", "3");numberMap.put("four", "4");numberMap.put("five", "5");numberMap.put("six", "6");numberMap.put("seven", "7");numberMap.put("eight", "8");numberMap.put("nine", "9");


        System.out.println(numberMap.keySet());

        Set<String> numStr = numberMap.keySet();

        String[] strs = s.split("");
        String temp = "";
        for(String str : strs) {
            if(str.matches("[0-9]")) {
                res11.append(str);
                continue;
            }
            temp += str;
            if(numberMap.containsKey(temp))  {
                res11.append(numberMap.get(temp));
                temp = "";
            }
        }

//        answer =  Integer.parseInt(res11.toString());
        System.out.println(res11.toString());

        answer =  Integer.parseInt(res11.toString().trim());

        System.out.println(answer);


        return answer;
    }

}








