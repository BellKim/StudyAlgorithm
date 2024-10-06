package org.example.programmers.SINCE2024.LV0;



public class LV0_20240816 {
    public static void main(String[] args) {
//        a	b	result
        int a1= 2;	int b1=91;  //	364
        int a2= 91; int b2 = 2; //	912

    }

    public static void printarr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }


    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181938
        두 수의 연산값 비교하기

        문제 :
            12 ⊕ 3 = 123
            3 ⊕ 12 = 312
            양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
            단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.

        해설 :
        주어진 두 수를 가지고 2개의 숫자 산출 방식을 통해 나온 값을 비교하여 더 큰값을 리턴한다.
        패턴1. a값과 b값의 문자열의 합을 int 형태로 변경.
        패턴2. 2 * a * b 의 계산값

        패턴1의 값과 패턴 2의 값을 서로 비교하여 더 큰숫자를 리턴 하면 된다.

        두 수중 큰 수를 리턴하는데, 처음에나는 삼항연산자를 사용하여 answer을 리턴하였는데
        다른 코드를 보니 math.max() 를 이용하면 큰 수를 산출해 낼 수있다.

     */
    public static int solution1(int a, int b) {
        int answer = 0;

        int pattern1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int pattern2 = 2 * a * b;

        //answer = (pattern1 > pattern2) ? (pattern1) : (pattern2) ;
        answer = Math.max(pattern1, pattern2);

        return answer;
    }

}
