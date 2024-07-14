package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LV0_20240714 {
    public static void main(String[] args) {
        String my_string1 = "i love you";	// ["i", "love", "you"]
        String my_string2 = "programmers";	// ["programmers"]

        printarr(solution1(my_string1));
        printarr(solution1(my_string2));

        printarr(solution2(my_string1));
        printarr(solution2(my_string2));

    }

    public static void printarr(String[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181869
        공백으로 구분하기 1
        공백을 기준으로 배열을 생성하도록 하면 되는 문제이다.
     */
    public static String[] solution1(String my_string) {

        return my_string.split(" ");
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181868
        공백으로 구분하기 2

        공백으로 구분하기2에서는 주어진 문자열의 맨앞 혹은 맨뒤에 공백이 존재할 수 있다.
        맨앞과 맨뒤의 공백의 유무를 판단하여 배열에 추가하도록 하는것이 중요할 것.

     */
    public static String[] solution2(String my_string) {
        String[] answer = {};
        String[] answer1 = my_string.split(" ");
        List<String> stringList = Arrays.asList(answer1);
        List<String> checkStringList = new ArrayList<>();

        for (int i = 0; i < answer1.length; i++) {
            if(!stringList.get(i).equals("")){
                checkStringList.add(stringList.get(i));
            }
        }

        answer = new String[checkStringList.size()];
        for (int i = 0; i < checkStringList.size(); i++) {
            answer[i] = checkStringList.get(i);
        }

        return answer;
    }



}
