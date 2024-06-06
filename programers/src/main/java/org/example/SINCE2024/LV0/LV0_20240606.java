package org.example.SINCE2024.LV0;

public class LV0_20240606 {

    public static void main(String[] args) {

        int[] array1 = {7, 77, 17};	//4
        int[] array2 = {10, 29};	//0

        System.out.println(solution1(array1));
        System.out.println(solution1(array2));

    }

    /*    https://school.programmers.co.kr/learn/courses/30/lessons/120912
        7의 개수
        머쓱이는 행운의 숫자 7을 가장 좋아합니다.
        정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

        주어진 배열 내에 숫자로 주어지는 모든 자리수에 7일 하나라도 들어있으면 업카운트 해준다.

     */


    public static int solution1(int[] array) {
        int answer = 0;

        for (int val: array) {
            String[] getNum = String.valueOf(val).split("");
            for(String val2: getNum){
                if(val2.equals("7")){
                    answer += 1;
                }
            }
        }
        return answer;
    }




}
