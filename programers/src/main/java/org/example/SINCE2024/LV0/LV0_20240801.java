package org.example.SINCE2024.LV0;

import org.junit.Test;


public class LV0_20240801 {
    public static void main(String[] args) {
        int[] arr11 = {49, 13};	        int[] arr21 = {70, 11, 2};      //	-1
        int[] arr12 = {100, 17, 84, 1};	int[] arr22 = {55, 12, 65, 36}; //	1
        int[] arr13 = {1, 2, 3, 4, 5};	int[] arr23 = {3, 3, 3, 3, 3};  //	0

        System.out.println(solution1(arr11, arr21));
        System.out.println(solution1(arr12, arr22));
        System.out.println(solution1(arr13, arr23));







    }

    public static void printarr(String[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181856?language=java

        배열 비교하기

        두배열의 길이중
        arr1, arr2 에서 arr1이 크면 1  arr2 이 크면 -1
        같으면 0 을 리턴한다.





     */

    public static int solution1(int[] arr1, int[] arr2) {
        int answer = 0;

        if (arr1.length != arr2.length) {
            if(arr1.length > arr2.length){
                return 1;
            }else{
                return -1;
            }
        } else if (arr1.length == arr2.length) {
            //길이가 같으면 두 배열간의 총합을 구한다.
            int num_arr1 = 0;
            int num_arr2 = 0;
            for(int i = 0; i<arr1.length; i++){
                num_arr1 += arr1[i];
                num_arr2 += arr2[i];
            }
            if(num_arr1 > num_arr2){
               return 1;
            }else if(num_arr1 < num_arr2){
                return -1;
            }

        }

        return 0;
    }
    @Test
    public void test1() {

    }




}

