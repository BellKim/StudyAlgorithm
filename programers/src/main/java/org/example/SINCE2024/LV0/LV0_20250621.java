package org.example.SINCE2024.LV0;


import java.util.ArrayList;
import java.util.List;

public class LV0_20250621 {
    public static void main(String[] args) {
//        my_str	n	result
        String my_str1 = "abc1Addfggg4556b";	int n1 = 6;	//["abc1Ad", "dfggg4", "556b"]
        String my_str2 = "abcdef123";	int n2 = 3; //	["abc", "def", "123"]
        System.out.println(solution1(my_str1, n1));
        System.out.println(solution1(my_str2, n2));



    }



    /*   https://school.programmers.co.kr/learn/courses/30/lessons/120913


     */

    public static String[] solution1(String my_str, int n) {
        String[] answer = {};
        String [] splitString = my_str.split("");
        List<String> answerList = new ArrayList<>();



        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splitString.length; i++) {
            if(((i>=n) && (i%n)==0)) {
                answerList.add(sb.toString());
                sb = new StringBuilder();
            }
            sb.append(splitString[i]);

        }

        answerList.add(sb.toString());
        sb = new StringBuilder();


        for (int i = 0; i < answerList.size() ; i++) {
            answer = new String[answerList.size()];
            answerList.toArray(answer);
        }





        return answer;
    }





}
