package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LV0_20240510 {

    public static void main(String[] args) {
        String my_string = "";
        System.out.println(solution1(my_string));


    }

    /*

    https://school.programmers.co.kr/learn/courses/30/lessons/120893
    대문자와 소문자
    입력받은 문자를 대문자를 소문자로, 소문자는 대문자로 입력할것.

     */


    public static String solution1(String my_string) {
        StringBuilder sb = new StringBuilder();

        for(char c : my_string.toCharArray()) {
            if(Character.isLowerCase(c)) sb.append((c+"").toUpperCase());
            else sb.append((c+"").toLowerCase());
        }

        return sb.toString();
//            sb.append((char)((int)stringList.get(k).charAt(0)+49));


        }
}







