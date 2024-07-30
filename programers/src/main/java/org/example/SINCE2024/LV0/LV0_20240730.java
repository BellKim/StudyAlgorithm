package org.example.SINCE2024.LV0;


public class LV0_20240730 {
    public static void main(String[] args) {
        String mystring1 = "AbCdEfG";	String pat1 = "aBc"; //	1
        String mystring2 = "aaAA";	    String pat2 = "aaaaa";  //	0

        System.out.println(solution1(mystring1, pat1));
        System.out.println(solution1(mystring2, pat2));






    }

    public static void printarr(String[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*      https://school.programmers.co.kr/learn/courses/30/lessons/181878
        원하는 문자열 찾기

        pat에 있는 문자열이 mystring 안에 있는지 확인하는것이다.
        비교할 문자열과 비교대상 문자열 모두 소문자로 변경하고 contains()를 이용하여 비교를한다.  


     */
    public static int solution1(String myString, String pat) {
        int answer = 0;

        if(myString.toLowerCase().contains(pat.toLowerCase())){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }



}

