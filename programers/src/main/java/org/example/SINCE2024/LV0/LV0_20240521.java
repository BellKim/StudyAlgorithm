package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240521 {
    public static void main(String[] args) {

        String mystring1 = "aAb1B2cC34oOp"; //37
        String mystring2 = "1a2b3c4d123Z"; //133

        System.out.println(solution1(mystring1));
        System.out.println(solution1(mystring2));





    }

    /* https://school.programmers.co.kr/learn/courses/30/lessons/120864
    숨어있는 숫자의 덧셈
    소문자, 대문자, 자연수로 이루어진 my_string 에서 자연수만 뽑아서 더한뒤 합을 리턴해준다.
    "aAb1B2cC34oOp" 의 경우 1 2 34 의 숫자가 있으며, 다 더하면 37이된다.
    "1a2b3c4d123Z" 의 경우 1 2 3 4 123 이고 총합은 133 이 된다.

     */
    public static int solution1(String my_string) {
        int answer = 0;
        String[] splits = my_string.split("");
        char[] charStr = new char[splits.length];

        for (int i = 0; i < splits.length; i++) {
            charStr[i] = splits[i].charAt(0);
        }

        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < charStr.length; i++) {
            if((int)charStr[i] >=48 && (int)charStr[i] <=57   ){ //48, 57 0~9
                temp.append(String.valueOf(charStr[i]));
            }else{
                temp.append(" ");
            }
        }

        String[] val = temp.toString().split(" ");
        for (int i = 0; i < val.length; i++) {
            if(!val[i].equals("")){
                answer += Integer.parseInt(val[i]);
            }
        }
        return answer;
    }

    @Test
    public void test1() {
        String my_string = "aAb1B2cC34oOp";
        String[] splits = my_string.split("");
        char[] charStr = new char[splits.length];

        for (int i = 0; i < splits.length; i++) {
            charStr[i] = splits[i].charAt(0);
        }

        System.out.println((int)charStr[0]);
        System.out.println(
                (char)((int)charStr[0])
        );






    }


}
