package org.example.programmers.SINCE2024.LV0;


public class LV0_20240914 {
    public static void main(String[] args) {

        String str11 = "abc";	String str21 = "aabcc";  //	1
        String str12 = "tbt";	String str22 = "tbbttb";    //	0

        System.out.println(solution1(str11, str21));
        System.out.println(solution1(str12, str22));




    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /* https://school.programmers.co.kr/learn/courses/30/lessons/181842
        부분 문자열

        문자열이 포함되는지 여부를 확인한다.
        java에서 제공되는 contains 를 이용하여 문제를 해결하였다. 

     */

    public static int solution1(String str1, String str2) {
        int answer = 0;

        if(str2.contains(str1)){
            answer=1;
        }else {
            answer=0;
        }
        return answer;
    }
}

