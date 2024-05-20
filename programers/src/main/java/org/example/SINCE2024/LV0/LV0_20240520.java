package org.example.SINCE2024.LV0;

import org.junit.Test;

public class LV0_20240520 {
    public static void main(String[] args) {

        String[] keyinput1 = {"left", "right", "up", "right", "right"};
        int[] board1 = {11, 11};
        String[] keyinput2 = {"down", "down", "down", "down", "down"};
        int[] board2 = {7, 9};
        String[] keyinput3 = {"up", "up", "up", "up", "up"};
        int[] board3 = {7, 9}; // 0, 4
        String[] keyinput4 = {"left", "left", "left", "left"};
        int[] board4 = {7, 9}; // 0, 4
        String[] keyinput5 = {"right", "right", "right", "right"};
        int[] board5 = {7, 9}; // 0, 4
        String[] keyinput6 = {"left", "left", "left", "left", "right", "right", "right", "right"};
        int[] board6 = {5,5}; // 2,0
        String[] keyinput7 = {"right", "right", "right", "right","left", "left", "left", "left"};
        int[] board7 = {5,5}; // -2,0
        String[] keyinput8 = {"left", "left", "left", "right"};
        int[] board8 = {3,3}; // -1, 0
        String[] keyinput9 = {"down", "down", "up", "up", "up"};
        int[] board9 = {3,3}; // 1,0


        printList(solution1(keyinput1, board1));
        printList(solution1(keyinput2, board2));
        printList(solution1(keyinput3, board3));
        printList(solution1(keyinput4, board4));
        printList(solution1(keyinput5, board5));
        printList(solution1(keyinput6, board6));
        printList(solution1(keyinput7, board7));
        printList(solution1(keyinput8, board8));
        printList(solution1(keyinput9, board9));



    }

    public static void printList(int[] data){
        System.out.println("[ "+data[0] + ", " + data[1]+" ]");
    }

    /* https://school.programmers.co.kr/learn/courses/30/lessons/120861
    캐릭터의 좌표 구하기
    [0,0]에서
    up을 누른다면 캐릭터의 좌표는 [0, 1],
    down을 누른다면 [0, -1],
    left를 누른다면 [-1, 0],
    right를 누른다면 [1, 0]입니다. 머쓱이가
    입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
    포인트>
        1. board의 사이즈를가지고 중앙 표지션을 잡아주는것.
        2. keyinput 으로 들어온 값으로 x, y좌표의 증감을 정확하게 계산하여 중앙포지션에서 계산하는것.

     */
    public static int[] solution1(String[] keyinput, int[] board) {
        int[] answer = {};
        int[] movePosition = {0,0};

        final int[] centerpositionArr = {((int)board[0]/2),  ((int)board[1]/2)};

        for (int k = 0; k < keyinput.length; k++) {
            if(keyinput[k].equals("up")){
                movePosition[0] += 0;
                movePosition[1] += 1;
            }else if(keyinput[k].equals("down")){
                movePosition[0] += 0;
                movePosition[1] += -1;
            }else if(keyinput[k].equals("left")){
                movePosition[0] += -1;
                movePosition[1] += 0;
            }else if(keyinput[k].equals("right")){
                movePosition[0] += 1;
                movePosition[1] += 0;
            }else{
                movePosition[0] = 0;
                movePosition[1] = 0;
            }

            //범위 초과시 조정
            if(movePosition[0] < -((int)board[0]/2)){
                //x가 음수일때
                movePosition[0] += 1;
            }else if(movePosition[0] > centerpositionArr[0]){
                //x가 최대 포지션을 넘어갔을때 -1수행
                movePosition[0] += -1;//centerpositionArr[0];
            } else if (movePosition[1] < -((int)board[1]/2)) {
                //y가 음수일때
                movePosition[1] += 1;
            } else if (movePosition[1] > centerpositionArr[1]) {
                //y가 최대 포지션을 넘어갔을때
                movePosition[1] += -1;
            }
        }
//

        //center position 계산

        int[] copyArr = {0,0};

        copyArr = centerpositionArr.clone();
        copyArr[0] += movePosition[0];
        copyArr[1] += movePosition[1];
            copyArr[0] -= centerpositionArr[0];
            copyArr[1] -= centerpositionArr[1];
        answer = copyArr;
        return answer;
    }

    @Test
    public void test1() {
        int test = 8;
        int test1 = 2;
        System.out.println(
                test -= test1
        );

    }


}
