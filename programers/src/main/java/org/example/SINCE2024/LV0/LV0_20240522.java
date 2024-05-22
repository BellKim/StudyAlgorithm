package org.example.SINCE2024.LV0;

public class LV0_20240522 {
    public static void main(String[] args) {
        String str11 = "ab6CDE443fgh22iJKlmn1o";	String str21 = "6CD";	//1
        String str12 = "ppprrrogrammers";	        String str22 = "pppp";	//2
        String str13 = "AbcAbcA";	                String str23 = "AAA";	//2

        System.out.println(solution1(str11, str21));
        System.out.println(solution1(str12, str22));
        System.out.println(solution1(str13, str23));

    }

    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120908
     문자열안에 문자열
        문자열 속에 str2 해당하는 문자열이 있는지 확인해보자

     */
    public static int solution1(String str1, String str2) {
        int answer = 0;

        if(str1.contains(str2)){
            answer = 1;
        }else if(!str1.contains(str2)){
            answer = 2;
        }

        return answer;
    }




}
