package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class LV0_20240429 {

    public static void main(String[] args) {

        String letter0 = ".... . .-.. .-.. ---";
        String letter1 = ".--. -.-- - .... --- -.";
        String letter2 = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";
        String letter3 = "--. --- --- -..";

        System.out.println(solution1(letter3));

//        System.out.println(solution2(3,2));
//        System.out.println(solution2(5,3));
        System.out.println(solution3(5,3));



    }

/*
    https://school.programmers.co.kr/learn/courses/30/lessons/120838
    모스부호(1)
    모스부호가 letter로 전달됩니다.
    전달된 모스부호를 문자열로 변환하여 출력하세요.
 */

    public static String solution1(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Map<String, String> morseMap = new HashMap<String, String>();
        for (int k = 0; k < morse.length; k++) {
            morseMap.put(morse[k],
                    String.valueOf((char)(97+k))
            );
        }

        String[] letterArr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String val: letterArr) {
            sb.append(morseMap.get(val));
        }

        answer = sb.toString();
        return answer;
    }

    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120840
    구슬을 나누는 경우의 수
    balls 개의 구슬 중 share 개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
    n개중 m개를 뽑는 경우의수 공식 힌트는 다음과 같다. 
          n!
    ------------
    (n-m)! X m!
    
     */

    public static int solution2(int balls, int share) {
        //오버플로우, 정수형문제에 대해서 찾아볼것. (케이스 오류남)
        double answer = 0;

        answer = factorial(balls) / ((factorial(balls - share) * factorial( share)));

        return (int)answer;
    }
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n* factorial(n-1);
    }

    public static int solution3(int balls, int share){
        double answer = 1;

        for(int i = 0; i < share; i++){
            answer = answer * (balls - i) / (i+1);
        }
        return (int)answer;
    }
    @Test
    public void testString(){

    }

}
