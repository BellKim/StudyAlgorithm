package org.example.SINCE2024.LV0;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LV0_20240624 {
    public static void main(String[] args) {
        int a1= 7;	int b1 = 20;    //	1
        int a2= 11;	int b2 = 22;    //	1
        int a3= 12;	int b3 = 21;	//  2
        int a4= 16;	int b4 = 24;	//  2
        int a5= 31;	int b5 = 14;	//  2
        int a6= 5;	int b6 = 1;	    //  2
        int a7= 1;	int b7 = 30;	//  1



        System.out.println(solution1(a1, b1));
        System.out.println(solution1(a2, b2));
        System.out.println(solution1(a3, b3));
        System.out.println(solution1(a4, b4));
        System.out.println(solution1(a5, b5));
        System.out.println(solution1(a6, b6));
        System.out.println(solution1(a7, b7));

    }



    /*   https://school.programmers.co.kr/learn/courses/30/lessons/120878
        유한소수 판별하기


        소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
        분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
        유한소수가 되기 위한 분수의 조건은 다음과 같습니다.

        기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
        두 정수 a와 b가 매개변수로 주어질 때,
        a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.

    입출력 예 #1

    분수 7/20은 기약분수 입니다. 분모 20의 소인수가 2, 5 이기 때문에 유한소수입니다. 따라서 1을 return합니다.
    입출력 예 #2

    분수 11/22는 기약분수로 나타내면 1/2 입니다. 분모 2는 소인수가 2 뿐이기 때문에 유한소수 입니다. 따라서 1을 return합니다.
    입출력 예 #3

    분수 12/21는 기약분수로 나타내면 4/7 입니다. 분모 7은 소인수가 7 이므로 무한소수입니다. 따라서 2를 return합니다.


     */

    public static int solution1(int a, int b) {
        int answer = 0;

        List<Integer> aList = soinsu(a);
        List<Integer> bList = soinsu(b);
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < bList.size(); j++) {
                if(Objects.equals(aList.get(i), bList.get(j))){
                    aList.remove(i);
                    bList.remove(j);
                }
            }
        }

        for (int i = 0; i < bList.size(); i++) {
            if(a%b == 0){
                answer = 1;
            }else if(!((int)bList.get(i) == 2 || (int)bList.get(i) == 5 || bList.get(i) == b)){
                answer = 2;
            }else if(bList.size()== 1 && (int)bList.get(i) == 1) {
                answer = 1;
            }else{
                answer = 1;
            }
        }


        return answer;
    }

    private static List<Integer> soinsu(int n) {
        List<Integer> insuList = new ArrayList<>();
        int val = n;
        for (int i = 2; i <= n; i++) {
            while(n%i == 0){
                n = n/i;
                insuList.add(i);
            }
        }
        if(insuList.size() == 0){
            insuList.add(1);
        }
        return insuList;
    }

    //다른사람 풀이 참고
    public static int solution2(int a, int b) {
        ArrayList<Integer> resultA = new ArrayList<>();
        ArrayList<Integer> resultB = new ArrayList<>();

        int i = 2;
        while (a != 1) {
            if (a % i == 0) {
                resultA.add(i);
                a /= i;
            }
            else i++;
        }

        i = 2;
        while (b != 1) {
            if (b % i == 0) {
                resultB.add(i);
                b /= i;
            }
            else i++;
        }

        for (Integer num : resultA) {
            if (resultB.contains(num)) resultB.remove(num);
        }

        while (resultB.contains(2)) {
            resultB.remove((Integer)2);
        }

        while (resultB.contains(5)) {
            resultB.remove((Integer)5);
        }

        return resultB.size() == 0 ? 1 : 2;
    }





    @Test
    public void test1() {
        double a = 7;
        double b = 20;
        System.out.println(a/b);
    }




}
