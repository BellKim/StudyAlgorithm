package org.example.SINCE2024.LV0;

import org.junit.Test;

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
//        int[][] board1 ={{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
//        int[][] board2 ={{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
//        int[][] board3 ={{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
//        System.out.println(solution1(board1));

        String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        for (String res: solution2(quiz1)) {
            System.out.println(res);
        }




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




    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120907
    OX퀴즈
    덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
    수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

    제한사항
    연산기호와 숫자 사이는 공백이 존재한다.
    음수 표시시 마이너스기호와 숫자 사이에는 공백이 존재하지 않는다.
    3 + 2 = 8
    3 + -2 = 1 << 이런식
    연산자는 + 와 - 둘중 하나로 한정한다.

    예시:
        ["3 - 4 = -3", "5 + 6 = 11"]	["X", "O"]
        ["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"]	["O", "O", "X", "O"]

    String 배열내의 수식을 읽는 로직을 구성해야 할 것 으로 보인다.
    split으로 수식과 수를 구분지어두고 수식과 숫자 사이를 모두 공백으로 구분하기때문에 " " 으로 split 한다.
    문자열 배열을 리스트에 저장한 후에  ( String[] ) 리스트에 있는 모든 수식을 검사한뒤에 결과를 리턴한다.
    수식의 형태는 정해져 있다 (숫자 [연산자 +,-] 숫자 = 숫자 )  리스트 하나당 5개 배열로 저장된다.
    순서에 맞게 계산식을 검사한뒤 answerList에 저장하면 된다.
     */

    public static String[] solution2(String[] quiz) {
        String[] answer = {};
        List<String[]> stringList = new ArrayList<String[]>();
        List<String> answerList = new ArrayList<String>();

        //분리된 수식 리스트업
        for (String strQuiz: quiz) {
            String[] splitString = strQuiz.split(" ");
            stringList.add(splitString);
        }
        // 수식계산
        for (String[] strQuiz: stringList) {
            if(strQuiz[1].equals("+")){
                if(Integer.parseInt(strQuiz[0]) + Integer.parseInt(strQuiz[2]) == Integer.parseInt(strQuiz[4])) { //정답
                    answerList.add("O");
                }else { //오답  X
                    answerList.add("X");
                }

            }else {
                if(Integer.parseInt(strQuiz[0]) - Integer.parseInt(strQuiz[2]) == Integer.parseInt(strQuiz[4])) { //정답
                    answerList.add("O");
                }else { //오답  X
                    answerList.add("X");
                }
            }
        }

        answer = new String[answerList.size()];
        for (int m = 0; m < stringList.size(); m++) {
            answer[m] = answerList.get(m);
        }

        return answer;
    }


    @Test
    public void stringTest(){
        String quizString = "333 - 444 = -3555";
        String[] test = quizString.split(" ");
        for (String str: test) {
            System.out.println(str);
        }
    }


}
