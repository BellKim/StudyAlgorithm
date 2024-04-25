package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240426 {
    public static void main(String[] args) {
//        [[0, 0, 0, 0, 0],
//         [0, 0, 0, 0, 0],
//         [0, 0, 0, 0, 0],
//         [0, 0, 1, 0, 0],
//         [0, 0, 0, 0, 0]] 16

//        [[0, 0, 0, 0, 0],
//         [0, 0, 0, 0, 0],
//         [0, 0, 0, 0, 0],
//         [0, 0, 1, 1, 0],
//         [0, 0, 0, 0, 0]]	13

//        [[1, 1, 1, 1, 1, 1],
//         [1, 1, 1, 1, 1, 1],
//         [1, 1, 1, 1, 1, 1],
//         [1, 1, 1, 1, 1, 1],
//         [1, 1, 1, 1, 1, 1],
//         [1, 1, 1, 1, 1, 1]] 0
        int[][] board1 ={{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] board2 ={{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int[][] board3 ={{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
        System.out.println(solution1(board1));

    }
    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120866
    안전지대
    다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
    지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 [지뢰가 매설 된 지역 1] 과, [지뢰가 없는 지역 0] 만 존재합니다.
    지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때,
    [안전한 지역의 칸 수를 return하도록] solution 함수를 완성해주세요.
     */
    /*  순서
    1. 쥐뢰(배열값이1인것) 위치 좌표 산출
    2. 배열 복제
    3. 산출된 좌표 기준으로 좌우상화 대각선방향의 값 1로 산출.
        0으로 되있는 영역을 1로 변경
    4. 복제된 좌표에서 설정된 1을 제외한 나머지 0의 갯수를 산출한다.
    -> 산출된 갯수를 return 값으로 내보낸다.
     */
    public static int solution1(int[][] board) {
        int answer = 0;

        int[][] cloneArray = board;
        List<int[]> minePosition = new ArrayList<int[]>();


        //죄뢰의 위치좌표 입력
        for (int i = 0; i < board.length ; i++) {
            for (int k = 0; k < board[i].length ; k++) {
                if(board[i][k] == 1){
                    minePosition.add(new int[] {i,k});  //좌표를 i,k 형태로 저장.
                }
            }
        }

        // 클론어레이 보드에 쥐뢰 위치기준 8방향 0 -> 1로 변경.
        // 단, 배열의 사이즈를 넘어가는 경우에는 조건문으로 조회되지 않도록 제외처리 해줄것.

        for (int i = 0; i < minePosition.size(); i++) {
            int posx = minePosition.get(i)[0];
            int posy = minePosition.get(i)[1];
            int xArrLength = board.length;
            int yArrLength = board[0].length;
            // cloneArray 의 안전지대(0) 을 위험지대(1)로 변경
            //8방향 안전지대 제거-> x,y좌표값 기준으로 8방향 변경
            /*  -- -0 -+        좌상 상 우상
                0- xy 0+        좌  xy 우    -> yArrayLength 값이 오버하는지 확인 >>
                +- +0 ++        좌하 하 우하
                                    V
                           << xArrLength 값이 오버하는지 확인 >>
            */
            //좌상
            if (posx-1 >= 0 && posy-1 >= 0){
                cloneArray[posx-1][posy-1] = 1;
            }
            //상
            if (posx-1 >= 0 && posy == posy ){
                cloneArray[posx-1][posy] = 1;
            }
            //우상  <<<<<<<<
            if (posx-1 >= 0 && posy+1 < yArrLength){
                cloneArray[posx-1][posy+1] = 1;
            }
            //좌
            if (posx == posx && posy-1 >= 0 ){
                cloneArray[posx][posy-1] = 1;
            }
            //우
            if (posx == posx && posy+1 < yArrLength ){
                cloneArray[posx][posy+1] = 1;
            }
            //좌하 1,1 -> 2,0
            if (posx+1 < xArrLength && posy-1 >= 0){
                cloneArray[posx+1][posy-1] = 1;
            }
            //하
            if (posx+1 < xArrLength && posy == posy ){
                cloneArray[posx+1][posy] = 1;
            }
            //우하
            if (posx+1 < xArrLength && posy+1 < yArrLength){
                cloneArray[posx+1][posy+1] = 1;
            }

        }//안전지대 변환 끝.

        //변형배열 출력확인
        /*
        for (int i = 0; i < cloneArray.length ; i++) {
            for (int k = 0; k < cloneArray[i].length ; k++) {
                System.out.print(cloneArray[i][k] + " ");
            }
            System.out.println();
        }
        */
        for (int i = 0; i < cloneArray.length ; i++) {
            for (int k = 0; k < cloneArray[i].length ; k++) {
                if(cloneArray[i][k] == 0)
                    answer++;
            }

        }
        return answer;
    }
}
