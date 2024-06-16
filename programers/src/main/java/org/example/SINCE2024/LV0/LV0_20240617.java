package org.example.SINCE2024.LV0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LV0_20240617 {
    public static void main(String[] args) {
        int[] numlist1 = {1, 2, 3, 4, 5, 6};	            int n1 = 4;	    //  [4, 5, 3, 6, 2, 1]
        int[] numlist2 = {10000,20,36,47,40,6,10,7000};	    int n2 = 30;    //	[36, 40, 20, 47, 10, 6, 7000, 10000]
        int[] numlist3 = {5};	                            int n3 = 5;    //	[36, 40, 20, 47, 10, 6, 7000, 10000]

//        10000,20,36,47,40,6,10,7000
//      sort
//        6, 10, 20, (30) ,36, 47, 7000, 10000
//            30 36 20 47 10 6 7000 10000

//[36,40,47,20,10,6,7000,10000]이 기댓값
//[36,40,20,47,10,6,7000,10000]과 다릅니다.



//        printarr(solution1(numlist1, n1));
//        printarr(solution1(numlist2, n2));
        printarr(solution1(numlist3, n3));


    }

    public static void printarr(int[] num){
        System.out.println("print 시작");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();
    }



    /*  https://school.programmers.co.kr/learn/courses/30/lessons/120880
        특이한 정렬

        정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
        이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
        정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

        자연수 n 을 기준으로 주어진 배열과 가까운 수 부터 순차적으로 정렬하여 리턴해야한다.
        수와의 차이가 동일할 경우,  더 큰수가 우선 배치되어야 한다.

        1. 배열을 리스트화 한다.
        2. 리스트 항목을 정렬한다.
        3. 주어진수 n과 제일 가까운 수를 판별한다. (기준을 할 수 있는 numlist 의


     */


    public static int[] solution1(int[] numlist, int n) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            list.add(numlist[i]);
        }

        List<Integer> resultList = new ArrayList<>();

        Collections.sort(list);

        //기준 리스트 값을 정한다.
        //선정된 기준 리스트 번호를 가지고 번호 +1, -1 을 각각 비교한다.
        //비교해서 선택된 값은 제거한다. (list.remove(i))
        int referenceValueMax = 0;
        int referenceValueMin = 0;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >= n){
                referenceValueMax = i;
                resultList.add(list.get(referenceValueMax));
                list.remove(referenceValueMax);
                break;
            }else{

            }
        }

        //기준 배열 번호보다 큰것, 작은것을 비교
        // 보다큰것, 보다 작은것과의 차이가 [작은것을] 값에 등록, 해당 배열을 지워준다.
        // 보다큰것 보다 작은것중에서 리스트의 최대 최소값이 초과할경우 비교를 하지 않도록 한다.


        int maxListSize = list.size();

        while(true){

            maxListSize = list.size();
            //비교할 배열이 없을경우 while 문 탈출
            if(list.size() == 0){
                break;
            }

            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) >= n){
                    referenceValueMax = i;
                    referenceValueMin = i-1;
                    break;
                }else{
                    System.out.println("기준값보다 작은수 시작" + i + " , " + list.get(i));
                    referenceValueMin = 0;
                    referenceValueMin = i;
                }
            }

            int ref1 = 0;
            int ref2 = 0;
            if(referenceValueMax < maxListSize){ //리스트 최대값을 초과하지 않았을경우
                ref1 = Math.abs(list.get(referenceValueMax) - n);
            }else{
                ref1 = -1;
            }

            if(referenceValueMin >= 0){   //리스트번호 마이너스 판별
                ref2 = Math.abs(n - list.get(referenceValueMin));
            }else{
                ref2 = -1;
            }


            if((ref1 != -1 && ref2 != -1) && (ref1 < ref2)){

                resultList.add(list.get(referenceValueMax));

                list.remove(referenceValueMax);

            }else if((ref1 != -1 && ref2 != -1) && (ref1 > ref2)){

                resultList.add(list.get(referenceValueMin));

                list.remove(referenceValueMin);

            }else if((ref1 != -1 && ref2 != -1) && (ref1 == ref2)){

                resultList.add(list.get(referenceValueMax));

                list.remove(referenceValueMax);

            }else{
                if(ref1 != -1){
                    resultList.add(list.get(referenceValueMax));
                    list.remove(referenceValueMax);
                }
                if(ref2 != -1){
                    resultList.add(list.get(referenceValueMin));
                    list.remove(referenceValueMin);
                }
            }


            // 1루틴 종료후 초기화
            referenceValueMax = 0;
            referenceValueMin = 0;
            ref1 = 0;
            ref2 = 0;





        }

        //최종정답 answer 입력
        answer =  new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = (int)resultList.get(i);
        }


        return answer;
    }



    @Test
    public void test1() {

    }

}
