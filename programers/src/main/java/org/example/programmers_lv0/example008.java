package org.example.programmers_lv0;

public class example008 {

// programmers.co.kr/learn/courses/30/lessons/120824 짝수 홀수 개수
//    https://school.programmers.co.kr/learn/courses/30/lessons/120824

    /*
     *  주어진 배열에서 홀수의 갯수,  짝수의 갯수를 산출해라.
     *  짝수, 홀수 = [짝수갯수, 홀수갯수]
     */

    public static void main(String[] args) {

//        int [] array = {1, 2, 3, 4, 5};
        int [] array = {1, 3, 5, 7};

        int res [] = solution(array);

        for(int input : res) {
            System.out.println("res = " + input);
        }

    }

    static int[] solution(int[] num_list) {
        int answer [] = {0, 0};

        for(int input : num_list){

            if(input%2 == 1){ // 홀수
                answer[1] +=1;
            }else{          //짝수
                answer[0] +=1;
            }
        }

        return answer;
    }

}
