import java.io.*;

import java.util.*;


public class PickingNumbers {
    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> nums = new ArrayList<>();

        //result 카운트
        int resultcount = 0;

        //리스트 내의 카운트
        int listcount = 0;
        // 1 1 2 2 2 3 5
        // 1 3 3 4 5 6
        // 1    3 3 4    5  6

        result.add(new ArrayList<>());
        result.get(0).add(a.get(0));


//        for(int sortNum : a){
        for(int i=1; i<a.size(); i++){

            if(Math.abs(result.get(resultcount).get(listcount)-a.get(i))==0 || Math.abs(result.get(resultcount).get(listcount)-a.get(i))==1){//다음 숫자가 0, 1 까지 차이날때
                result.get(resultcount).add(a.get(i)); //0

            } else if(Math.abs(result.get(resultcount).get(listcount)-a.get(i)) >= 2){ //다음숫자가 3이상 차이날때
                //리스트 카운트 증가.
                resultcount++;
                //result내에 선언되는 list를 추가 선언해준다.
                result.add(new ArrayList<>());
                //다음 리스트에서 스타트 카운트를 0으로 초기화 해준다.
                result.get(resultcount).add(a.get(i));
            }
        }
        int checkmax = 0;
        
        for(int i=0; i<result.size(); i++) {
            if(checkmax < result.get(i).size()) {
            	checkmax =result.get(i).size();
            }
        }





        return checkmax;
    }
    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>();
        a.add(4); a.add(6); a.add(5); a.add(3); a.add(3); a.add(1);
                // 465331
                // 1 3 3 4 5 6
                // 1    3 3 4    5  6
        
//        a.add(1); a.add(2); a.add(2); a.add(3); a.add(1); a.add(2);
        int result = pickingNumbers(a);
        
        System.out.println(result);


    }
}