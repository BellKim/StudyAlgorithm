package org.example.SINCE2024.LV0;

import java.util.Arrays;

public class LV0_20240706 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};//	[1, 4, 12, 14, 15]



    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/181853
        뒤에서 5등까지

        리스트로 저장하여 정렬후 5개를 별도로 뽑아서 리턴한다. ㄴ

     */


    public static int[] solution(int[] num_list) {
        int answer[] = new int[5];
        Arrays.sort(num_list);

        for(int i=0; i<5; i++)
        {
            answer[i] = num_list[i];
        }
        return answer;
    }


}
