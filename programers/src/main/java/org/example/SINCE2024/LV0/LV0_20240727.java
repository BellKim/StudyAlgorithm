package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240727 {
    public static void main(String[] args) {

        String my_string = "apporoograpemmemprs";	int[] indices1 = {1, 16, 6, 15, 0, 10, 11, 3};   //	"programmers"
        System.out.println(solution1(my_string, indices1));







    }

    public static void printarr(String[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181900
        글자 지우기

        입력받은 문자열중에 배열의 번호와 일치하는 문자열을 지우고 지워진 문자열을 리턴하도록 한다.
        지울 대상은 * 로 표기하고 최종 문자열 정리할때는 *인 문자열을 제외하고 문자열을 제작하도록 한다.

        *로 문자열을 정한이유는 my_string에 주어질 문자열이 영소문자만 이루어졌다고 하니,
         영소문자가 아닌 * 로 선택한것이다.




     */
    public static String solution1(String my_string, int[] indices) {
        String answer = "";

        String[] strArr = my_string.split("");
        List<String> stringList = new ArrayList<String>();

        for (int i = 0; i < indices.length; i++) {
            strArr[indices[i]] = "*";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals("*")) {
                sb.append(strArr[i]);
            }
        }

        answer = sb.toString();

        return answer;
    }

}

