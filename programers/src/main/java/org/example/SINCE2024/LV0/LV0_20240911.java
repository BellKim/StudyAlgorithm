package org.example.SINCE2024.LV0;


public class LV0_20240909 {
    public static void main(String[] args) {

        int a1 = 9; 	int b1 = 91;	//991
        int a2 = 89;	int b2 = 8;	    //898



        System.out.println(solution1(a1, b1));
        System.out.println(solution1(a2, b2));


    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /* https://school.programmers.co.kr/learn/courses/30/lessons/181939
        더 크게 합치기
        연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
        12 ⊕ 3 = 123
        3 ⊕ 12 = 312
        양의 정수 a와 b가 주어졌을 때, a ⊕ b 와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
        단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

        설명>>>
        주어진int형을 문자열 합치듯 합친뒤, 숫자형태로 변형한뒤, 비교하여 크고 작음에 따라서 리턴한다.
        문자를 숫자로 : Integer.parseInt()
        숫자를 문자로 : Integer.toString()

     */
    public static int solution1(int a, int b) {
        int answer = 0;

        int add1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int add2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));

        if(add1 > add2) {
            answer = add1;
        }else if(add2 > add1) {
            answer = add2;
        }else{
            answer = add1;
        }

        return answer;
    }





}

