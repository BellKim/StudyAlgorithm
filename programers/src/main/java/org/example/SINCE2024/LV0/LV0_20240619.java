package org.example.SINCE2024.LV0;


public class LV0_20240619 {

    public static void main(String[] args) {
        String my_string1 = "3 + 4"; //	7

        System.out.println(solution1(my_string1));

    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/120902
        문자열 계산하기
        문자열을 보고 연산하면 됩니다. 괄호 순서 상관없이 순차적으로 계산하면 됩니다. 


     */


    public static int solution1(String my_string) {
        int answer = 0;

        String[] calcString = my_string.split(" ");
        answer = Integer.parseInt(calcString[0]);
        String calc = "";
        for (int i = 1; i < calcString.length; i++) {
            if(i%2 == 1) {
                calc = calcString[i];
            }else if(i%2 == 0) {

                switch (calc) {
                    case "+":
                        answer = answer + Integer.parseInt(calcString[i]);
                        break;
                    case "-":
                        answer = answer - Integer.parseInt(calcString[i]);
                        break;
                    case "*":
                        answer = answer * Integer.parseInt(calcString[i]);
                        break;
                    case "/":
                        answer = answer / Integer.parseInt(calcString[i]);
                        break;
                }

            }

        }

        return answer;
    }

}
