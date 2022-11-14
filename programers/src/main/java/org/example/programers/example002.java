package org.example.programers;

public class example002 {

// programers.co.kr/learn/courses/30/lessons/120830

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double res = solution(numbers);
        System.out.println("res = " + res);
    }
    static double solution(int[] numbers) {
        double answer = 0;

        for(int num : numbers){
            answer += num;
        }

        answer= answer/numbers.length;




        return answer;
    }

}
