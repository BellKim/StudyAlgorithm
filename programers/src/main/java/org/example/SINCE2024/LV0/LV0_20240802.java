package org.example.SINCE2024.LV0;


public class LV0_20240802 {
    public static void main(String[] args) {



        int[] arr1 = {12, 4, 15, 1, 14}; //	11

        System.out.println(solution(arr1));


    }

    public static void printarr(String[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*     https://school.programmers.co.kr/learn/courses/30/lessons/181880
        1로 만들기

        음...

     */

    public static int solution(int[] arr) {
        int answer = 0;

        for (int i = 0 ;i < arr.length;i++) {
            while(arr[i] != 1) {
                if (arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else {
                    arr[i] -= 1;
                    arr[i] /= 2;
                }
                answer++;
            }
        }
        return answer;
    }




}

