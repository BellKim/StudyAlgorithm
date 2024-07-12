package org.example.SINCE2024.LV0;

public class LV0_20240712 {
    public static void main(String[] args) {

//        arr	n	result
        int[] arr1 = {49, 12, 100, 276, 33};	int n1 = 27;	    //[76, 12, 127, 276, 60]
        int[] arr2 = {444, 555, 666, 777};	    int n2 = 100;	    //[444, 655, 666, 877]
        printarr(solution1(arr1, n1));
        printarr(solution1(arr2, n2));

    }

    public static void printarr(int[] num){
        System.out.println("print 시작");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*      https://school.programmers.co.kr/learn/courses/30/lessons/181854
    배열의 길이에 따라 다른 연산하기

     정수 배열 arr과 정수 n이 매개변수로 주어집니다.
     arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.

     */

    public static int[] solution1(int[] arr, int n) {
        int[] answer = {};

        for(int i=(arr.length+1)%2; i<arr.length; i+=2) {
            arr[i] += n;
        }

        answer = arr;

        return answer;
    }



}
