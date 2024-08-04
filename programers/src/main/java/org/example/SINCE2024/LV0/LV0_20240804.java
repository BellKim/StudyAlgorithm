package org.example.SINCE2024.LV0;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV0_20240804 {
    public static void main(String[] args) {

        String my_string1  = "Progra21Sremm3";  int s1= 6;	int e1 = 12;    //	"ProgrammerS123"
        String my_string2  = "Stanley1yelnatS";	int s2= 4;	int e2 = 10;    //	"Stanley1yelnatS"

        System.out.println(solution1(my_string1, s1, e1));
        System.out.println(solution1(my_string2, s2, e2));





    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*   https://school.programmers.co.kr/learn/courses/30/lessons/181905
        문자열 뒤집기

        문자열 my_string 과 정수 s, e 가 매개변수로 주어질 때 s~e까지 뒤집은 문자열을 return 하는 코드 작성

        간단히 말해서 배열로 문자열을 저장하고 뒤집기만 하면 된다.



     */
    public static String solution1(String my_string, int s, int e) {
        String answer = "";

        List<String> stringList = new ArrayList<>(Arrays.asList(my_string.substring(s,e+1).split("")));
        Collections.reverse(stringList);


        String[] split = my_string.split("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            if(i < (s) || i > (e)) {
                sb.append(split[i]);
            }else{
                sb.append(stringList.get(i-s));
            }
        }

        answer = sb.toString();


        return answer;
    }






}

