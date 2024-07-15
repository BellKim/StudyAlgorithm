package org.example.SINCE2024.LV0;

import java.util.List;

public class LV0_20240715 {
    public static void main(String[] args) {
        String my_string1 = "programmers";	    String alp1 = "p";	//"Programmers"
        String my_string2 = "lowercase";	    String alp2 = "x";//	"lowercase"

        System.out.println(solution1(my_string1, alp1));
        System.out.println(solution1(my_string2, alp2));
    }

    public static void printarr(String[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181873
        특정한 문자를 대문자로 바꾸기
        alp의 값을 대문자로 변경하도록 한다.

        touppercase() 와 toLowerCase() 로 풀었지만, 아스키코드로 풀 수도 있다.


     */
    public static String solution1(String my_string, String alp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        List<String> stringList = List.of(my_string.split(""));
        for (int i = 0; i < stringList.size(); i++) {
            if(stringList.get(i).equals(alp)){
                sb.append(stringList.get(i).toUpperCase());
            }else{
                sb.append(stringList.get(i).toLowerCase());
            }

        }
        answer = sb.toString();

        return answer;
    }



}
