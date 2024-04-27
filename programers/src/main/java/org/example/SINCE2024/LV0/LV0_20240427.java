package org.example.SINCE2024.LV0;

import org.junit.Test;

public class LV0_20240427 {
    public static void main(String[] args) {
//        System.out.println(solution1(1230));

        int[] box = {10,8,6};
        int n = 3;
        System.out.println(solution2(box, n));

    }

/*
    //https://school.programmers.co.kr/learn/courses/30/lessons/120834
    외계행성의 나이
    age 에 숫자가 입력되면 숫자를 알파벳으로 리턴하는것.
    a-0 b-1 f-5 ..... 51 -> fb 으로 한다.
    solution>
        아스키코드표 숫자 a~z는 97~122 이다.
        0을 a로 하기위해선 0+97 을 해서 문자열로 변경하면 된다.
*/
public static String solution1(int age) {
    String answer = "";
    String[] getAge = Integer.toString(age).split("");
    StringBuilder sb = new StringBuilder();
    for (String ageNum: getAge) {
        sb.append((char)((int)ageNum.charAt(0)+49));
    }
    answer = sb.toString();
    return answer;
}

    @Test
    public void solution1_charTest(){
        //https://school.programmers.co.kr/learn/courses/30/lessons/120834
        int age = 100;
        String large = "A";
        String little = "a";
        System.out.println((int)large.charAt(0)); //A~Z 65~79
        System.out.println((int)little.charAt(0)); //a~z 97~122
        System.out.println(
                (char)((int)little.charAt(0)+2)
        ); //a~z 97~122
    }

    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120845
    주사위의 개수
    박스에 대한 정보와 주사위의 모서리 길이정수 n을 매개변수로 주어졌을때 주사위의 최대 개수를 return 하도록 solution함수를 완성해주세요 .
        box의 길이는 3이며 (박스의 정보가 담긴 배열이 3이라는 의미)
        box[0] = 상자의 가로 길이
        box[1] = 상자의 세로 길이
        box[2] = 상자의 높이 길이
        "직"육면체 안에 모서리 n의 "정"육면체 주사위를 넣는 문제이다.
        solution>
        가로 세로 높이 의 길이에서 /3 을 각각 나눈다음  3개의 숫자를 모두 곱하면 된다.
     */

    public static int solution2(int[] box, int n) {
        int answer = 1;
        for (int value : box) {
            if(n != 0) {
                answer *= (value / n);
            }
        }
        return answer;
    }
    @Test
    public void test(){

    }


}
