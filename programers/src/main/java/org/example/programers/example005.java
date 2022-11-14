package org.example.programers;

public class example005 {

// programmers.co.kr/learn/courses/30/lessons/120585 머쓱이보다 키 큰사람
//    https://school.programmers.co.kr/learn/courses/30/lessons/120585

    /*
     *  input  사람들 보다 height 가 큰사람 (보다큰, 초과인사람) 의 수를 구하기.
     */

    public static void main(String[] args) {

//        int [] input = {149, 180, 192, 170};
//        int height = 167;           //res = 3

        int [] input = {180, 120, 140};
        int height = 190;         //res = 0

        int res = solution(input, height);
        System.out.println("res = " + res);
    }

    static int solution(int[] array, int height) {
        int answer = 0;

        for(int arr : array){
            if(arr > height){
                answer += 1;

            }
        }



        return answer;
    }

}
