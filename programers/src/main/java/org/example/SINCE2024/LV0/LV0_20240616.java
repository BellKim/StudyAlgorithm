package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.HashMap;

public class LV0_20240616 {
    public static void main(String[] args) {
        // "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        String numbers1 = "onetwothreefourfivesixseveneightnine";	//123456789
        String numbers2 = "onefourzerosixseven";	    //14067
        System.out.println(solution1(numbers1));
        System.out.println(solution1(numbers2));
    }

    /*   https://school.programmers.co.kr/learn/courses/30/lessons/120894

        영어가 싫어요

        알파벳 문자열을 숫자로 바꾸면 된다.
        hashmap 에 문자열을 넣고 키값과 동일한 문자열이 나오면 value 값으로 바꾸도록 하였다.
        1번문자열과 1번문자열 사이에 다른값이 인식이 되지 않을까 걱정하였지만 이 문제 안에서는 그런 내용이 없었던것으로 보였다.
        그리고 리턴 타입을 문제에서 long 타입으로 제시되었기때문에 형변환도 long타입으로 진행해야한다.
        나같은 경우 int타입으로 리턴했더니, 런타임 오류가 발생하였다.

     */


    public static long solution1(String numbers) {
        long answer = 0;
        String target = new String(numbers);

        HashMap<String, Integer> numberMap = getNumberDatabase();
        String[] keys = numberMap.keySet().toArray(new String[0]);


        for (String key : keys) {
            target = target.replaceAll(key, Integer.toString(numberMap.get(key)));
        }

        System.out.println();

        answer = Long.parseLong(target);


        return answer;
    }

    public static HashMap<String, Integer> getNumberDatabase(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero"  ,0  );
        map.put("one"   ,1  );
        map.put("two"   ,2  );
        map.put("three" ,3  );
        map.put("four"  ,4  );
        map.put("five"   ,5  );
        map.put("six"   ,6  );
        map.put("seven" ,7  );
        map.put("eight" ,8  );
        map.put("nine"  ,9  );
        return map;
    }



    @Test
    public void test1() {
        String testStr = "aaabacadaeafag";
        System.out.println(testStr);
        testStr = testStr.replaceAll("ac|af", "ㅋ");
        System.out.println(testStr);
    }

}
