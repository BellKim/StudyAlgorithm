package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LV0_20260701 {
    public static void main(String[] args) {
        String A1 = "hello";	String B1 = "ohell";        //	1
        String A2 = "apple";	String B2 = "elppa";        //	-1
        String A3 = "atat";	    String B3 = "tata";         //	1
        String A4 = "abc";	    String B4 = "abc";          //	0

        System.out.println(solution1(A1, B1));
        System.out.println(solution1(A2, B2));
        System.out.println(solution1(A3, B3));
        System.out.println(solution1(A4, B4));


    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/120921
    문자열 밀기

    shift해서 문자열이 일치하면 1,
    shift할 필요가 없으면 0
    뭘해도 문자열이 완성되지 않으면 -1 로 한다.


    나는 문자열을 리스트에 문자열을 만들어 가는 형식으로 코드를 짯는데
    문자열을 반복하여 앞에서부터 비교해 가는 방법을 사용하는것을 보았다.
    너무 허무했다.

    hello 문자열을 llohe과 같은 위치를 찾을경우
     hellohellohello 문자열을 만들고
     맨 앞부터 비교한다. 그러면 2번째 부터 비교하면 문자열이 완성된다는것. \
     허무하다...



     */

    public static int solution1(String A, String B) {
        int answer = 0;

        List<String> aList = new ArrayList<>();
        List<String> bList = new ArrayList<>();
        List<String> shiftList = new ArrayList<>();


        for (int i = 0; i < A.length(); i++) {
            aList.add(String.valueOf(A.charAt(i)));
        }
        for (int i = 0; i < B.length(); i++) {
            bList.add(String.valueOf(B.charAt(i)));
        }

        for (int b = 0; b < bList.size(); b++) {
            for (int a = 0; a < aList.size(); a++) {
                shiftList = shiftString(aList, a);

                    //같은경우 : shift된 숫자 리턴
                    if(bList.toString().equals(shiftList.toString()) && b == a) {
                        return 0;
                    }else if(bList.toString().equals(shiftList.toString())){
                        return a;
                    }
                    //다른경우

                shiftList = new ArrayList<>();
            }
        }

        // 다 돌렸는데도 같은게 없음
        answer = -1;



        return answer;
    }

    public static List<String> shiftString(List<String> A, int push) {

        List<String> newList = new ArrayList<>();

        for (int i = A.toArray().length-push; i < A.size(); i++) {
            newList.add(A.get(i));
        }

        for (int i = 0; i < A.size()-push; i++) {
            newList.add(A.get(i));
        }



        return newList;
    }


    @Test
    public void test1() {
        List<String> aList = new ArrayList<>();
        aList.add("a");
        aList.add("b");
        aList.add("c");
        aList.add("d");

        List<String> cList = new ArrayList<>();
        cList.add("a");
        cList.add("b");
        cList.add("c");
        cList.add("d");
        System.out.println(aList.toString());
        System.out.println(cList.toString());
        if(aList.toString().equals(cList.toString())) {
            System.out.println("true");
        }

    }

}
