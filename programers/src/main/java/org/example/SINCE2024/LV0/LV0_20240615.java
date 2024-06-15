package org.example.SINCE2024.LV0;

public class LV0_20240615 {
    public static void main(String[] args) {
        int num1 = 15;   //	25
        int num2 = 40;	//  76

        System.out.println(solution1(num1));
//        System.out.println(solution1(num2));


    }

    public static void printarr(int[] num){
        System.out.println("print 시작");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }

    /*   https://school.programmers.co.kr/learn/courses/30/lessons/120871
            저주의 숫자 3
            1 -	1
            2 -	2
            3 -	4   3 4
            4 -	5   5
            5 -	7   6 7
            6 -	8   8
            7 -	10  9 10
            8 -	11  11
            9 -	14  12 13 14
            10-	16  15 16
            11-  17  17
            12-  19  18 19
            13-  20  20
            14-  22  21 22
            15-  24  23 24 25
            16-  26
            17-  27  28
            18-  29
            19-  30  31 32
            20-  33

            1. 숫자가 증가하면 3x 마을의 수도 1증가시킨다.
            2. 증가시킨수에 10의 자리수던 1의자리수던 3 이 들어가면 +1 증가시킨다.
            3. 증가시킨 수가 3의 배수이면 +1 증가시킨다.
            4. 2번, 3번의 조건을 이용하여 조건이 충족될때까지 반복한다.

            다른방법
            다른사람이 푼 방법처럼 int n 을 1에서 n 까지 반복하는것은 나의 풀이와 동일하다
            그러나 나는 answer 의 증가시키는데 조건을 추가하느라 바빴다.
                - 2가지 조건이(각자리수의 숫자가 3이 있거나, 3의 배수일 경우) 포함되면 answer의 값을 1증가
            그러나 반대로 생각해서 두 경우가 포함이 되면 반복문의 횟수를 1줄이면 두 조건이 충족될 때까지 무한 반복이 될 것.
                for 반복문{
                    answer+;
                    if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                        i--;
                    }
               }
            위와같이 하면 코드 양도 줄고 한눈에 알아보기도 편하다

     */

    public static int solution1(int n) {
        int answer = 0;


       for (int i = 1; i <= n; i++) {
           //기본증가
           answer ++;

            if(i == 9){
                System.out.println();
            }

            //status는 3의 배수이거나, 각 자리수에서 3이 모두 해당되지 "않았을 경우" 2가 되며, 그 전까지는 무한루프 돌린다.
           int status = 0;
           while(true) {
               //3배수 탐색
               if (answer % 3 == 0) {
                   answer++;
               } else {
                   status++;
               }

               //각 자리수에 3포함여부 탐색하고 3이 포함되면 checkval의 값을 1증가시켜준다.
               String[] numbers = Integer.toString(answer).split("");
                int checkval = 0;
                for (String num1 : numbers){
                    if(num1.equals("3")){
                        checkval++;
                    }
               }
                //각 자리의 수 중에서 3이 하나라도 포함되면 answer값을 1증가시켜준다.
                if(checkval >= 1){
                    answer++;
                }else{
                    status++;
                }

               if(status == 2){
                   status = 0;
                   break;
               }
               status = 0;
           }

       }

        return answer;
    }




}
