package org.example.SINCE2024.LV0;

public class LV0_20240713 {
    public static void main(String[] args) {
        String myString1 = "ABBAA"; 	String pat1 = "AABB";   //	1
        String myString2 = "ABAB";	    String pat2 = "ABAB";   //	0

        System.out.println(solution1(myString1, pat1));
        System.out.println(solution1(myString2, pat2));

    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181864
        문자열 바꿔서 찾기

        문자열을 A->B B-> A로  바꿔서 pat에 동일한 값이 존재하면 1 없으면 0을 리턴한다.

        그리고 나는 모든 문자열을 배열로 넣어서 하나하나 문자열을 비교하였다.
        왜냐하면 replace는 한번 바꾸게 되면 문자열이 변경되기때문이다. 하지만 다른사람의 문제풀이를 열람한 결과
        replace는 중첩적용이 가능하다.
        예>  myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
            이런 식으로 하면 중첩적용이 되기에 조건을 추가 할 수있다.

     */


    public static int solution1(String myString, String pat) {
        int answer = 1;
        String[] myStringArray = myString.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myStringArray.length; i++) {
            if(myStringArray[i].equals("A")) {
//                myStringArray[i] = "B";
                sb.append("B");
            } else if (myStringArray[i].equals("B")) {
//                myStringArray[i] = "A";
                sb.append("A");
            }else{

            }
        }


        String res = sb.toString();
        System.out.println("res = " + res);
        res = res.replace(pat,"$");

        if(res.contains("$")){
            answer = 1;
        }else {
            answer = 0;
        }
        return answer;
    }


}
