package org.example.SINCE2024.LV0;

import org.junit.Test;

public class LV0_20240525 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, -3, 4, -5}; //	15
        int[] numbers2 = {0, -31, 24, 10, 1, 9};	//240
        int[] numbers3 = {10, 20, 30, 5, 5, 20, 5};//	600
        int[] numbers4 = {1000, 1000};//	1000000
        int[] numbers5 = {-1000, 1000};//	-1000000

//        System.out.println(solution1(numbers1));
//        System.out.println(solution1(numbers2));
//        System.out.println(solution1(numbers3));
//        System.out.println(solution1(numbers4));
        System.out.println(solution1(numbers5));


    }

    /* https://school.programmers.co.kr/learn/courses/30/lessons/120862
    최대값 만들기
    numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록
    solution 함수를 완성해주세요.
    입출력 예 #1
    두 수의 곱중 최댓값은 -3 * -5 = 15 입니다.
    입출력 예 #2
    두 수의 곱중 최댓값은 10 * 24 = 240 입니다.
    입출력 예 #3
    두 수의 곱중 최댓값은 20 * 30 = 600 입니다.

    포인트> 1 ~ n 까지 순차적으로 전부 비교하면 된다.
    2중포문으로 1을 1~n 까지 2를 1~n 까지 .... n 을 1~n까지 ....
    그러면 answer  기준값 보다 값이 크면 큰값으로 바꿔준다.

    추가로, answer 초기값이 0 이며,  제일 큰 수가 음수일경우에는 초기값 0보다 크니까 결과값이 0으로 나올 수 밖에 없다.
    그래서 초기값을 잡는데 제한사항 2번에 의거, numbers 배열이 2개 이상이니까, 0번,1번 배열로 초기값을 잡아주고
    코드를 시작하게되면 0이 출력될 일이 없다.  

     */
    public static int solution1(int[] numbers) {
        int answer = (numbers[0]) * (numbers[1]);
        for (int k = 0; k < numbers.length; k++) {
            for (int m = 0; m < numbers.length; m++) {
                if(k != m ){    //동일한 값을 곱하는것은 해당하지 않음.
                    int calc = (numbers[k]) * (numbers[m]);
                   if(calc > answer){  //곱한값이 기존값보다 크면 답으로 변경.
                       answer = calc;
                   }
                }
            }
        }
        return answer;
    }

    @Test
    public void test1() {
        int[] numbers5 = {-1000, 1000};
        int calc = (numbers5[0]) * (numbers5[1]);

        System.out.println(calc);

    }

}
