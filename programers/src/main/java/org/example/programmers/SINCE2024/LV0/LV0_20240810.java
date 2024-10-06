package org.example.programmers.SINCE2024.LV0;


import java.util.ArrayList;
import java.util.List;

public class LV0_20240810 {
    public static void main(String[] args) {
        int num1 = 98; int n1 = 2;	    //1
        int num2 = 34;	int n2 = 3; 	//0

        System.out.println(solution1(num1, n1));
        System.out.println(solution1(num2, n2));


    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181937
        n 의 배수
        num	n	result
        98	2	1
        34	3	0



     */

    public static int solution1(int num, int n) {
        int answer = 0;
        return num % n == 0 ? 1 : 0;
        // return answer;
    }






}
