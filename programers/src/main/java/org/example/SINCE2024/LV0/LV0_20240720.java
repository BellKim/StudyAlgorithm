package org.example.SINCE2024.LV0;

public class LV0_20240720 {
    public static void main(String[] args) {
        String myString1 = "aBcDeFg";	//"abcdefg"
        String myString2 = "aaa";       //"aaa"



        System.out.println(solution1(myString1));
        System.out.println(solution1(myString2));


        String myString3 = "aBcDeFg";	//"ABCDEFG"
        String myString4 = "AAA";	    //"AAA"
        System.out.println(solution2(myString3));
        System.out.println(solution2(myString4));


    }



    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181876
        소문자로 바꾸기

        입력받은 문자를 일괄 소문자로 변경하도록 한다.


     */
    public static String solution1(String myString) {
        String answer = myString.toLowerCase();

        return answer;
    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181877
       대문자로 바꾸기

       입력받은 문자를 일괄 대문자로 변경하도록 한다.

    */
    public static String solution2(String myString) {
        String answer = myString.toUpperCase();

        return answer;
    }



}

