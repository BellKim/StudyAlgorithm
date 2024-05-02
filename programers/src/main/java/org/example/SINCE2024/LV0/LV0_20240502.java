package org.example.SINCE2024.LV0;

import java.util.ArrayList;
import java.util.List;

public class LV0_20240502 {
    public static void main(String[] args) {
        int[] numList1= {1, 2, 3, 4, 5, 6, 7, 8}; int n1 = 2;
        int[] numList2= {100, 95, 2, 4, 5, 6, 18, 33, 948}; int n2 = 3;

//        printDoubleArray(solution1(numList1, n1));
//        printDoubleArray(solution1(numList2, n2));

        int[] sol2Arr1 = {1, 2, 3, 4}; int sol2Int1 = 2;
        int[] sol2Arr2 = {1, 2, 3, 4, 5, 6}; int sol2Int2 = 5;
        int[] sol2Arr3 = {1, 2, 3}; int sol2Int3 = 3;

        System.out.println(solution2(sol2Arr1, sol2Int1));
        System.out.println(solution2(sol2Arr2, sol2Int2));
        System.out.println(solution2(sol2Arr3, sol2Int3));




    }

    public static void printDoubleArray(int[][] data){
        for (int i = 0; i < data.length; i++) {
            for (int k = 0; k <data[i].length ; k++) {
                System.out.print(data[i][k] + ", ");
            }
            System.out.println();
        }
    }

    /*
    https://school.programmers.co.kr/learn/courses/30/lessons/120842
    2차원으로 만들기
    [1, 2, 3, 4, 5, 6, 7, 8]	2	        => [[1, 2], [3, 4], [5, 6], [7, 8]]
    [100, 95, 2, 4, 5, 6, 18, 33, 948]	3	=> [[100, 95, 2], [4, 5, 6], [18, 33, 948]]

    입력받은 배열과 숫자가 있는데 숫자를 일정 배열 단위로 묶어서 저장해서 리턴하면 된다.

     */

    public static int[][] solution1(int[] num_list, int n) {
        int[][] answer = {};
        List<Integer> intList = new ArrayList<Integer>();
        for (int num: num_list) {
            intList.add(num);
        }

        answer = new int[intList.size()/n][n];
        int index = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int k = 0; k < answer[i].length; k++) {
                answer[i][k] = intList.get(index);
                index +=1;
            }
        }

        return answer;
    }


    /* https://school.programmers.co.kr/learn/courses/30/lessons/120843
    공던지기
    머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
    공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
    친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
    k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.

    이동숫자 K가 배열의 숫자보다 많을경우, 배열카운트를 앞에서 부터 다시 다시 카운트 해야하는데,
    (예> 배열사이즈3, 이동카운트 5 => 1, 3, 2, 1, 3 )
    배열숫자를 계속 순회하기보다 이동카운트 수만큼 리스트를 배열사이즈에 맞게 반복생성하여 총 이동카운트를 리스트에서 뽑아내도록 한다.
    (예> 리스트사이즈 3*5 = 15, 이동카운트 = (이동카운트5 * 2) = 10, 리스트의 10번째값
     */

    public static int solution2(int[] numbers, int k) {
        int answer = 1;

        int numLength = numbers.length * (k*2);

        List<Integer> intList = new ArrayList<Integer>();
        for (int m = 0; m < numLength; m++) {
            for (int i = 0; i < numbers.length; i++) {
                intList.add(numbers[i]);
            }
        }
        answer = intList.get((k*2)-2);
        return answer;
    }


}
