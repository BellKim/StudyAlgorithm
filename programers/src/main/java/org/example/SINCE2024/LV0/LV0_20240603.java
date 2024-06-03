package org.example.SINCE2024.LV0;

public class LV0_20240603 {
    public static void main(String[] args) {
        String[] s11= {"a", "b", "c"};	String[] s21= {"com", "b", "d", "p", "c"};	//2
        String[] s12= {"n", "omg"};	String[] s22= {"m", "dot"}; //	0

        System.out.println(solution1(s11, s21));
        System.out.println(solution1(s12, s22));

    }

    /* https://school.programmers.co.kr/learn/courses/30/lessons/120903
        배열의 유사도

        s1의 문자열이 s2에 존재하는지 확인해보는 문제이다.
        2중for문으로 모든 경우의수를 대조해 보면 된다.
        중복비교를 하지 않게 하려면 2번째 for 문에 k = i 로 변경해주면 될 것 같다.  

     */

    public static int solution1(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int k = 0; k < s2.length; k++) {
                if (s1[i].equals(s2[k])) {
                    answer++;
                }
            }
        }


        return answer;
    }



}
