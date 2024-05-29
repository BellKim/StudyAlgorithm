package org.example.SINCE2024.LV0;

import org.junit.Test;

public class LV0_20240529 {
    public static void main(String[] args) {
        int[][] dots1 = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};	//1
        int[][] dots2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};	//4

        System.out.println(solution1(dots1));
        System.out.println(solution1(dots2));

    }

    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/120860
        직사각형 넓이 구하기
        좌표4개를 가지고 직사각형의 넓이를 구하면 된다.
        두 선분의 길이를 구하기 위해서는 x끼리 빼고, y끼리 빼면 되는데 대각선의 길이에 있는 점과의 거리를 구하면 넓이를 구할수가 없다.
        (0,1)    (1,1)
        ㅇ        ㅇ

        ㅇ        ㅇ
        (0,0)     (1,0)  으로 주어졌을때 x 와 y의 길이를 구하기 위해서 좌표를 보고 알 수있다.

        0,0 0,1 을 보면 x좌표는 동일하고 y좌표가 차이가 있다.

        즉!!!, x가 같으면서 y좌표가 다른두 좌표를 찾아 y좌표를 구하고,
              y좌표가같으면서 x좌표가 다른것이 x좌표의 길이가 된다.

        점을 순차적으로 비교해야하므로 배열의 번호순서를 잘 비교해야한다
        // 비교 i가 0일때,1과 비교
        // 비교 i가 1일때,2과 비교
        // 비교 i가 2일때,3과 비교
        // 비교 i가 3일때,0과 비교


     */

    public static int solution1(int[][] dots) {
        int answer = 0;

        int width = 0;
        int height = 0;

        for (int i = 0; i < dots.length; i++) {
            for (int k = 0; k < dots[i].length; k++) {

                if(i == k ) ++k; //동일한 배열을 비교할시에는 pass한다.

                //x가 같으면서 y좌표가 다른두 좌표를 찾아 y좌표를 구하고,
                if ((dots[i][0] == dots[k][0]) && (dots[i][1] != dots[k][1])) {
                    width = dots[k][1] - dots[i][1];
                } else if ((dots[i][0] != dots[k][0]) && (dots[i][1] == dots[k][1])) {
                    //y좌표가같으면서 x좌표가 다른것이 x좌표의 길이가 된다.
                    height = dots[k][0] - dots[i][0];
                } else {
//                    System.out.println("error");
                }
            }
        }
        answer = Math.abs(width) * Math.abs(height);

        return answer;
    }

    @Test
    public void test1() {
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        System.out.println("=====================");
        System.out.println(dots.length);
        System.out.print(dots[0][0]); System.out.println(dots[0][1]);
        System.out.print(dots[1][0]); System.out.println(dots[1][1]);
        System.out.print(dots[2][0]); System.out.println(dots[2][1]);
        System.out.print(dots[3][0]); System.out.println(dots[3][1]);
        System.out.println("=====================");
    }


}
