package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LV0_20240417 {
    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120813

    문> 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

    n의 범위는 1 ≤ n ≤ 100 사이이며
    n	result
    10	[1, 3, 5, 7, 9]
    15	[1, 3, 5, 7, 9, 11, 13, 15]
    result 와 같이 리턴되도록한다.

    > for 문으로 숫자를 순차적으로 탐색하고, 홀수조건(n%2 = 1) 의 조건을 이용하여 값을 산출한다.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] result = solution(scanner.nextInt());

        for (int res: result) {
            System.out.println(res);
        }
    }

    public static int[] solution(int n) {
        int[] answer = {};
        List<Integer> intList = new ArrayList<Integer>();

        //입력받은 숫자를 토대로 홀수만 리스트에 넣어준다.
        for (int m = 0; m <= n; m++) {
            if(m%2 == 1){
                intList.add(m);
            }
        }

        //list를 int[] 배열에 대입시킨다.
        answer = new int[intList.size()];
        for (int i = 0 ; i < intList.size() ; i++)
            answer[i] = intList.get(i).intValue();

        return answer;

        //타인정답
        //return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }

}
