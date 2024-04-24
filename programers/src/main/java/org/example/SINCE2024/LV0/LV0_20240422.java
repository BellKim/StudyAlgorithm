package org.example.SINCE2024.LV0;

import java.util.*;
import java.util.stream.Collectors;


public class LV0_20240422 {
    public static void main(String[] args) {


//        System.out.println(solution1("bus"));

//        System.out.println(solution2("205"));

    }



    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120849
        모음제거
        입력받은 영문 문자열에서 모음 문자열을  제거하는문제.
        bus -> bs
        hello -> hll
     */
    public static String solution1(String my_string) {
        String answer = "";

        String[] str = my_string.split("");
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String st: str) {
//            if(!(st.equals("a") || st.equals("e") || st.equals("i") || st.equals("o") || st.equals("u") ||
//                    st.equals("A") || st.equals("E") || st.equals("I") || st.equals("O") || st.equals("U"))){
//                stringBuilder.append(st);
//            }
//        }
//        answer = stringBuilder.toString();

        answer = my_string.replaceAll("[aeiou]", ""); // 허무...
        /* 정규표현식에서 [] 안의 문자열을 넣으면 입력된 문자열의 모든 문자열을 찾는다.
            replace( [regex(정규표현식)], [replacement]);
        */

        return answer;
    }

    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120839
    가위 바위 보
    가위는 2 바위는 0 보는 5로 표현합니다.
    가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
    rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.*/

    public static String solution2(String rsp) {
        String answer = "";

//        String[] str = rsp.split("");
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String st: str) {
//            if(st.equals("2")){
//                stringBuilder.append("0");
//            } else if (st.equals("0")) {
//                stringBuilder.append("5");
//            } else if (st.equals("5")) {
//                stringBuilder.append("2");
//            }
//        }
//        answer = stringBuilder.toString();
//        return answer;

//        return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());


        StringBuilder sb = new StringBuilder();

        Map<String, String> gameMap = new HashMap<>();
        gameMap.put("2","0");
        gameMap.put("0","5");
        gameMap.put("5","2");

        for (int k = 0; k < rsp.length() ; k++) {
            sb.append(gameMap.get(rsp.substring(k, k+1)));
        }

//        sb.append()

        return sb.toString();

    }



}
