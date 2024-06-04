package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.*;

public class LV0_20240604 {
    public static void main(String[] args) {
        int[][] dots1 = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};	//1
        int[][] dots2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};	//0
        int[][] dots3 = {{1, 4}, {3, 8}, {5, 12}, {11, 6}};	//0
        int[][] dots4 = {{1, 2}, {5, 1}, {3, 6}, {6, 3}};	//1
        int[][] dots5 = {{1, 1}, {4, 4}, {1, 3}, {4, 1}};	//1
        int[][] dots6 = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};	//1

        int[][] dots7 = {{1, 2}, {2, 1}, {3, 4}, {4, 5}};	//1
        int[][] dots8 = {{1, 1}, {2, 2}, {3, 3}, {3, 1}};	//1


        System.out.println(solution1(dots1));
        System.out.println(solution1(dots2));
        System.out.println(solution1(dots3));
        System.out.println(solution1(dots4));
        System.out.println(solution1(dots5));
        System.out.println(solution1(dots6));
        System.out.println(solution1(dots7));
        System.out.println(solution1(dots8));
    }
/*  https://school.programmers.co.kr/learn/courses/30/lessons/120875
    평! 행!
    좌표가 4개 주어진다.
    4개의 좌표중 2개 - 2개 의 선분을 그었을때 평행 한가를 보면된다.
    평행하다는것은 기울기가 같다는것이며 기울기를 구하는 공식은
    "(y의 증가량 / x증가량)" 으로 구한다.
   ㅣ
   ㅣ             ㅇ(3,8)
   ㅣ                             ㅇ(11,6)
   ㅣ     ㅇ(1,4)
   ㅣ                     ㅇ(9,2)
---+--------------------------------------------
    ㅇ(0,0)

    기울기가 같다면 평행할것이고, 기울기가 다르면 언젠가 두 직선은 만날것이다.

    // 의 방향기울기
    (1,4) (3,8) 의 기울기  (8-4)/(3-1) = 4/2 = 2
    (11,6) (9,2) 의 기울기  (6-2)/(11-9) = 4/2 = 2
    기울기는 같다.

    (3,8) (9,2) 의 기울기  (8-2)/(9-3) = 6/6 = 1
    (11,6) (9,2) 의 기울기  (6-2)/(11-9) = 4/2 =  2 (기울기가 다르다)


   ㅣ                    ㅇ(3,3)
   ㅣ
   ㅣ             ㅇ(2,2)
   ㅣ
   ㅣ     ㅇ(1,1)         ㅇ(3,1)
   ㅣ----------------------------------------
        동일한 기울기가 2개를 초과할경우 평행으로 처리한다.

    ************************************************
    평행이 되기 위해서는 한 점에서 두개의 선이 나가는 경우는 배제한다.
    그러면 4개의 점에서 나올수 있는 케이스는 4개뿐이다.
    ************************************************



*/
    public static int solution1(int[][] dots) {
        int answer = 0;
//        0 1, 2 3
//        1 2, 0 3
//        0 2, 1 3

        if(
                (calcPrrr(dots,0,1) == calcPrrr(dots,2,3))
                ||(calcPrrr(dots,1,2) == calcPrrr(dots,0,3))
                ||(calcPrrr(dots,0,2) == calcPrrr(dots,1,3))
        ){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }


    public static double calcPrrr(int[][] dots, int x, int y) {
        int xLength = dots[x][0] - dots[y][0];
        int yLength = dots[x][1] - dots[y][1];

        if(xLength == 0) {
            xLength = 1;
        }else if(yLength == 0) {
            yLength = 1;
        }

        return (double) Math.abs(yLength) / (double)Math.abs(xLength);

    }






    @Test
    public void test1() {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};	//1
        System.out.println(dots.length);

        System.out.print(dots[0][0] + " / "); System.out.println(dots[0][1]);
        System.out.print(dots[1][0] + " / "); System.out.println(dots[1][1]);
        System.out.print(dots[2][0] + " / "); System.out.println(dots[2][1]);
        System.out.print(dots[3][0] + " / "); System.out.println(dots[3][1]);

        System.out.println("=====================");
    }
    @Test
    public void test2() {

        HashMap<Double,Integer> degreeCount = new HashMap<>();
        degreeCount.put(2.0,1);
//        degreeCount.replace(2.0, 1, 1+1);
        degreeCount.replace(2.0, degreeCount.get(2.0), degreeCount.get(2.0)+1);

        System.out.println(degreeCount.get(2.0));


    }


}
