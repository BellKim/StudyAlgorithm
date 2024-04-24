package org.example.SINCE2024.LV0;



import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240421 {


    public static void main(String[] args) {
        //solution4
//        System.out.println(solution4(23));
//        System.out.println(solution4(24));
//        System.out.println(solution4(999));

        //solution5
//        int[] res0 = solution5(1,2,3,4);
//        int[] res1 = solution5(9,2,1,3);
//        int[] res2 = solution5(1,5,4,5);
//        int[] res3 = solution5(1,2,3,4);

//        for (int re: res2) {
//            System.out.println(re);
//        }
    }



    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120833
    배열 자르기
    정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
    numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    public int[] solution1(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int[] value = numbers;
        List<Integer> intList = new ArrayList<Integer>();
        List<Integer> resInt = new ArrayList<Integer>();
        for (int val: numbers) {
            intList.add(val);
        }
        for (int i = (num1); i <= num2 ; i++) {
            // sb.append(sbs);
            resInt.add(intList.get(i));
        }
        answer = new int[resInt.size()];
        for(int i=0; i<resInt.size(); i++){
            answer[i] = resInt.get(i);
        }
        return answer;
    }

    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120836
    순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
    자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
    >> 예를들어 n=20일 경우, 1,20 2,10 4,5 10,2 20,1 로 5가 결과값으로 나와야 한다.
    식으로 구해보면 20에서 1부터 20까지 나눈수의 몫이 0 이 되도록 하면된다.
    예> 20%1=0, 20%2=0
*/
    public int solution2(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(n%i == 0){
                answer++;
            }
        }
        return answer;
    }

    /*
https://school.programmers.co.kr/learn/courses/30/lessons/120837
개미군단
개미 군단이 사냥을 나가려고 합니다.
개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만,
장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
사냥감의 체력 hp가 매개변수로 주어질 때,사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를
 return하도록 solution 함수를 완성해주세요.

 장군개미는 5의 공격력
 병정개미는 3의 공격력
 일개미는 1의 공격력을 가지고 있으며 n의 공격력으로 가질수 있는 최대 병력의 수를  산출하기
 n=23일 경우 장군4, 병졍1 총 5마리로 해결된다.
    23/5=4 나머지3
    3/3 = 1 나머지0
    0/1 = 0 나머지 0
    의 순서대로 로직을 구현 해본다.


     */
    public static int solution4(int n) {
        int answer = 0;
        final int ANT1 = 5;
        final int ANT2 = 3;
        final int ANT3 = 1;

        int solderCount = 0;
        int remainPower = n;

        //ANT1
        if(remainPower>=ANT1){
            solderCount += remainPower/ANT1;
            remainPower = remainPower%ANT1;
        }
        if(remainPower>=ANT2){
            solderCount += remainPower/ANT2;
            remainPower = remainPower%ANT2;
        }
        if(remainPower>=ANT3){
            solderCount += remainPower/ANT3;
            remainPower = remainPower%ANT3;
        }

        return answer = solderCount;
    }

    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/120808
        분수의 덧셈
        첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
        두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        분수의 최대공략수를 구할줄 알아야 풀 수 있는 문제이다.
        6/9(9분의6) 가 있을경우
        6= 1 2 3 6
        9= 1 3 9
        나눠질수 있는 숫자중 제일 큰 숫자이면서 분자와 분모가 공통인 경우를 말한다.
        즉 6과 9 에서 3 이 제일 큰 수이므로 6과 9의 최대공략수는 3이다.
        6/3 = 2, 9/3 = 3 으로 2/3이 된다.
        1에서부터 6과 9중 제일 큰 숫자까지 반복문을 돌려서
        공통적으로 나뉘어지는 제일큰수를 찾으면된다.
     */

    public static int[] solution5(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int bunmo = denom1*denom2;

        int bunja1 = (numer1*denom2) + (numer2*denom1);

        int gcd = 0; //greatest common divisor

        //최대공략수 구하기
        for(int i=1; i<=bunmo && i<= bunja1; i++){
            if(bunmo%i == 0 && bunja1%i == 0){
                gcd = i;
            }
        }
        answer[0] = bunja1/gcd;
        answer[1] = bunmo/gcd;

        return answer;
    }



}


