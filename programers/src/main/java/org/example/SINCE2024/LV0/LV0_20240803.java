package org.example.SINCE2024.LV0;


public class LV0_20240803 {
    public static void main(String[] args) {


        int[] num_list1 = {2, 1, 6};	    //[2, 1, 6, 5]
        int[] num_list2 = {5, 2, 1, 7, 5};	// [5, 2, 1, 7, 5, 10]


        printarr(solution1(num_list1));
        printarr(solution1(num_list2));

    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*   https://school.programmers.co.kr/learn/courses/30/lessons/181927
        마지막 두 원소

        마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을         (마지막원소 - 마지막 두번쨰 원소) 추가
        마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가       (마지막원소 * 2) 추가


        하여 return하도록 solution 함수를 완성해주세요

        위 두개의 조건을 3항연산자를 사용하는 케이스가 있다.



     */

    public static int[] solution1(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];

            if(i == num_list.length-1){
                if(num_list[num_list.length-1]>num_list[num_list.length-2]){
                    //(마지막원소 - 마지막두번쨰원소)
                    answer[num_list.length] = num_list[num_list.length-1] - num_list[num_list.length-2];

                }else{
                    //(마지막원소 * 2) 추가
                    answer[num_list.length] = num_list[num_list.length-1] * 2;
                }
            }
        }
        return answer;
    }





}

