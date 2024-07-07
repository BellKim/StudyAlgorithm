package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240707 {
    public static void main(String[] args) {


        int[] lines1 = {5, 1, 4};   //	[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
        int[] lines2 = {6, 6};	    //    [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
        int[] lines3 = {1};         //	[1]





        printarr(solution1(lines1));
        printarr(solution1(lines2));
        printarr(solution1(lines3));

    }

    public static void printarr(int[] num){
        System.out.println("print 시작");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*   https://school.programmers.co.kr/learn/courses/30/lessons/181861
        배열의 원소만큼 추가하기
        num의 갯수만큼 출력하도록 한다.
     


     */

    public static int[] solution1(int[] arr) {
        int[] answer = {};
        List<Integer> integreList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                integreList.add(arr[i]);
            }
        }

        answer = integreList.stream().mapToInt(i -> i).toArray();


        return answer;
    }

}
