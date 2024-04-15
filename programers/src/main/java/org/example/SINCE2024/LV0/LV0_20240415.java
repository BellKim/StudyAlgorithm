package org.example.SINCE2024.LV0;

import java.util.Scanner;

public class LV0_20240415 {
//    https://school.programmers.co.kr/learn/courses/30/lessons/120818
/*
10만 원 이상 사면 5%
30만 원 이상 사면 10%
50만 원 이상 사면 20%를 할인해줍니다.
구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("옷의 가격을 입력하고 할인된 가격을 알아보세요");
        System.out.println(solution(scanner.nextInt()));
    }


    public static int solution(int price) {
        int answer = price;

        if(price > 0 && price < 100000) { // -0%
            answer = answer;
        }
        else if(price >= 100000 && price < 300000) { // -5%
            answer = (int)(answer-(answer*0.05));
        }
        else if(price >= 300000 && price < 500000) { //  -10%
            answer = (int)(answer-(answer*0.10));
        }
        else if(price >= 500000) { //  -20%
            answer = (int)(answer-(answer*0.20));
        }
        return answer;
    }

}
