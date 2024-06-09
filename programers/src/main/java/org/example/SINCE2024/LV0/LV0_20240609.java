package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LV0_20240609 {

    public static void main(String[] args) {

        String solutioin1 = "abcabcadc";	//"d"
        String solutioin2 = "abdc";	        //"abcd"
        String solutioin3 = "hello";	    //"eho"

        System.out.println(solution1(solutioin1));
        System.out.println(solution1(solutioin2));
        System.out.println(solution1(solutioin3));

    }

    /*    https://school.programmers.co.kr/learn/courses/30/lessons/120896

        한 번만 등장한 문자

        문자열 s가 매개변수로 주어집니다.
        s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
        한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

        1. 문자열을 비교하기위해 전부 한자씩 배열에 넣는다.
        2. 문자열의 갯수를 산출하기 위해서 map에 갯수를 산출한다.
        3. hashmap 의 키를 순차적으로 비교하여 키값이 1인문자열을 리스트에 넣고
        4. 리스트를 사전순으로 소트
        5. 소트된 문자열들을 answer 로 리턴한다.
     */


    public static String solution1(String s) {
        String answer = "";

        String[] words = s.split("");

        HashMap<String, Integer> countHash = new HashMap<>();

        for (String word : words) {
            if (countHash.containsKey(word)) {
                countHash.put(word, countHash.get(word) + 1);
            }else{
                countHash.put(word, 1);
            }
        }

        List<String> result = new ArrayList<>();

        String[] hashset = countHash.keySet().toArray(new String[0]);

        for (int i = 0; i < hashset.length; i++) {
            if(countHash.get(hashset[i]) == 1 ){
                result.add(hashset[i]);
            }
        }

        if(!result.isEmpty()) {
            Collections.sort(result);
            StringBuilder sb = new StringBuilder();
            for (String word : result) {
                sb.append(word);
            }
            answer = sb.toString();
        }

        return answer;
    }

}
