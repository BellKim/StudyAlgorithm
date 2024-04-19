package org.example.SINCE2024.LV0;

public class LV0_20240419 {
    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120826
    문자열 my_string과 문자 letter이 매개변수로 주어집니다.
    my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
     */
    public static void main(String[] args) {
        System.out.println(solution("f", "abcdef"));
    }

    public static String solution(String my_string, String letter) {
        String answer = "";
        String[] chk = my_string.split("");
        StringBuilder sb = new StringBuilder();

        for(String ch : chk){
            if(!ch.equals(letter)){
                sb.append(ch);
            }
        }
        answer = sb.toString();
        return answer;
    }
}
