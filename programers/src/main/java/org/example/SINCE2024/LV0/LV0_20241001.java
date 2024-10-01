package org.example.SINCE2024.LV0;


public class LV0_20241001 {
    public static void main(String[] args) {

        int[] num_list1 = {4, 2, 6, 1, 7, 6};//	17
        int[] num_list2 = {-1, 2, 5, 6, 3}; //	8


        System.out.println(solution1(num_list1));
        System.out.println(solution1(num_list2));


    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /* https://school.programmers.co.kr/learn/courses/30/lessons/181887
        홀수 vs 짝수
        num_list 라는 배열이 주어지는데 홀수 번째 숫자와 짝수번째 숫자와 구분지어서 홀수그룹 짝수그릅의 수를 각각 더한뒤 큰 수를 리턴한다.

     */
    public static int solution1(int[] num_list) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if(i%2 == 0) {
                even += num_list[i];
            }else{
                odd += num_list[i];
            }
        }

        if(even > odd) {
            return even;
        }else{
            return odd;
        }
    }

}

