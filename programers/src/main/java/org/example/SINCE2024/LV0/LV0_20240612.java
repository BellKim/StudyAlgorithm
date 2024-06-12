package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class LV0_20240612 {



    public static void main(String[] args) {
        String before1 = "olleh";	String after1 = "hello"; //	1
        String before2 = "allpe";	String after2 = "apple"; //	0

        System.out.println(solution1(before1, after1));
        System.out.println(solution1(before2, after2));


    }





    /*  https://school.programmers.co.kr/learn/courses/30/lessons/120886
    
        A로 B 만들기

        before의 문자와 after 의 문자를 순서만 바꿔서 만들어 낼 수 있는지 알아본다. 
        각 문자열의 갯수를 before 와 after 이 서로 일치하는지 확인해 보면 된다. 
        그러기 위해서 keymap 을 이용하여 문자열의 갯수들을 산출해 냈는데....
        다른 사람의 풀이를 보니 문자열을 sort 해서 일치하는지 확인하는 사람도 있다.
        흐트러진 문자열을 재배열 하느니 소트해서 동일한 조건으로 하는것어 더 쉬운 방법이었다.
        ㅠㅠ
        

     */

    public static int solution1(String before, String after) {
        int answer = 0;

        String[] beforeStr = before.split("");
        String[] afterStr = after.split("");

        HashMap<String, Integer> beforeMap = makeKeySetCount(beforeStr);
        HashMap<String, Integer> afterMap = makeKeySetCount(afterStr);

        List<String> beforekeylist = new ArrayList<>(beforeMap.keySet());
        List<String> afterkeylist = new ArrayList<>(afterMap.keySet());

        int status = 0;
        for (String beforekey : beforekeylist) {
            if (Objects.equals(beforeMap.get(beforekey), afterMap.get(beforekey))) {
                status += 1;
            }
        }

        if((status == beforeMap.size()) && (status == afterMap.size())){
           answer = 1;
        }else{
            answer = 0;
        }

        return answer;
    }

    private static HashMap<String, Integer> makeKeySetCount(String[] beforeStr) {
        HashMap<String, Integer> beforeMap = new HashMap<>();
        for(int i = 0; i < beforeStr.length; i++) {
            if(beforeMap.containsKey(beforeStr[i])) {
                beforeMap.put(beforeStr[i], beforeMap.get(beforeStr[i]) + 1);
            }else{
                beforeMap.put(beforeStr[i], 1);
            }

        }
        return beforeMap;
    }


}

