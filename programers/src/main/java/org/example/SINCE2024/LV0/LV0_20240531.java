package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240531 {
    public static void main(String[] args) {
        String cipher1 = "dfjardstddetckdaccccdegk"; int code1 = 4;	//"attack"
        String cipher2 = "pfqallllabwaoclk"; int code2 = 2; // "fallback";

        System.out.println(solution1(cipher1, code1));
        System.out.println(solution1(cipher2, code2));
    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/120892
        암호해독
        군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
        암호화된 문자열 cipher를 주고받습니다.
        그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
        문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.

        n번쨰 문자열을 모아서 return 하면된다.

        n번쨰 문자열을 산출하는방법은 n번째 문자열을 K로 나누어서 0이 되는 것만 조건에 넣어서
        stringbuilder 에 추가하여 리턴해주면 된다!


     */
    public static String solution1(String cipher, int code) {
        String answer = "";

        String[] getchar = cipher.split("");
        List<String> stringlist = new ArrayList<>();
        for (int i = 0; i < getchar.length; i++) {
            stringlist.add(getchar[i]);
        }
//        1234
//        0123

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < stringlist.size(); i++) {
            if((i+1) % code == 0){
                sb.append(stringlist.get(i));
            }
        }

        answer = sb.toString();



        return answer;
    }


}
