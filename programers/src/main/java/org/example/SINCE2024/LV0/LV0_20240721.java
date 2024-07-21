package org.example.SINCE2024.LV0;

import java.util.Scanner;

public class LV0_20240721 {
    public static void main(String[] args) {
        System.out.println(solution1("tests"));


    }



    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181949
        대소문자 바꿔서 출력하기

        아스키코드표를 이용하여 대문자범위, 소문자범위의 숫자를 반대로
        소문자범위의 숫자로 (+32) 대문자숫자의 범위로(-32) 로 변형하도록 조건문을 걸어서 수행하였다.

        다른사람의 풀이를 보니, if 조건문을 통해서  .isUppercase() 와 toUpperCase() 메소드를 이요해서 풀었다.
        isUpperCase() 의 경우 true false 를 리턴해주는 메소드였다.
        

     */
    public static String solution1(String myString) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        System.out.println("input data : ");
        String[] strArr = a.toString().split("");
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].charAt(0) >= 97 && strArr[i].charAt(0) <= 122){
                //-32
                sb.append((char)((int)(strArr[i].charAt(0))-32));

            }else if(strArr[i].charAt(0) >= 65 && strArr[i].charAt(0) <= 90){
                //+32
                sb.append((char)((int)(strArr[i].charAt(0))+32));
            }
        }


        System.out.println(a);
        return a.toString();
    }

}

