package org.example.programmers.SINCE2024.LV0;


import java.util.Scanner;

public class LV0_20240815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plese input number : ");
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.println(n+" is even");
        }else{
            System.out.println(n + " is odd");
        }

    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181944
            홀짝 구분하기
            입력받은 숫자가 짝수이면 짝수, 홀수이면 홀수입니다 를 출력하는 문제이다.

            % 를 이용하여 나머지가 0인가 아닌가를 통해 판별 할 수 있다.


     */






}
