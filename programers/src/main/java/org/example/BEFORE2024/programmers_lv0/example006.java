package org.example.BEFORE2024.programmers_lv0;

public class example006 {

// programmers.co.kr/learn/courses/30/lessons/120583 중복된 숫자 개수
//    https://school.programmers.co.kr/learn/courses/30/lessons/120583

    /*
     *  array와 정수 n 이 매개변수로 주어질때, array에 n 이 몇개 있는지 Return 하기.
     */

    public static void main(String[] args) {

//        int [] array = {1, 1, 2, 3, 4, 5};
//        int n = 1;           //res = 2

        int [] array = {0, 2, 3, 4};
        int n = 1;           //res = 0;

        int res = solution(array, n);
        System.out.println("res = " + res);
    }

    static int solution(int[] array, int n) {
        int answer = 0;

        for(int n1 : array){
            if(n1 == n){
                answer +=1;
            }
        }


        return answer;
    }

}
