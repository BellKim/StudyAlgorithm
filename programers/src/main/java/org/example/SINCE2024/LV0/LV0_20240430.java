package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LV0_20240430 {

    public static void main(String[] args) {
        int[] array1 = {1,8,3};
        int[] array2 = {9, 10, 11, 8};

        for (int num:array2) {
            System.out.println(Arrays.toString(solution1(array2)));
        }
    }




    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120899
    가장 큰 수 찾기
    정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    제일큰수를 0번배열, 큰수가 위치한 배열의 번호를 1번배열에 넣어주세요

     */
    public static int[] solution1(int[] array) {
        int[] answer = new int[2];
        List<Integer> intList = new ArrayList<Integer>();
        for (int num: array) {
            intList.add(num);
        }
        Collections.sort(intList);

        for (int k = 0; k < array.length; k++) {
            if(intList.get(intList.size()-1) == array[k]){
                answer[1] = k;

            }
        }
        answer[0] = intList.get(intList.size()-1);

        return answer;
    }




}
